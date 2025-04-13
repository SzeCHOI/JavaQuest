public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    int last = -1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'c') {
        last = i;
      }
    }
    if (last >= 0) {
      System.out.println("Found.");
      System.out.println("The indext of the last character of c is " + last);
    } else {
      System.out.println("Not Found.");
    }

  }
}
