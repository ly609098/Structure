package linkend;

public class TestTwoWayLinkedNode {
  public static void main(String[] args) {
    TwoWayLinkedNode n1 =new TwoWayLinkedNode(1);
    n1.getNextNodeValue();
    n1.getPreNodeValue();
    System.out.println("=============");
    TwoWayLinkedNode n2 =new TwoWayLinkedNode(2);
    n1.after(n2);
    n1.getPreNodeValue();
    n1.getNextNodeValue();
    n2.getPreNodeValue();
    n2.getNextNodeValue();
    System.out.println("=============");
    TwoWayLinkedNode n3 =new TwoWayLinkedNode(3);
    n2.after(n3);
    n1.getPreNodeValue();
    n1.getNextNodeValue();
    n2.getPreNodeValue();
    n2.getNextNodeValue();
    n3.getPreNodeValue();
    n3.getNextNodeValue();
    System.out.println("=============");
    n1.after(n3);
    n1.getPreNodeValue();
    n1.getNextNodeValue();
    n2.getPreNodeValue();
    n2.getNextNodeValue();
    n3.getPreNodeValue();
    n3.getNextNodeValue();
  }
}
