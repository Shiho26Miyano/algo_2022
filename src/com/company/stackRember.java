package com.company;
import java.util.*;

public class stackRember {
    private int stackSize;
    private int[] stackArr;
    private int top;

    /**
     * constructor to create stack with size
     * @param size
     */
    public stackRember(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }

    /**
     * Adds new entry to the top of the stack
     * @param entry
     * @throws Exception
     */
    public void push(int entry) throws Exception {
        if(this.isStackFull()){
            System.out.println("Stack Overflow");
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }

    /**
     * Removes an entry from the top of the stack.
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            System.out.println("Stack underflow.");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }

    /**
     * Returns top of the stack without removing it.
     * @return
     */
    public int peek() {
        return stackArr[top];
    }

    /**
     * Returns true if the stack is empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }

    /**
     * Returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    public static void main(String args[]){
        stackRember  stack = new stackRember (4);
        try {
            stack.push(14);
            stack.push(82);
            stack.push(32);
            stack.push(8);
            stack.pop();
            stack.push(3);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}