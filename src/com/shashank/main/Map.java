package com.shashank.main;

import java.util.HashMap;

public class Map {

     public static void hmap(){

         HashMap<Integer,Integer> m=new HashMap<>();
      m.put(0,1); // addvalue
      System.out.println(m.size()); //get

       for(HashMap.Entry<Integer,Integer> e:m.entrySet()){

        System.out.print(e+" ");
        System.out.println();
        System.out.print(e.getKey()+" ");
        System.out.println();
        System.out.print(e.getValue()+" ");

    }

     }

}
