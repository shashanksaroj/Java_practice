package com.shashank.main;

import java.util.Arrays;
import java.util.Collections;

public class array {

    public static void ArrayImplemenataion(){

     Integer[] a=new Integer[5];

     a[0]=0;


     int n= a.length;
     for(int i=0;i<n;i++){

         a[i]=i;
        }

        for(int i=0;i<n;i++){

    System.out.println(a[i]);
        }


        Arrays.sort(a,Collections.reverseOrder());

        for(int i=0;i<n;i++){

            System.out.println(a[i]);
        }


    }


}
