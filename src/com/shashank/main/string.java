package com.shashank.main;

public class string {


    public static void stringImplementation(){


        String x;

        x="arju";


        for(int i=0;i<x.length();i++) {
            System.out.print(x.charAt(i));

        }

        System.out.println();
        System.out.print(x.substring(0,3));

        System.out.println();

        x="ar j   u";

        String[] splitsn=x.split("  ");

        for(int i=0;i<splitsn.length;i++) {
            System.out.println(splitsn[i]);

        }


        String num="123";


    int numu=Integer.parseInt(num);
        System.out.println(numu);

             String z=    String.valueOf(numu);
        System.out.println(z.toCharArray());


    }

}
