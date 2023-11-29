package com.example.maxMin;


public  class Generic<T extends Comparable<T>>{
        private T a;
        private  T b;
        private T c;

        Generic(T a, T b, T c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        /*
        @desc: private generic method to compute max among three same  types
        @param: 3 same types
        @return: maximum type among three
         */
        private static <T extends Comparable<T>> T testMaximum(T a, T b, T c){
            T  res=a;
            if(b.compareTo(a)>0) res=b;
            if(c.compareTo(b)>0) res=c;
            return res;
        }
        /*
        @desc: print maximum among three types
         */

        public void maximum(){
            System.out.println("Maximum among "+ a+ ", "+b+" and "+c+" : "+testMaximum(a,b,c));
        }
    }

