package linkend;

public class TestLoopNode {
  public static void main(String[] args) {
    //
    LoopNode loopNode = new LoopNode(1);
    LoopNode loopNode2 = new LoopNode(2);
    LoopNode loopNode3 = new LoopNode(3);
    loopNode.after(loopNode2);
    loopNode.after(loopNode3);
    // 当前节点的值 预期为1
    System.out.println(loopNode.getData() == 1);
    // 当前节点下一个节点的值 预期为3
    System.out.println(loopNode.next().getData()==3);
    // 当前节点下一个节点的下一个节点的值 预期为2
    System.out.println(loopNode.next().next().getData() == 2);
    // 当前节点下一个节点的下一个节点的下一个节点的值 预期为1
    System.out.println(loopNode.next().next().next().getData()==1 );
  }
}
