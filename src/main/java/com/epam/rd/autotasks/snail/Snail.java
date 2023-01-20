package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int sum=0,count=0;
        if(a<=b && h>a){
            System.out.print("Impossible");
            return;
        }
        while(sum<=h) {
            count++;
            sum += a;
            if (sum == h || sum > h) {
                System.out.print(count);
                break;
            } else
                sum -= b;

        }




    }
}
