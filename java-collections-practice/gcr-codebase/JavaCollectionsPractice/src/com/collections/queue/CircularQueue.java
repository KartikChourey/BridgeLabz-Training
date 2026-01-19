package com.collections.queue;

class CircularQueue {
    int[] arr; int size=0, front=0;
    CircularQueue(int n){arr=new int[n];}

    void add(int x){
        arr[(front+size)%arr.length]=x;
        if(size<arr.length) size++;
        else front=(front+1)%arr.length;
    }
}
