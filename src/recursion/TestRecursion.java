package recursion;

public class TestRecursion {
  public static void main(String[] args) {
    //int 最小值-2147483648
    System.out.println(Integer.MIN_VALUE);
    // 打印到 -10810的时候 会报java.lang.StackOverflowError 在遇到这种问题的时候 如果是stack内存太小 则用-Xss<>m来修改
    // 默认stack size 为1m 现在设置-Xss10m 打印到-118051 刚好为10倍
    System.out.println(118051/10810);
    //print(10);

  }


  public static void print(int i){
    System.out.println(i);
    print(i-1);
  }
}
