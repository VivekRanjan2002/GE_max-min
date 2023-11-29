package com.example.maxMin;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter first Number: ");
        Integer a= new Integer(sc.nextInt());
        System.out.println("Please Enter second Number: ");
        Integer b= new Integer(sc.nextInt());
        System.out.println("Please Enter third Number: ");
        Integer c= new Integer(sc.nextInt());
        System.out.println("Maximum among three number is : "+ maximum(a,b,c));


    }
    public static int maximum(Integer a,Integer b,Integer c){
        if(a.compareTo(b)>=0 && a.compareTo(c)>=0) return a.intValue();
        else if(b.compareTo(a)>=0 && b.compareTo(c)>=0) return b.intValue();
        else return c.intValue();

    }
}
