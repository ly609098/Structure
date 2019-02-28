import java.util.Arrays;

public class TestDelArray {
  public static void main(String[] args) {
    // 目标数组
    int[] arr = new int[] {9, 8, 7, 6, 5, 4};
    // 要删除元素下标
    int dstIndex = 3;
    // 创建一个新的数组
    int[] newArr = new int[arr.length - 1];
    // 复制除了要删除的数据之外原来的数组所有数据
    for (int i = 0; i < newArr.length; i++) {
      //判断 如果游标小于目标数据下标 直接复制
      if (i<dstIndex){
          newArr[i] = arr[i];
      }else {
          newArr[i] =arr[i+1];
      }
    }
    System.out.println(Arrays.toString(newArr));
  }
}
