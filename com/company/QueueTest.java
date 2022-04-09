package com.company;

import com.google.gson.Gson;

public class QueueTest {
        private  int front, rear;

        private static final int capacity =10;
    public   int[] queue = new int[capacity];

    QueueTest()
        {
            front = rear = 0;
        }

        boolean isEmpty(){
        return front==rear;
        }


        // function to insert an element
        // at the rear of the queue
          void add(int data)
        {
            // check queue is full or not
            if (capacity == rear) {
                System.out.println("\nQueue is full\n");
            }

            // insert element at the rear
            else {
                queue[rear] = data;
                rear++;
            }
        }


        // function to delete an element
        // from the front of the queue
          int remove()
        {
            int val =0;
            // if queue is empty
            if (front == rear) {
                System.out.println("Queue is empty");
            }

            // shift all the elements from index 2 till rear
            // to the right by one
            else {
                val= queue[front];
                for (int i = 0; i < rear -1; i++) {
                    queue[i] = queue[i + 1];
                }
                // store 0 at rear indicating there's no element
//                if (rear < capacity)
//                    queue[rear] = 0;
                // decrement rear
                rear--;
            }
       return val;
        }



}
class QueueMain {
    public static void main(String args[]) {
        QueueTest q = new QueueTest();



        // inserting elements in the queue
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }

}