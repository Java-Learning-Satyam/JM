package dev.lpa;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter t....");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int previous = 0;
            previous += a + (int) Math.pow(t,i) * b;
            int ans  = a + (int) Math.pow(t,i) * b + previous;
            System.out.print(ans);
        }

        in.close();
    }
}

// a const  + i * b