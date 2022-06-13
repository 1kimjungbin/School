package ArrayList;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue(){
        if(arrayQueue.size() == 0) {
            System.out.println("빈 큐");
            return null;
        }
        return arrayQueue.remove(0);
    }


}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.enQueue("D");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
