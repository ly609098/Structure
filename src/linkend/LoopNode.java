package linkend;

public class LoopNode {
  /** 节点内容 */
  private int data;

  private
  /** 下一个节点 */
  LoopNode next = this;

  public LoopNode(int data) {
    this.data = data;
  }

  /**
   * 获取下一个节点
   *
   * @return 下一个节点
   */
  public LoopNode next() {
    if (this.next == null) {
      return new LoopNode(0);
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




  /** 删除节点 */
  public void removeNode() {
    LoopNode currentNode = this.next.next;
    this.next = currentNode;
  }

  public void after(LoopNode node) {
    node.next = this.next;
    this.next = node;
  }
}
