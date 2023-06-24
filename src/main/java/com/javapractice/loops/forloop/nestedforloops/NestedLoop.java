package com.javapractice.loops.forloop.nestedforloops;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i =1; i<=5; i++){
            System.out.println(i);
            for( int j =1; j<=5; j++){


                if(j==1){
                    System.out.print(j);

                }else{
                    System.out.printf("%2d", j);
                }
            }
            System.out.println( );
        }
    }
}
