package com.company.TT1_try;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> {
    QueueNode head, tail;

    public Queue(){
        this.head = this.tail = null;
    }

    public void add(T a){

        QueueNode temp =  new QueueNode(a);

        if(this.head == null){
            this.head = this.tail = temp;

        }
        else {

            this.tail.next = temp;
            this.tail = temp;
        }
    }
}
