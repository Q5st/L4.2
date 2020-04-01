package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
        System.out.println("Enter number");
        num = scanner.nextInt();
        } while ( num < 1 || num > 7);
        num-=1;
        String day[] = {"Monday, Понеділок, Понедельник", "Tuesday, Вівторок, Вторник", "Wednesday, Середа, Среда", "Thursday, Четвер, Четверг" , "Friday, П'ятниця, Пятница", "Satuday, Субота, Субота", "Sunday, Неділя, Воскресенье"};
        for (int i=0; i<7; i++){ //забыл про switch
            if (i==num) {
                System.out.println(day[i]);
                break;
            }
        }
    }
}
