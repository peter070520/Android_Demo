package com.example.javalib;

public class name {
    public static void main (String[] args)
    {

        System.out.print("hello words");
        System.out.println();
        System.out.print("chao cac ban");
        System.out.println();
        int a = 5;
        if (a == 9) {
            System.out.print("sai");
        } else {
            System.out.println("dung");
        }
        String thang = " bay ";
        switch (thang) {
            case " mot ":
                System.out.println("thang mot");
                break;
            case " hai ":
                System.out.println("thang hai");
                break;
            case " ba ":
                System.out.println("thang ba");
                break;
            case " bon ":
                System.out.println("thang bon ");
                break;
            default:
                System.out.println(" khong co thang nao dung ");
        }

        int b = 1;
        while (b < 10) {
            b++;
            System.out.println("" + b);
        }
        for (int c = 1; c < 10; c++) {
            System.out.println(c);
        }
        String name = "Tien dep trai";
        System.out.println(name);
        int aa = 10;
        int bb = 20;
        System.out.println(aa > bb);
        char i = 65;
        System.out.println(i);

        String T = "she gone out of my life";
        System.out.println("the length of T is: " + T.length());

        String[] cars = {"mer", "BMW", "renaut"};
        int[] number = {10, 20, 30};
        System.out.println(cars[2]);
        System.out.println(number[2]);
        System.out.println(cars.length);

        for (int m = 0; m < cars.length; m++) {
            System.out.println(cars[m]);
        }
        int[] k = {1, 2, 3, 4};
        int[][] ii = {{11, 22, 33, 44}, {111, 222, 333, 444}, {55, 66, 77, 88}};
        System.out.println(ii[1][2]);
        for (int n = 0; n < ii.length; n++) {
            for (int s = 0; s < ii[n].length; s++) {
                System.out.println(ii[n][s]);

            }

        }

        



























































        }

    }