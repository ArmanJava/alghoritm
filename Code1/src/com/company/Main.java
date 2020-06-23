package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        1) Описать простейшие алгоритмы
//          1.1 Возведение в степень (*используя чётность степени)
//          1.2 Поиск минимального элемента в массиве
//          1.3 Нахождение среднего арифметического массива
//        2) Подсчитать сложность описанных алгоритмов
//        3) Какие правила подсчёта применялись, оставьте комментарии в коде



        //          1.1 Возведение в степень (*используя чётность степени)
        //           Сложность O(N*K)
        // Применялись правила подсчёта количества операций над числом
        int[] myArray = new int[10];
        for (int i = 0; i <10 ; i++) {
            myArray[i]=i+1;

        }
        double res=0.0;
        if(myArray.length%2==0) {
        for (int i = 0; i <4;i++) {

                for (int j = 0; j < myArray.length ; j++) {
                    //System.out.println("Число 4 в четной степени " + Math.pow(i, j));
                    res=Math.pow(i, j);
                }
            }
            System.out.println(res);

        }
        //1.2 Поиск минимального элемента в массиве
        //           Сложность O(N2)
        // Применялись правила подсчёта количества операций + сортировка
        int[]myarray2 = new int[10];
        for (int i = 0; i <myarray2.length ; i++) {
            myarray2[i]=i+1;

        }
        Arrays.sort(myarray2);
        System.out.println(myArray[0]);

//          1.3 Нахождение среднего арифметического массива
        // Сложность O(2N)
        int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};

        double average = 0;

            double summa = 0;
            for (int j = 0; j < numbers.length; j++) {
                summa += numbers[j];
            }
            average = summa / numbers.length;
            System.out.println(average);



    }


}
