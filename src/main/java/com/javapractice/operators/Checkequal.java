package com.javapractice.operators;

public class Checkequal
{

    int a ;
    int b;
public Checkequal (int a1, int b1 ){
    this.a=a1;
    this.b=b1;

}
void calu(){
    boolean compare  = (a == b);
    System.out.println ("result is:" + compare);


}
    public static void main (String[] args)
            {
                Checkequal compare1 = new Checkequal(23,23) ;
                compare1.calu();

    }
}
