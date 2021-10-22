package com.company;

import java.util.*;

public class Class85_1_Cursors_Vector_Collection {
    public static void main(String[] args) {
        //---------Use of Enumeration Cursor( Enumeration is use in only Vector or Stack Class bcz it is develop from version 1.0)-------

       Vector v = new Vector();
        v.add("Aditya");
        v.addElement("Mohan");
        v.add("Anuj");
        v.addElement("Yashavir");
        v.add("Anay");
        v.addElement("Rahul");

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            String s = (String)e.nextElement();         // bcz values in String
            System.out.println(s+" "+s.length());
        }

        //--------------Use of Iterator it is use Arraylist,LinkedList,Vector (Version 1.2)------------------

        /* ArrayList l1 = new ArrayList();
        for (int i=1;i<=10;i++){
            l1.add(i);
        }
        System.out.println(l1);

        Iterator it = l1.iterator();
        while (it.hasNext()){
            Integer n = (Integer)it.next();     // bcz values in integer
            if (n>3 && n<8){
                it.remove();
            }
        }
        System.out.println(l1); */

        // Use of ListIterator(It gives advance function than Iterator)--> This is bidirectional

//        LinkedList ll = new LinkedList();
//        ll.add("C");
//        ll.add("Java");
//        ll.add("CPP");
//        ll.add("Python");
//        System.out.println(ll);
//        ListIterator it = ll.listIterator();
//        while (it.hasNext()){
//            String s = (String)it.next();
//            if (s.equals("C")){
//                it.set("C++");
//            }
//            else if (s.equals("Java")){
//                it.set("Myjava");
//                it.add("Oracle");
//            }
//            else if (s.equals("Python")){
//                it.remove();
//            }
//        }
//        System.out.println(ll);
    }
}
