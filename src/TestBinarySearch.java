public class TestBinarySearch {
  public static void main(String[] args) {
    // 首先声明定义一个数组
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // 声明要查找的元素
    int targetEl = -1;
    // 声明开始位置
    int start = 0;
    // 声明结束位置
    int end = arr.length;
    // 声明中间位置
    int mid = (start + end) / 2;
    // 声明要查找元素的下标
    int tarIndex = -1;

    while (true) {
      /*if (start>=arr.length||end<=0){
        break;
      }*/
      if (start>=end){
        break;
      }
      // 当中间下标元素刚好为目标元素时跳出
      if (arr[mid] == targetEl) {
        tarIndex = mid;
        break;

      } else {
        // 当中间元素小于目标元素
        if (arr[mid] < targetEl) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
      mid = (start + end) / 2;
    }
    System.out.println(tarIndex);
  }
}
