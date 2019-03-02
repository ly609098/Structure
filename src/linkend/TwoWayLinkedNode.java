package linkend;

public class TwoWayLinkedNode {
  /** 上一个节点 */
  private TwoWayLinkedNode preNode = this;
  /** 下一个节点 */
  private TwoWayLinkedNode nextNode = this;

  /** 节点的值 */
  private int value;

  /** 构造方法 */
  public TwoWayLinkedNode(int value) {
    this.value = value;
  }

  /**
   * 增加节点
   *
   * @param node 要插入的节点
   */
  public void after(TwoWayLinkedNode node) {
    // 原来节点的下一个节点
    TwoWayLinkedNode nextButOneNode = nextNode;
    // 把新节点作为当前节点的下一个节点
    this.nextNode = node;
    // 把当前节点作为新节点的前一个节点
    node.preNode = this;
    // 让原来的下一个节点作为新节点的下一个节点
    node.nextNode = nextButOneNode;
    // 让原来的下一个节点的上一个节点为新的节点
    nextButOneNode.preNode = node;
  }

  /** 获取下一个节点的值 */
  public void getNextNodeValue() {
    System.out.println(this.nextNode.value);
  }

  /** 获取上一个节点的值 */
  public void getPreNodeValue() {
    System.out.println(this.preNode.value);
  }
}
