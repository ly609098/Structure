package queue;

import java.util.Arrays;

public class MyQueue {
  int[] elements;

  public MyQueue() {
    elements = new int[0];
  }

  /**
   * 入队
   *
   * @param element 入队元素
   */
  public void add(int element) {
    int[] newQueue = new int[elements.length + 1];
    int newQueueLength = newQueue.length;
    for (int i = 0; i < elements.length; i++) {
      newQueue[i] = elements[i];
    }
    newQueue[elements.length] = element;
    elements = newQueue;
    System.out.println(Arrays.toString(elements));
  }

  /** 出队 */
  public int poll() {
    int ele = elements[0];
    if (elements.length == 0) {
      throw new RuntimeException("队列为空");
    }
    int[] newQueue = new int[elements.length - 1];
    int newQueueLength = newQueue.length;
    for (int i = 0; i < newQueueLength; i++) {
      newQueue[i] = elements[i + 1];
    }
    elements = newQueue;

    System.out.println(Arrays.toString(elements));
    return ele;
  }
}
