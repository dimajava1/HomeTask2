package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите действие:  ");
        System.out.println("Решить квадратное уравнение - 1");
        System.out.println("Вычислить периметр и площадь  прямоугольника- 2");
        System.out.println("Вычислить длину стороны квадрата по периметру - 3");
        int nomer;
        double a, b, c, p, s;
        double Diskremenant;
        Scanner dd = new Scanner(System.in);
        nomer = dd.nextInt();
        Scanner in = new Scanner(System.in);
        switch (nomer) {
            case 1:
//      1)  Написать программу, которая будет вычислять корни квадратного уравнения. Ввод коэффициентов при неизвестных производится при выполнении программы.
                System.out.println("Программа решает квадратное уравнение вида:");
                System.out.println("ax^2 + bx + c = 0");
                System.out.println("Введите a, b и c (в новой строке кажое число):");
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                Diskremenant = b * b - 4 * a * c;
                if (Diskremenant > 0) {
                    double x1, x2;
                    x1 = (-b - Math.sqrt(Diskremenant)) / (2 * a);
                    x2 = (-b + Math.sqrt(Diskremenant)) / (2 * a);
                    System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
                } else if (Diskremenant == 0) {
                    double x;
                    x = -b / (2 * a);
                    System.out.println("Уравнение имеет единственный корень: x = " + x);
                } else {
                    System.out.println("Уравнение не имеет решения!");
                }
                break;
            // 2) Написать программу, которая будет вычислять периметр и площадь для заданного прямоугольника. Ввод сторон прямоугольника производится при выполнении программы.
            case 2:
                System.out.println("Укажите стороны прямоугольника (в новой строчке каждую)");
                a = in.nextDouble();
                b = in.nextDouble();
                p = 2 * (a + b);
                s = a * b;
                System.out.println("Периметр прямоугольника:  " + p);
                System.out.println("Площадь прямоугольника:  " + s);
                break;
            // 3)  Написать программу, которая будет вычислять длину стороны квадрата по периметру. Ввод периметра производится при выполнении программы.
            case 3:
                System.out.println("Введите периметр квадрата ");
                p = in.nextDouble();
                a = p / 4;
                System.out.println("Cторона квадрата =  " + a);
                break;

        }
    }
}