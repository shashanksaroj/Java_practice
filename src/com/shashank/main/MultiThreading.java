package com.shashank.main;

public class MultiThreading {




    public static class multiThreadingThing extends Thread {



        public void run(){

            for(int i=0;i<5;i++) {
                System.out.println(i);


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }





    }



}
