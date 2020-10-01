package ru.mirea.ivashchenko.pr5;

import java.util.Scanner;

public class Num14 {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else{
            System.out.println(n%10);
            return recursion(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(recursion(n));
    }
}
