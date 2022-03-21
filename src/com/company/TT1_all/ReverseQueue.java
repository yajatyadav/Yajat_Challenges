package com.company.TT1_all;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverse(Queue<Integer> initQueue){

        Stack<Integer> temp = new Stack<>(); //creates a temporary stack

        //pushes element from queue to stack
        while(!initQueue.isEmpty()){
            temp.push(initQueue.poll());
        }

        //pop elements from stack to Queue
        while(!temp.isEmpty())
        {
            initQueue.add(temp.pop());
        }

        //print values from queue
        for(Integer i: initQueue) {
            System.out.print(i + " -> ");
        }
        System.out.print("nil");


    }

    public static void main(String[] args){
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        System.out.println("Initial Queue: "+ queue1);

        System.out.print("Reverse Queue: ");
        reverse(queue1);
    }
}