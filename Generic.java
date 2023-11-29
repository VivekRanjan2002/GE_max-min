package com.example.maxMin;


public  class Generic<T extends Comparable<T>>{
        private T [] values;

        Generic(T ...arr){
         values= arr;
        }
     /*
   @desc: private generic method to compute max among any no. of types
   @param: array of types
   @return: maximum type
    */
    public  static <T extends Comparable<T>> T testMaximumAmongAll(T[]values){
        T  res=values[0];
        for(int i=0;i<values.length;i++) {
            if (res.compareTo(values[i]) < 0) res = values[i];
        }
        return res;

    }
/*
@desc: print maximum among all types
@param: array of types
 */
        public void maximumAmongAll(){
            System.out.println("Maximum among all : "+testMaximumAmongAll(values));
        }

    }

