package com.unit4;
import java.util.Scanner;
import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        maxminsr();
        System.out.println("Задание 4");
        dvamas();
    }

    public static void maxminsr() {
        int num, array[];
        Scanner vvodch = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = vvodch.nextInt();
        array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = ((int) (Math.random() * num));
            System.out.print(" " + array[i]);
        }
        int min = array[0] + 1;
        int max = array[0];
        double srznach = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            srznach += array[i];
        }
        srznach/=array.length;
        System.out.println("\nМинимальное: " +min);
        System.out.println("Максимальное: " +max);
        System.out.println("Среднее: " +srznach);
    }

    public static void dvamas() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            array1[i] = (int)(Math.random()*5);
            array2[i] = (int)(Math.random()*5);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        double srznach1 = 0, srznach2 = 0;
        for (int i = 0; i < 5; i++) {
            srznach1 += array1[i];
            srznach2 += array2[i];
        }
        srznach1/=5;
        srznach2/=5;
        System.out.println("Среднее число первого массива " +srznach1);
        System.out.println("Среднее число второго массива " +srznach2);
        if(srznach1 > srznach2){
            System.out.println("Среднее число первого массива > среднего числа второго массива");
        } else if(srznach1 < srznach2){
            System.out.println("Среднее число первого массива < среднего числа второго массива");
        } else {
            System.out.println("Средние числа равны");
        }
    }
}




