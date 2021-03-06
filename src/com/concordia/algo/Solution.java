package com.concordia.algo;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
int count =0;
boolean isprint = true;
int first = 1;
int second = 2;
int third = 3;

        for(int i=0;i< q.length-1;i++){
            
             if (q[i] == first) {
            first = second;
            second = third;
            third++;
             }else if(q[i]== second){
                 second = third;
                 third++;
                 count++;
             }else if(q[i]==third){
                 third++;
                 count++;
                 count++;
             }else{
                 isprint = false;
             }
        }

            // if((q[i-1]-q[i]) > 2){
            //     System.out.println("Too chaotic");
            //     isprint = false;
            //     break; 
            // }else if((q[i-1]-q[i])==1){
            //     count++;
            // }else if((q[i-1]-q[i])==2){
            //     count+=2;
            // }
            
        //}
        if(isprint){
    System.out.println(count);
        }else{
            System.out.println("Too chaotic");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
