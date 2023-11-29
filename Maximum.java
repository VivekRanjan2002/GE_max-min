package com.example.maxMin;

import java.util.Scanner;

public class Maximum {


        public static void main(String[] args) {
           Generic G1= new Generic(3,4,1,8,9,11,7);
           G1.maximumAmongAll();

           Generic G2= new Generic(1.2f,3.4f,5.6f,8.9f);

                G2.maximumAmongAll();
                Generic G3= new Generic("Apple","Peach","Banana");
                G3.maximumAmongAll();
                Generic G4= new Generic("Apple","Peach","Banana","Orange");
                G4.maximumAmongAll();
        }
        
}

