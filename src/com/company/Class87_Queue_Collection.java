package com.company;

import java.util.*;

public class Class87_Queue_Collection {
    public static void main(String[] args) {
//        PriorityQueue pq = new PriorityQueue();
//        pq.offer(6);
//        pq.offer(7);
//        pq.offer(3);
//        pq.offer(2);
//        pq.offer(2);                        // Use duplicate values
//        pq.offer(4);
//        pq.offer(1);
//        pq.offer(5);
//        //pq.offer("Adi");                    // not use to differ wrapper value
//        System.out.println(pq);                 // not important that always show ascending order
//        System.out.println("Remove: "+pq.poll());      // Always remove in ascending order-->1,2,2,3,4,....
//        System.out.println(pq);
//        System.out.println("Upper Value: "+pq.peek());      // show upper value of queue
//        System.out.println(pq);

        Deque q = new ArrayDeque();
        q.offer(1);
        q.add(2);
        q.add(3);
        q.offer(4);
        q.add(5);
        q.add(6);
        q.add(4);
        q.add(7);
        q.offerFirst(6);        // It is use bcz offerFirst is the method of Deque interface, If you use reference of Queue then it is not to work
        System.out.println(q);

    }
}
