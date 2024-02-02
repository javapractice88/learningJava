package com.javapractice.collections;


import java.util.*;

class CollectionDemo {

    public static void main(String[] args)
    {
        // Creating instances of the array,
        // vector and hashtable
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Vector<Integer> v2 = new Vector();
        Hashtable<Integer, String> h = new Hashtable();

        // Adding the elements into the
        // vector
        v2.addElement(2);
        v2.addElement(6);
        v.addAll(v2);
        v.addElement(1);
        v.addElement(2);
        v.addElement(5);
        v.remove(3);

        // Adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");
        h.put(5, "10geeks");

        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the third element of the
        // array, vector and hashtable
        System.out.println(arr[2]);
        System.out.println(v.elementAt(2));
        System.out.println(h.get(5));

        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()


        List <Character> al = new ArrayList<> ();
        al.add('c');
        al.add('c');
        al.add('c');
        al.add('c');al.add('c');al.add('c');al.add('c');al.add('c');al.add('c');

        al.get(5);



    }
}
