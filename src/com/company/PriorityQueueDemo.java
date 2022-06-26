package com.company;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String args[])
    {
        // Creating an empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<String>();

        // Use add() method to add elements into the Queue
        queue.add("Welcome");
        queue.add("To");
        queue.add("Geeks");
        queue.add("4");
        queue.add("Geeks");

        // Displaying the PriorityQueue
        System.out.println("Initial PriorityQueue: " + queue);

        // Inserting using offer()
        queue.offer("The");
        queue.offer("Priority");
        queue.offer("Class");

        // Displaying th final Queue
        System.out.println("Priority queue after Insertion: " + queue);

        /// example 2

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue
                = new PriorityQueue<Integer>((a, b) -> b - a);

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(5);

        // Printing the top element of PriorityQueue
        //System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        //System.out.println(pQueue.poll());

        // Printing the top element again
        //System.out.println(pQueue.peek());
        System.out.println(pQueue);

    }
}

