package com.shashank.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayLIst {


    public static void arryalist() {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);//insert
        nums.add(1,2);//insert with index
        nums.add(2,3);
        nums.remove(2);
        System.out.println(nums.get(0));
        nums.set(1,3);// update
        System.out.println(  nums.contains(3));

        for(int x:nums){
            System.out.print(x);
        }
        System.out.println();
        Collections.sort(nums,Collections.reverseOrder());


        for(int x:nums){
            System.out.print(nums.size());
        }

    }


}
