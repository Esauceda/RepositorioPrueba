package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado=new Scanner(System.in);
        int numero1, numero2, suma;
        System.out.println("Ingrese el Numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el Numero 2: ");
        numero2 = teclado.nextInt();
        suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

    }
}
