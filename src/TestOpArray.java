import java.util.Arrays;

public class TestOpArray {
  public static void main(String[] args) {
    // 解决数组长度不可变的问题
    int[] arr = new int[] {9, 8, 7};
    // 要加入数组的元素
    int dst = 6;
    // 创建一个新的数组
    int[] newArr = new int[arr.length + 1];
    // 把原来数组中的数据扔到新的数组中
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    System.out.println(Arrays.toString(newArr));
    // 把目标数据放入新的数组最后
    newArr[newArr.length - 1] = dst;
    // 新数组替换成原来的数组
    arr = newArr;
    System.out.println(Arrays.toString(arr));
  }
}
