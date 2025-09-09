package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Programa para crear un ciclo
        //Y crear un menu de opciones
        Integer opcionSelecionada = 0;
        while (opcionSelecionada != 5) {
            System.out.println("Menu de opciones");
            System.out.println("*****************");
            System.out.println("Digita 1 para sumar➕");
            System.out.println("Digita 2 para restar➖");
            System.out.println("Digita 3 para multiplicar✖");
            System.out.println("Digita 4 para dividir➗");
            System.out.println("Digita 5 para SALIR DEL PROGRAMA😴");
            Scanner leerTeclado = new Scanner(System.in);
            System.out.println("Selecciona una opcion por favor: 🤗");
            opcionSelecionada = leerTeclado.nextInt();


            //Evaluando caminos segun la opcion del usuario:
            if (opcionSelecionada== 1) {
                System.out.println("Sumando...");
            } else if (opcionSelecionada== 2) {
                System.out.println("Restar...");
            } else if (opcionSelecionada== 3) {
                System.out.println("Multiplicando...");
            } else if (opcionSelecionada== 4) {
                System.out.println("Dividiendo...");
            } else if (opcionSelecionada==5) {
                System.out.println("Saliendo...");
            }else{
                System.out.println("Opcion invalida...");
            }
        }
    }
    }