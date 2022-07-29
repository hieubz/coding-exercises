package leetcode.easy;

import java.util.HashMap;

public class IsAlienSorted {

  public boolean isAlienSorted(String[] words, String order) {
    char[] orderList = order.toCharArray();

    // init a hashmap of character and its ranking
    HashMap<Character, Integer> orderMap = new HashMap<>();
    for (int i = 0; i < orderList.length; i++) {
      orderMap.put(orderList[i], i);
    }

    for (int i = 0; i < words.length - 1; i++) {
      String nextWord = words[i + 1];
      for (int j = 0; j < words[i].length(); j++) {
        // do not find a mismatch => check for ex: (apple, app)
        if (j >= nextWord.length()) return false;

        // different letter => check order
        if (words[i].charAt(j) != nextWord.charAt(j)) {
          if (orderMap.get(words[i].charAt(j)) > orderMap.get(nextWord.charAt(j))) {
            return false;
          } else {
            // sorted => no need to check remaining letters
            break;
          }
        }
      }
    }

    return true;
  }

  public static void main(String[] args) {
    //
    IsAlienSorted s = new IsAlienSorted();
    String[] words = new String[] {"hello", "leetcode"};
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    System.out.println(s.isAlienSorted(words, order));
  }
}
