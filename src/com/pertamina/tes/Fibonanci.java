package com.pertamina.tes;

import java.util.Scanner;

public class Fibonanci {
    public static void main(String[] args) {
        int x = 1, y = 1, z = 1;
        System.out.print("Masukan jumlah bilangan fibonacci = ");
        Scanner in = new Scanner(System.in);
        int jumlah  = in.nextInt();
        for (int i = 0; i < jumlah; i++){
            System.out.print(z + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}
