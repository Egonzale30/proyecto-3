/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajocuatro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Trabajocuatro {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
    }


    public static void ejercico1() {

        Scanner lec = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Consultar estudiante");
            System.out.println("3. Modificar nombre");
            System.out.println("4. Modificar telefono");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.print("Digite una opcion: ");

            opcion = lec.nextInt();
            lec.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Digite nombre: ");
                    String nombre = lec.nextLine();

                    System.out.print("Digite telefono: ");
                    String telefono = lec.nextLine();

                    lista.add(new Estudiante(nombre, telefono));
                    System.out.println("Estudiante registrado.");
                    break;

                case 2:
                    System.out.print("Digite nombre a consultar: ");
                    String buscar = lec.nextLine();
                    boolean encontradoConsulta = false;

                    for (Estudiante e : lista) {
                        if (e.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.println("Nombre: " + e.getNombre());
                            System.out.println("Telefono: " + e.getTelefono());
                            encontradoConsulta = true;
                        }
                    }

                    if (!encontradoConsulta) {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite nombre actual: ");
                    String nombreActual = lec.nextLine();
                    boolean encontradoNombre = false;

                    for (Estudiante e : lista) {
                        if (e.getNombre().equalsIgnoreCase(nombreActual)) {
                            System.out.print("Digite nuevo nombre: ");
                            String nuevoNombre = lec.nextLine();
                            e.setNombre(nuevoNombre);
                            System.out.println("Nombre actualizado correctamente.");
                            encontradoNombre = true;
                        }
                    }

                    if (!encontradoNombre) {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite nombre del estudiante: ");
                    String nombreTel = lec.nextLine();
                    boolean encontradoTelefono = false;

                    for (Estudiante e : lista) {
                        if (e.getNombre().equalsIgnoreCase(nombreTel)) {
                            System.out.print("Digite nuevo telefono: ");
                            String nuevoTelefono = lec.nextLine();
                            e.setTelefono(nuevoTelefono);
                            System.out.println("Telefono actualizado correctamente.");
                            encontradoTelefono = true;
                        }
                    }

                    if (!encontradoTelefono) {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite nombre a eliminar: ");
                    String eliminar = lec.nextLine();

                    boolean eliminado = lista.removeIf(e -> 
                        e.getNombre().equalsIgnoreCase(eliminar));

                    if (eliminado) {
                        System.out.println("Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 6:
                    if (lista.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        System.out.println("\nLista de estudiantes:");
                        for (Estudiante e : lista) {
                            System.out.println("Nombre: " + e.getNombre());
                            System.out.println("Telefono: " + e.getTelefono());
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 7);

        lec.close();
    }
    
    
    // Clase Estudiante
     class Estudiante {
         private String nombre;
        private String telefono;

        public Estudiante(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(String telefono) {  
            this.telefono = telefono;
    }
   } 
     
     public static void ejercico2(){
       
         
        Scanner dat = new Scanner(System.in);

        int totalBoletas = 20; // Cantidad total
        int vendidas = 0;

        ArrayList<String> cedulas = new ArrayList<>();
        ArrayList<Integer> cantidadComprada = new ArrayList<>();

        while (totalBoletas > 0) {

            System.out.println("\nBoletas disponibles: " + totalBoletas);
            System.out.print("Digite su número de cédula: ");
            String cedula = dat.nextLine();

            int posicion = cedulas.indexOf(cedula);

            if (posicion != -1) { // ya existe

                int compradas = cantidadComprada.get(posicion);

                if (compradas == 4) {
                    System.out.println("Ya alcanzó el límite de 4 boletas. Venta rechazada.");
                } else {
                    System.out.print("¿Cuántas boletas desea comprar? ");
                    int cantidad = dat.nextInt();
                    dat.nextLine();

                    if (compradas + cantidad > 4) {
                        cantidad = 4 - compradas;
                        System.out.println("Solo puede comprar " + cantidad + " boletas más.");
                    }

                    if (cantidad > totalBoletas) {
                        cantidad = totalBoletas;
                    }

                    cantidadComprada.set(posicion, compradas + cantidad);
                    totalBoletas -= cantidad;
                    vendidas += cantidad;

                    System.out.println("Compra realizada con éxito.");
                }

            } else { // no existe

                System.out.print("¿Cuántas boletas desea comprar? ");
                int cantidad = dat.nextInt();
                dat.nextLine();

                if (cantidad > 4) {
                    cantidad = 4;
                    System.out.println("Solo puede comprar máximo 4 boletas.");
                }

                if (cantidad > totalBoletas) {
                    cantidad = totalBoletas;
                }

                cedulas.add(cedula);
                cantidadComprada.add(cantidad);

                totalBoletas -= cantidad;
                vendidas += cantidad;

                System.out.println("Compra realizada con éxito.");
            }

            System.out.println("Total vendidas: " + vendidas);
            System.out.println("Boletas disponibles: " + totalBoletas);
        }

        System.out.println("\nBoletas agotadas. Venta finalizada.");
        dat.close();
    }
     
}     


      