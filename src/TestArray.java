public class TestArray {
  public static void main(String[] args) {
    // 创建一个容量为3的数组
    int[] arr = new int[3];
    Integer[] arrs = new Integer[4];
    // 获取数组的长度
    System.out.println(arr.length);
    // 访问数组的方式
    int ele0 = arr[0];
    Integer arr0 = arrs[0];
    // 如果是基本类型 打印出来的是默认值
    System.out.println(ele0);
    // 如果是包装类型 打印出来的是null
    System.out.println(arr0);

    // 赋值
    arr[0] = 99;
    arr[1] = 98;
    arr[2] = 97;
    arrs[0] = 100;
    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {
      System.out.println(arr[i]);
    }

    // 创建数组的时候同时赋值
    int[] arr2 = new int[] {90, 80, 70, 60, 50};
    System.out.println(arr2.length);

  }
}
