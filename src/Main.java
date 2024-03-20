import figurasGeometricas.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Main.ejemploUnchecked2();
        Main.ejemploChecked2();
    }

    public static void ejemploPolimorfismo(){
        FiguraGeometrica figura;
        // CIRCULO
        figura = new Circulo(5);
        System.out.println("\n" + figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
        // CUADRADO
        figura = new Cuadrado(5);
        System.out.println("\n" + figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
        // RECTANGULO
        figura = new Rectangulo(5, 2);
        System.out.println("\n" + figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
        // TRIANGULO
        figura = new Triangulo(5, 2);
        System.out.println("\n" + figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
        // CUBO
        figura = new Cubo(5);
        System.out.println("\n" + figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
    }

    public static void ejemploTry(){
        try{
            int division = 10/0;
            System.out.println("Resultado: " + division);
        }catch (ArithmeticException e){
            System.out.println("Error aritmetico: " + e.getMessage());
        }finally {
            System.out.println("Bloque finally se ejecuto");
        }
        System.out.println("El programa continua luego del try catch");

    }

    public static void ejemploUnchecked(){
        try{
            String text = null;
            System.out.println(text.length());
        }catch (NullPointerException e){
            System.out.println("Se ha capturado una excepcion NullPointer: " + e.getMessage());
        }
    }

    public static void ejemploChecked(){
        try{
            FileInputStream file = new FileInputStream("archivo.txt");
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }

    public static void ejemploUnchecked2(){
        try{
            Object object = "Texto";
            Integer numero = (Integer) object;
        }catch (ClassCastException e){
            System.out.println("Se ha capturado una excepcion ClassCastException: " + e.getMessage());
        }
    }

    public static void ejemploChecked2(){
        try{
            FileInputStream file = new FileInputStream("archivo.txt");
        }catch (IOException e){
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }

    public static void ejemploCrearArchivo(){
        try{
            File myFile = new File("nuevo-archivo.txt");
            if(myFile.createNewFile()){
                System.out.println("Archivo creado: " + myFile.getName());
            }else {
                System.out.println("El archivo ya existe.");
            }
        }catch (IOException e){
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }
    }

    public static void ejemploLeerArchivo() throws FileNotFoundException {
        FileReader fileReader = new FileReader("nuevo-archivo.txt");
        try(BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}