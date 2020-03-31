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
        String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satuday", "Sunday"};//забыл про switch
        for (int i=0; i<7; i++){
            if (i==num) {
                System.out.println(day[i]);
                break;
            }
        }
    }
}
