package com.javapractice.loops.forloop.nestedforloops;

public class AplhabetPattern2 {

    public static void main(String[] args) {
        int k = 65;
        System.out.println("Displaying alphabet pattern: ");
        // Outer for loop.
        for(int i = 65; i <= 69; i += 2)
        {
        // Inner for loop.
            for(int j = 69; j >= 65; j--)
            {
                if(j > i) // i=65; j = 69,68,67,66,65 2nd Iteration i=67; j = 69,68,67,66,65 3rd Iteration i=69; j=69,68,67,66,65
                    System.out.print(" ");
                else
                    System.out.format("%c ", k++);
            }
            System.out.println(" ");
        }
    }
}

//     A
//  B  C  D
// E F G H I