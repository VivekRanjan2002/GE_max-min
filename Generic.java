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
    private  static <T extends Comparable<T>> T testMaximumAmongAll(T[]values){
        T  res=values[0];
        for(int i=0;i<values.length;i++) {
            if (res.compareTo(values[i]) < 0) res = values[i];
        }
        return res;

    }

    /*
    @desc: print maximum
    @param:  type
     */
    private void printMax(T a){
        System.out.println("Maximum among all : " + a);
    }

    /*
    @desc: print maximum among all type array by internally calling testMaximumAmongAll and printMax method
     */

    public void maximumAmongAll(){
        T res= testMaximumAmongAll(values);
        this.printMax(res);
    }

}