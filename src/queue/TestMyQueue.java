package queue;

public class TestMyQueue {
  public static void main(String[] args) {
    //
      MyQueue mq =new MyQueue();
      mq.add(1);
      mq.add(3);
      mq.add(2);
    System.out.println(mq.poll());
  }
}
