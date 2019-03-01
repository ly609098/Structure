/** 线性查找 */
public class TestSearch {
  public static void main(String[] args) {
    int[] nums = new int[] {1, 4, 6, 8, 9, 12, 23};
    int numsLength = nums.length;
    // 需要查找的元素
    int dst = 11;
    // 需要查找元素下标
    int dstIndex = -1;

    for (int i = 0; i < numsLength; i++) {
        if (nums[i]==dst){
            dstIndex =i;
            break;
        }
    }
    System.out.println(dstIndex);
  }
}
