package com.utc;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class BancoSoporte {

	public static void main(String[] args) {
				
		Queue<Clientes> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
		
        while (op != 4) {
            System.out.println("\n--- SISTEMA DE SOPORTE DEL BANCO ---");
            System.out.println("1. Agregar cliente a la fila");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién es el siguiente (sin atenderlo)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
            case 1:
                //registra cliente
                System.out.print("Ingrese el nombre del cliente: ");
                String nombre = sc.nextLine();
                
                System.out.print("Ingrese ID/Ticket: ");
                int id = sc.nextInt();
                sc.nextLine(); 
                
                System.out.print("Ingrese motivo de consulta: ");
                String motivo = sc.nextLine();
                
                //se crea el objeto y se agrega a la cola con add()
                Clientes nuevoCliente = new Clientes(nombre, id, motivo);
                fila.add(nuevoCliente);
                System.out.println("Cliente agregado a la fila exitosamente.");
                break;
                
            case 2:
                //extrae y elimina al primer elemento de la cola
                if (!fila.isEmpty()) {
                    Clientes atendido = fila.poll();
                    System.out.println("Atendiendo a: " + atendido.getNombre() + " (Ticket: " + atendido.getId() + ")");
                } else {
                    System.out.println("La fila está vacía, no hay clientes por atender.");
                }
                break;

            case 3:
                //muestra al primer elemento sin eliminarlo
                if (!fila.isEmpty()) {
                    Clientes siguiente = fila.peek();
                    System.out.println("El siguiente en la fila es: " + siguiente.toString());
                } else {
                    System.out.println("La fila está vacía.");
                }
                break;

            case 4:
                System.out.println("Cerrando el sistema...");
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        sc.close();
	}
}


