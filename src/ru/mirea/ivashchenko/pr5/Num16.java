package ru.mirea.ivashchenko.pr5;

import java.util.Scanner;

public class Num16 {
    public static void recursion(int max, int count) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            }
            else if (n == max) {
                recursion(max, ++count);
            }
            else {
                recursion(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0);
    }
}
