package linkend;

public class Node {
  /** 节点内容 */
  private int data;

  private
  /** 下一个节点 */
  Node next;

  public Node(int data) {
    this.data = data;
  }
  // 为节点增加节点
  public void append(Node node) {
    // 当前节点
    Node currentNode = this;
    while (true) {
      // 去除下一个节点
      Node nextNode = currentNode.next;
      // 如果下一个节点为null,当前节点是最后一个节点
      if (nextNode == null) {
        break;
      }
      currentNode = nextNode;
    }
    // 把需要追加的节点
    currentNode.next = node;
  }

  /**
   * 获取下一个节点
   *
   * @return 下一个节点
   */
  public Node next() {
    if (this.next == null) {
      return new Node(0);
    }
    return this.next;
  }

  /**
   * 获取节点的数据
   *
   * @return 节点数据
   */
  public int getData() {
    return data;
  }

  /**
   * 判断是否为最后一个节点
   *
   * @return 是否最后一个节点
   */
  public boolean isLast() {
    return next == null || next.getData() == 0;
  }

  /** 现实所有节点的数据 */
  public void show() {
    Node currentNode = this;
    while (true) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
      if (currentNode == null) {
        break;
      }
    }
  }

  public void removeNode() {
    Node currentNode = this.next.next;
    this.next = currentNode;
  }
}
