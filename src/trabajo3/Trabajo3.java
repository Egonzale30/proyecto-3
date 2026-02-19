/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Trabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ejercico2();
     
     
    }
    public static void ejercico1() {
    // Escriba un programa que muestre un menú ofreciendo las siguientes opciones.
    
     Scanner dato = new Scanner(System.in);
     int opcion=0; 
     
     while (opcion!=3) {
     System.out.println("1 saludar");
     System.out.println("2 despedirse");
     System.out.println("3salir");
     
     opcion= dato.nextInt();
     
     switch (opcion) {
         
         case 1:
             System.out.print("hola");
         case 2:
             System.out.print("adios");
         case 3:
             System.out.print("salir");
          break;
         
     }
        
         
        }
     
     }
    
     public static void ejercico2() {
    //  Programa que muestre un menú 
     Scanner lec = new Scanner(System.in);
     int opcion=0; 
    
    while (opcion!=5) {
      
      System.out.println("\nSeleccione una opcion:");
      System.out.println("1.Calcular área del cuadrado");
      System.out.println("2.calcular área del circulo");
      System.out.println("3.alcular área del triangulo");
      System.out.println("4.calcular área del rectangulo");
      System.out.println("5.salir");
      
      
      opcion= lec.nextInt();
        
      switch (opcion) {
          
         case 1:
            System.out.println("Digita el lado: ");
            double lado = lec.nextDouble();
            double areaC = lado * lado;
            System.out.println("El area del cuadrado es " + areaC);
            break;
         
         case 2:
             System.out.println("Digite el radio del circulo");
             double radio = lec.nextDouble();
             double radioC = Math.PI*(radio*radio);
             System.out.println("El radio del cuadrado es" + radioC);
             break;
             
         case 3:
             System.out.println("Digite la base del triangulo");
             double base = lec.nextDouble();
             System.out.println("Digite la altura del triangulo");
             double altura = lec.nextDouble();
             double totalT = ( base/ altura)/2;
             System.out.println("El area del triangulo es:" + totalT);
             break;
             
         case 4:
             System.out.println("Digite la base del rectangulo");
             double base1 = lec.nextDouble();
             System.out.println("Digite la altura del rectangulo");
             double altura2 = lec.nextDouble();
             double totalTR = (base1*altura2);
             System.out.println("El area del triangulo es" + totalTR);
             break;
             
         case 5:
             System.out.println("Final");
             break;
             
       }
    }
      
    }
     
 public static void ejercico3() {
    //  Programa que muestre un menú 
     Scanner leer = new Scanner(System.in);
       
        String[] nombres = new String[50];
        double[] mate = new double[50];
        double[] ingles = new double[50];
        double[] espanol = new double[50];

        int contador = 0;
        int opcion = 0;

        while (opcion != 5) {

        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Registrar notas");
        System.out.println("2. Calcular promedio por materia");
        System.out.println("3. Calcular promedio total del curso");
        System.out.println("4. Mostrar aprobados y reprobados");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

        opcion = leer.nextInt();

         switch (opcion) {

        case 1:
        System.out.print("Ingrese nombre del estudiante: ");
         leer.nextLine(); // limpiar buffer
         nombres[contador] = leer.nextLine();

         System.out.print("Nota Inglés: ");
         mate[contador] = leer.nextDouble();

         System.out.print("Nota Matemáticas: ");
         ingles[contador] = leer.nextDouble();

         System.out.print("Nota Español: ");
         espanol[contador] = leer.nextDouble();

         contador++;
         System.out.println("Estudiante registrado correctamente.");
         break;

         case 2:
         double sumaIngles = 0, sumaMate = 0, sumaEspanol = 0;

         for (int i = 0; i < contador; i++) {
             sumaIngles += ingles[i];
             sumaMate += mate[i];
             sumaEspanol += espanol[i];
                    }

         if (contador > 0) {
          System.out.println("Promedio Inglés: " + (sumaIngles / contador));
          System.out.println("Promedio Matemáticas: " + (sumaMate / contador));
          System.out.println("Promedio Español: " + (sumaEspanol / contador));
          } else {
          System.out.println("No hay estudiantes registrados.");
                    }
          break;

         case 3:
         double sumaTotal = 0;

         for (int i = 0; i < contador; i++) {
         sumaTotal += (ingles[i] + mate[i] + espanol[i]) / 3;
                    }

        if (contador > 0) {
         System.out.println("Promedio total del curso: " + (sumaTotal / contador));
         } else {
         System.out.println("No hay estudiantes registrados.");
                    }
         break;

        case 4:
         if (contador == 0) {
         System.out.println("No hay estudiantes registrados.");
         break;
                    }

        System.out.println("\n--- APROBADOS ---");
         for (int i = 0; i < contador; i++) {
         double promedio = (ingles[i] + mate[i] + espanol[i]) / 3;
         if (promedio >= 3.0) {
         System.out.println(nombres[i] + " - Promedio: " + promedio);
                        }
                    }

        System.out.println("\n--- REPROBADOS ---");
        for (int i = 0; i < contador; i++) {
        double promedio = (ingles[i] + mate[i] + espanol[i]) / 3;
        if (promedio < 3.0) {
        System.out.println(nombres[i] + " - Promedio: " + promedio);
                        }
                    }
        break;

        case 5:
        System.out.println("Programa final.");
                    break;

        default:
        System.out.println("Opción inválida.");
            }
        }
  
  
  
  
  }
     public static void jerciio4() {
     //listado hombres y mujeres
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea ingresar? ");
        int cantidad = scan.nextInt();
        scan.nextLine(); // limpiar linea

        String[] nombres = new String[cantidad];
        char[] sexos = new char[cantidad];

        String[] hombres = new String[cantidad];
        String[] mujeres = new String[cantidad];

        int contH = 0;
        int contM = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese nombre: ");
            nombres[i] = scan.nextLine();

            System.out.print("Ingrese sexo (m/f): ");
            sexos[i] = scan.next().charAt(0);
            scan.nextLine(); // limpiar linea

            if (sexos[i] == 'm') {
                hombres[contH] = nombres[i];
                contH++;
            } 
            else if (sexos[i] == 'f') {
                mujeres[contM] = nombres[i];
                contM++;
            } 
            else {
                System.out.println("Sexo inválido.");
            }
        }

        System.out.println("\n--- LISTA DE HOMBRES ---");
        for (int i = 0; i < contH; i++) {
            System.out.println(hombres[i]);
        }

        System.out.println("\n--- LISTA DE MUJERES ---");
        for (int i = 0; i < contM; i++) {
            System.out.println(mujeres[i]);
        }
    }
}

   
   