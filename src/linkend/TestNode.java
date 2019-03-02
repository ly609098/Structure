package linkend;

public class TestNode {
  public static void main(String[] args) {
    Node n1 =new Node(1);
    Node n2 =new Node(2);
    Node n3 =new Node(3);
    //追加节点
    n1.append(n2);
    n1.append(n3);
    n1.append(new Node(4));
   /* System.out.println(n1.next().next().next().getData());
    System.out.println(n2.next().getData());
    System.out.println(n3.next().getData());
    System.out.println(n3.isLast());*/
    n1.show();
    System.out.println();
    n2.removeNode();
    n2.show();
  }
}
