package com.mycompany.trucocalcular;

import java.util.Scanner;

public class Tip_Calculater {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t¡Bienvenido al Calculador de Propinas!");
        System.out.println("\nIngresa el monto total de la cuenta: ");
        int bill = scan.nextInt();
        System.out.println("¿Cuánta propina te gustaría dejar? ");
        int tip = scan.nextInt();
        System.out.println("¿Entre cuántas personas se dividirá la cuenta? ");
        int person = scan.nextInt();

        int total = bill + tip;
        int per_person = total / person;

        System.out.println("El total de la cuenta es: ₹" + total);
        System.out.println("Cada uno debe pagar: ₹" + per_person);
    }

}
