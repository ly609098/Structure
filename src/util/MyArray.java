package util;

import java.util.Arrays;

public class MyArray {
  private int[] elements;

  public MyArray() {
    elements = new int[0];
  }

  /** 显示所有元素 */
  public void show() {
    System.out.println(Arrays.toString(elements));
  }

  /** 获取数组的长度 */
  public void showLength() {
    System.out.println(elements.length);
    ;
  }

  /**
   * 在数组最后添加一个新的元素
   *
   * @param element
   */
  public void add(int element) {
    // 创建一个新的数组
    int[] newArr = new int[elements.length + 1];
    // 把原来的数组放入新的数组中
    for (int i = 0; i < elements.length; i++) {
      newArr[i] = elements[i];
    }
    newArr[elements.length] = element;
    elements = newArr;
  }

  /**
   * 删除
   *
   * @param elementIndex 要删除元素的下标
   */
  public void del(int elementIndex) {
    // 首先判断 参数是否合法
    if (elementIndex < 0 || elementIndex > elements.length - 1) {
      throw new RuntimeException("要删除元素的下标不合法");
    }
    // 创建一个新的数组 ,数组的长度为源数组的长度-1
    int[] newArr = new int[elements.length - 1];
    int newArrLength = newArr.length;
    for (int i = 0; i < newArrLength; i++) {
      if (i < elementIndex) {
        newArr[i] = elements[i];
      } else {
        newArr[i] = elements[i + 1];
      }
    }
    elements = newArr;
  }

  /**
   * @param element 需要插入的元素
   * @param elementIndex 插入元素的下标
   */
  public void insert(int element, int elementIndex) {
    // 创建一个新的数组
    int[] newArr = new int[elements.length + 1];
    int newArrLength = newArr.length;
    // 判断要插入元素下标是否合法
    if (elementIndex < 0 || elementIndex >= newArrLength) {
      throw new RuntimeException("数组越界");
    }

    // 循环遍历元素

    for (int i = 0; i < newArrLength; i++) {
      if (i < elementIndex) {
        newArr[i] = elements[i];
      } else if (i == elementIndex) {
        newArr[i] = element;
      } else {
        newArr[i] = elements[i - 1];
      }
    }
    elements = newArr;
  }

  /**
   * 获取指定下标的元素
   *
   * @param dstIndex 返回值下标
   * @return 返回值
   */
  public int get(int dstIndex) {
    return elements[dstIndex];
  }
}
