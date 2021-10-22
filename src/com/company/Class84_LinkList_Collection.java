package com.company;

import java.util.LinkedList;

public class Class84_LinkList_Collection {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);

        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(0,2);
        l1.addAll(0,l2);
        l1.addFirst(1);
        l1.addLast(7);
        System.out.println("First Value: "+l1.getFirst());
        System.out.println("Last Value: "+l1.getLast());
        //-------------------------------------------------
        System.out.println("Before Removing: "+l1);                             // It is show as a Link List
        l1.remove(3);
        System.out.println("After Removing: "+l1);
        //-------------------------------------------------
        l1.set(2,30);
        System.out.println("After Replacing: "+l1);
        //-------------------------------------------------
        System.out.println("Is it Contain 7: "+l1.contains(7));
        System.out.println("Index of 30: "+l1.indexOf(30));
        System.out.println("Index of 3 if it is present in List: "+l1.indexOf(3));

        //------------------------------------------------------------
        //l1.clear();
        //System.out.println("After clear total value: "+l1.size());

        //-----------------------------------------------------------
        //l1.offerFirst(50);                                   // we can use offerFirst instead of addFirst, offerFirst is not throw Exception
        //System.out.println("After Replacing: "+l1);

        //-----------------------------------------------------------
//        Iterator<Integer> itr = l1.iterator();
//        while(itr.hasNext()) {
//            System.out.print(itr.next()+", ");
//        }
    }
}
