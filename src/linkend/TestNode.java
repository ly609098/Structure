package linkend;

public class TestNode {
  public static void main(String[] args) {
    Node n1 =new Node(1);
    Node n2 =new Node(2);
    Node n3 =new Node(3);
    //追加节点
    n1.append(n2);
    n1.append(n3);

   /* System.out.println(n1.next().next().next().getData());
    System.out.println(n2.next().getData());
    System.out.println(n3.next().getData());
    System.out.println(n3.isLast());*/
    n1.show();
    System.out.println();
    //n2.removeNode();
    n3.after(new Node(10));
    n2.show();
    System.out.println();
    n1.show();
  }
}
