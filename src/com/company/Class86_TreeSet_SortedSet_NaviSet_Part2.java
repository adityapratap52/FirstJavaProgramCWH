package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Book{
    private String title;
    private double price;
    public Book(String title,double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class MyComparator implements Comparator<Object>{       //Comparator is user defined(<Object> is not compalsory)
    public int compare(Object o1,Object o2){
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;
        if (book1.getPrice() < book2.getPrice() )
            return (-1);
        else if (book1.getPrice() == book2.getPrice() && book1.getTitle() == book2.getTitle())
            return (0);
        else
            return (1);
    }
}

//---------If you want to use this interface for StringBuffer then Replace StringBuffer instead of StringBuilder and rest code is same--------
public class Class86_TreeSet_SortedSet_NaviSet_Part2  implements Comparator<StringBuilder> {  // Comparator is used for user defined comparison
    @Override
    public int compare(StringBuilder s1, StringBuilder s2){
        return s1.toString().compareTo(s2.toString());
    }

    public static void main(String[] args) {
        //-----------Comparable is not define(cast) in StringBuffer and StingBuilder So we must be cast it by implement Comparator interface----

      /*  Set<StringBuffer> tr = new TreeSet<>(new Class86_TreeSet_SortedSet_NaviSet_Part2());
        tr.add(new StringBuffer("Adi"));
        tr.add(new StringBuffer("Asi"));
        tr.add(new StringBuffer("Aasi"));
        tr.add(new StringBuffer("Aarav"));
        tr.add(new StringBuffer("90"));
        tr.add(new StringBuffer("85"));
        System.out.println(tr); */
//-------------------------------------------------------------------------------------------------
//        Set<StringBuilder> tr = new TreeSet<>(new Class86_TreeSet_SortedSet_NaviSet_Part2());
//        tr.add(new StringBuilder("Adi"));
//        tr.add(new StringBuilder("Asi"));
////        tr.add(new StringBuilder("Aasi"));
//        tr.add(new StringBuilder("Pavan"));
////        tr.add(new StringBuilder("Aarav"));
//        tr.add(new StringBuilder("9"));             // 85 < 9 bcz String is used to unicode
//        tr.add(new StringBuilder("85"));
//        System.out.println(tr);
//-------------------------------------------------------------------------------------------------
        Book b1,b2,b3,b4,b5;
        b1 = new Book("PHP",200);
        b2 = new Book("Java",400);
        b3 = new Book("C",300);
        b4 = new Book("HTML",350);
        b5 = new Book("C",300);
        b5 = new Book("C",300);
        b5 = new Book("C++",300);

        TreeSet t = new TreeSet(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);
        t.add(b4);
        t.add(b5);
        Book b;
        Iterator it = t.iterator();
        while (it.hasNext()){
            b = (Book)it.next();
            System.out.println(b.getTitle()+" "+b.getPrice());
        }
    }
}
