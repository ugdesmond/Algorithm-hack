package com.company;

public class QueSample {
    static final int MAX = 10;
    int front, rear;
    int[] array = new int[MAX];

    QueSample() {
        front = rear = 0;
    }


    void add(int val) {
        if (rear >= MAX) System.out.println("Full");
        else {
            array[rear++] = val;
        }
    }

    int remove() {
        int vaLue = 0;
        if (rear == front) System.out.println("Queue is empty");
        else {
            vaLue = array[front];
            for (int x = 0; x < rear - 1; x++) {
                array[x] = array[x + 1];
            }
            rear--;
        }
        return vaLue;
    }

    boolean isEmpty()
    {
        return rear == front;
    }

}
