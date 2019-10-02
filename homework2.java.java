package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//homework 5
        var i = 0;
        var x = 0;
        for(var a=0;a<15;a++){
            i = new Random().nextInt(100);

            x+=i;
        }
        x/=15;
        System.out.println("Середнє значення 15 чисел =  "+x);
// homework 4
        System.out.println("homework4");
        var z = 0;
        var c = 0;
        for(var a=0;a<50;a++){
            z = new Random().nextInt(150);
            if(z%7==0){
                c+=z;
                System.out.println(z);
            }

        }
        System.out.println(c+" = suma div on 7");
//homework 3
        var v = new Random().nextInt(150);
        if(v%3==0){
            System.out.println(v+"this number div on 3");
        }else if(v%5==0){
            System.out.println(v+"this number div on 5");
        }else if(v%7==0){
            System.out.println(v+"this number div on 7");
        }else {
            System.out.println(v);
        }
//homework 2
            System.out.println("homework2");
        var f = 0;
        for(var p=0;p<=15;p++){

            if(p%2==0){
                f+=p;
                System.out.println(p);
            }else{
                System.out.println(p+ "not even");
            }

        }
        System.out.println(f);
//homework 1

        System.out.println("homework1");
        var q = 0;
        var w = 'd';
        for (var o =0;o<10;o++){
            //System.out.println(i);
            q = new Random().nextInt(1000);
            w = (char) q;
            System.out.println(w);
        }
    }
}
