package edu.cecade.tareas.app;

import edu.cecade.tareas.modelo.Estudiante;
import edu.cecade.tareas.modelo.Tareas;
import edu.cecade.tareas.servicio.ServicioTareas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ServicioTareas Servicio = new ServicioTareas();

    int opcion;
            System.out.println("-----Menu----: 1");
            System.out.println("Crear tareas: 2");
            System.out.println("Ver tareas: 3");
            System.out.println("Entregar Tarea: 4");
            System.out.println("Salir: 5");

            System.out.print("opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                     System.out.println("ID: ");
                      int id = sc.nextInt();
                      sc.nextLine();

                     System.out.println("Titulo: ");
                     String titulo = sc.nextLine();

                     System.out.println("Descripción: ");
                     String Descripción = sc.nextLine();

                     System.out.println("Fecha de entrega");
                     String fecha = sc.nextLine();

                     System.out.println("nombre del estudiante");
                     String estudiante = sc.nextLine();

                     Tareas tarea = new Tareas (
                     id,titulo,Descripción,fecha,estudiante);


                     Servicio.agregar(tarea);
                     break;

                case 2:
                    Servicio.listar();
                    break;

                case 3:
                    System.out.println("Ingresar ID");
                    int buscar = sc.nextInt();
                    Servicio.entregar(buscar);
                    break;

                case 4:
                    Servicio.porcentaje();
                    break;

                case 5:
                    System.out.println("Programa finalizado");
            }
      }
}
