package com.company.TT1_try;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueNode<T> {
    Object data;
    QueueNode next;

    public QueueNode(T i){
        data = i;
        next = null;
    }
}
