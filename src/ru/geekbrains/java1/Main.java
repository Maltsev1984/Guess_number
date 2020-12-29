package ru.geekbrains.java1;

import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        GuessTheNumber();
    }

    public static void GuessTheNumber(){
        Scanner in = new Scanner(System.in);

        int a, n = (int)(Math.random()*10);
        System.out.println("Угадай или умри, число лежит от 0 до 9, у тебя 3 трая, смерть наступает на пятки.");
        for (int i = 0; i < 3; i++){
            System.out.println("Попытка " + (i+1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Число больше!");
            if (a > n) System.out.println("Число меньше!");
            if (a == n) {System.out.println("Ты сохранил жизнь!");
                System.out.println("Адский ад имперский угар еще раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) GuessTheNumber();
                else {System.out.println("Спасибо за твой страх!");
                    break;
                }
            }
        }
        System.out.println("Вы не угадали...");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = in.nextInt();
        if (a == 1) GuessTheNumber();
        else {System.out.println("Спасибо за игру!");
        }
    }
}

