package Exercise_4;

public class QueueMain {
    public static void main(String[] args) {
        IntQueue que = new LinkedQueue();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
        System.out.println("The size is: " + que.size());
        System.out.println("Nodes: " + que.toString());
        System.out.println("Is the queue empty?: " + que.isEmpty());
        System.out.println("First node in que: " + que.first());
        System.out.println("Last node in que: " + que.last());
        System.out.println("The first node: " + que.dequeue()
                        + " has been removed");
        System.out.println("The queue after removal: "+ que.toString()
        + "\nThe size after removal: " + que.size());
    }
}
