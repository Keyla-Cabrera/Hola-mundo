package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String respuesta = "s";
        while (respuesta.equalsIgnoreCase( "S")){
            System.out.println("While");
            System.out.println("Desea seguir s/n?");
        }
    }
}
