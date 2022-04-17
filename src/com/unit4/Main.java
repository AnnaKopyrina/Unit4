package com.unit4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");
        proverkachisla();
    }

    public static void proverkachisla() {
        int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12));
            System.out.print(" " + array[i]);
        }
        int chislo;
        int ad = 0, ad2 = 0;
        Scanner vvodchisla = new Scanner(System.in);
        System.out.println("\nВведите число для поиска в массиве: ");
        chislo = vvodchisla.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (chislo == array[i]) {
                ad++;
            }
        }
        if (ad > 0) {
            System.out.println("Данное число есть в массиве");
        } else {
            System.out.println("Данного числа нет в массиве");
        }

        System.out.println("\nВведите число для удаления из массива: ");
        int chislo2;
        int[] newArr = null;
        Scanner vvodchisla2 = new Scanner(System.in);
        chislo2 = vvodchisla2.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (chislo2 == array[i]) {
                ad2++;
            }
        }
        if (ad2 > 0) {

            int[] result = new int[array.length - 1];
            System.arraycopy(array, 0, result, 0, chislo2);

            System.arraycopy(array, chislo2 + 1, result, chislo2, array.length - chislo2 - 1);
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("Данного числа для удаления нет в массиве");
        }

    }
}

