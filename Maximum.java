package com.example.maxMin;

import java.util.Scanner;

public class Maximum {
        public static void main(String[] args) {

                maximum(3,4,1);
                maximum(1.2f,3.4f,5.6f);
                maximum("Apple","Peach","Banana");
        }

        /**
         * @desc: compute the maximum among three Comparable objects
         * @param: T a, b, c (where T extends Comparable<T>)
         * @return: Maximum of three Comparable objects
         */
        public static <T extends Comparable<T>> void maximum(T a, T b, T c) {
          T res=a;
          if(b.compareTo(a)>0) res=b;
          if(c.compareTo(b)>0) res=c;
                System.out.println("Maximum among " +a +", "+ b+" and "+c +" is: "+ res);
        }
}
