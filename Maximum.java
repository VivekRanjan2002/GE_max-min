package com.example.maxMin;

import java.util.Scanner;

public class Maximum{
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter first Integer:");
        Integer a=new Integer(sc.nextInt());
        System.out.println("Please Enter second Integer:");
        Integer b=new Integer(sc.nextInt());
        System.out.println("Please Enter third Integer:");
        Integer c=new Integer(sc.nextInt());
        System.out.println("Maximum among three Integer is:"+ maximumInteger(a,b,c));

                System.out.println("Please Enter first Float:");
                Float af=new Float(sc.nextFloat());
                System.out.println("Please Enter second Float:");
                Float bf=new Float(sc.nextFloat());
                System.out.println("Please Enter third Float:");
                Float cf=new Float(sc.nextFloat());
                System.out.println("Maximum among three Float is:"+ maximumFloat(af,bf,cf));

        }
        /*
        @desc: compute  the maximum Integer among three Integer
        @param: Integer a,b,c
        @return : int value of Integer
         */
        public static int  maximumInteger(Integer a,Integer b,Integer c){
        if(a.compareTo(b)>=0 && a.compareTo(c)>=0)return a.intValue();
        else if(b.compareTo(a)>=0 && b.compareTo(c)>=0)return b.intValue();
        else return c.intValue();

        }
        /*
      @desc: compute  the maximum Float among three Float
      @param: Float a,b,c
      @return : float value of maximum Float
       */
        public static float  maximumFloat(Float a,Float b,Float c){
                if(a.compareTo(b)>=0 && a.compareTo(c)>=0)return a.floatValue();
                else if(b.compareTo(a)>=0 && b.compareTo(c)>=0)return b.floatValue();
                else return c.floatValue();

        }
        }