package stack;

import java.util.Arrays;

public class MyStack {
  /** 栈底层使用数组来储存 */
  int[] elements;

  public MyStack() {
    elements = new int[0];
  }

  /**
   * 压栈
   *
   * @param element 压栈的元素
   */
  public void push(int element) {
    // 创建一个数组,长度为原来数组的长度+1
    int[] arrs = new int[elements.length + 1];
    // 循环 将原来数组的元素一一拷贝到新数组
    for (int i = 0; i < elements.length; i++) {
      arrs[i] = elements[i];
    }
    arrs[elements.length] = element;
    elements = arrs;
    System.out.println(Arrays.toString(elements));
  }

  public void pop() {
    if (elements.length <= 0) {
      throw new RuntimeException("stack is empty");
    }

    int[] newArr = new int[elements.length - 1];
    int newArrLength = newArr.length;
    for (int i = 0; i <newArrLength; i++) {
      newArr[i] = elements[i];
    }
    elements = newArr;
    System.out.println(Arrays.toString(elements));
  }
}
