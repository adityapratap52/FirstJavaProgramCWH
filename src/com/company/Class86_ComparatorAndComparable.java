package com.company;

import java.util.*;

class MyComparator1 implements Comparable{
    int eid;
    String name;
    MyComparator1(int eid , String name){
        this.eid = eid;
        this.name = name;
    }

    public String toString(){
        return eid+"--"+name;
    }

    public int compareTo(Object o1){
        int eid1 = this.eid;
        MyComparator1 com = (MyComparator1)o1;
        int eid2 = com.eid;
        if (eid1 < eid2)
            return -1;
        else if (eid1 > eid2)
            return 1;
        else
            return 0;
    }

}class MyCom1 implements Comparator{
    public int compare(Object o1, Object o2){
        MyComparator1 com1 = (MyComparator1)o1;
        MyComparator1 com2 = (MyComparator1)o2;
        String s1 = com1.name;
        String s2 = com2.name;

        return s1.compareTo(s2);
    }
}

public class Class86_ComparatorAndComparable {
    public static void main(String[] args) {
        MyComparator1 myComparator1 = new MyComparator1(111,"Ram");
        MyComparator1 myComparator2 = new MyComparator1(100,"Arjun");
        MyComparator1 myComparator3 = new MyComparator1(321,"Zoya");
        MyComparator1 myComparator4 = new MyComparator1(251,"Lokesh");

        // Print value according to eid
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(myComparator1);
        treeSet1.add(myComparator2);
        treeSet1.add(myComparator3);
        treeSet1.add(myComparator4);
        System.out.println(treeSet1);

        // Print value according to name
        TreeSet treeSet2 = new TreeSet(new MyCom1());
        treeSet2.add(myComparator1);
        treeSet2.add(myComparator2);
        treeSet2.add(myComparator3);
        treeSet2.add(myComparator4);
        System.out.println(treeSet2);
    }
}
