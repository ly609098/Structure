import util.MyArray;

public class TestMyArray {

  public static void main(String[] args) {
    //创建一个可变数组
      MyArray ma = new MyArray();
      ma.showLength();
      ma.add(1);
      ma.add(2);
      ma.add(3);
      ma.add(4);

      ma.showLength();
      ma.show();

      ma.del(1);
      ma.show();
      ma.insert(9,1);
      ma.insert(10,2);
      ma.insert(5,-1);
      ma.show();
  }
}
