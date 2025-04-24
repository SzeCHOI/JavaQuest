import java.util.Arrays;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    int temp = 0;
    // code here ...

    for (int i = 0; i < nums3.length - 1; i++) {
      for (int j = 0; j < nums3.length - i - 1; j++) {
        if (nums3[j +1] < nums3[j]) {
          temp = nums3[j+1];
          nums3[j+1] = nums3[j];
          nums3[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(nums3));
      System.out.println("The second max numer is " + nums3[nums3.length-2]);
  }
}