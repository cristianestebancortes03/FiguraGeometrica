package com.mycompany.figurageometrica;

import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");

        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura (circulo, rectangulo, triangulo): ");
        String tipoFigura = scanner.nextLine().toLowerCase();

        FiguraGeometrica figura = null;

        switch (tipoFigura) {
            case "circulo":
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;

            case "rectangulo":
                System.out.print("Ingrese el valor del lado 1 del rectángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Ingrese el valor del lado 2 del rectángulo: ");
                double lado2 = scanner.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;

            case "triangulo":
                System.out.print("Ingrese el valor de la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese el valor de la altura del triángulo: ");
                double altura = scanner.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                System.out.println("Opción no válida. Por favor, ingrese circulo, rectangulo o triangulo.");
                break;
        }

        if (figura != null) {
            System.out.println("El área de " + figura.getNombre() + " es: " + figura.obtenerArea());
            System.out.println("El perímetro de " + figura.getNombre() + " es: " + figura.obtenerPerimetro());
        }

    }

}








// Debe crear un menú de opciones en consola, con los siguientes requerimientos://////////////////////////////////////
//  1) Imprimir el mensaje: “Ingrese el nombre de la figura”./////////////////////////////////////////////////////////
//  2) Leer el nombre de la figura.///////////////////////////////////////////////////////////////////////////////////
//3) Imprimir el mensaje: “Ingrese el color de la figura”.////////////////////////////////////////////////////////////
//4) Leer el color de la figura.//////////////////////////////////////////////////////////////////////////////////////
//5) Imprimir el mensaje: “Ingrese el tipo de figura”.////////////////////////////////////////////////////////////////
//6) Leer el tipo de figura ingresado por el usuario (1: Circulo, 2: Rectángulo, 3:Triángulo).
//7) Dependiendo del tipo de figura, debe solicitar las variables de los datos necesarios para cada figura:
//a) Para el círculo:
//i) Imprimir el mensaje: “Ingrese el radio del círculo”.
//b) Para el rectángulo:
//i) Imprimir el mensaje: “Ingrese el valor del lado 1 del rectángulo”.
//ii) Imprimir el mensaje: “Ingrese el valor del lado 2 del rectángulo”.
//c) Para el triángulo:
//i) Imprimir el mensaje: “Ingrese el valor de la base del triángulo”.
//ii) Imprimir el mensaje: “Ingrese el valor de la altura de triángulo”.
//7.1) Para todos los casos, debe crear un objeto de la clase correspondient(Círculo, Rectángulo y Triángulo).
//d) En este punto ya tendrá todos los valores para llamar el constructor de cada clase (recuerde que ya debe haber leído el nombre de la
// figura en el paso 2 y el color de la figura en el paso 4).
//8) Finalmente, imprimir en consola la respectiva área y perímetro de la figura seleccionada.
