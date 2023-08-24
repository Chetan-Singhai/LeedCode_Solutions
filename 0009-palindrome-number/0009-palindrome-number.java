
class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int number = x;
    int rev = 0;
    while (number > 0) {
      int last_Digit = number % 10;
      rev = rev * 10 + last_Digit;
      number = number / 10;

    }
    if (x == rev) {
      return true;
    } else {
      return false;
    }

  }
}