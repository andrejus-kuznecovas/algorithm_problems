import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
//
//    Return the element repeated N times.
//
//    Input: [1,2,3,3]
//    Output: 3

//Intuition and Algorithm
//
//    If we ever find a repeated element, it must be the answer. Let's call this answer the major element.
//
//    Consider all subarrays of length 4. There must be a major element in at least one such subarray.
//
//    This is because either:
//
//    There is a major element in a length 2 subarray, or;
//    Every length 2 subarray has exactly 1 major element, which means that a length 4 subarray that begins at a major element will have 2 major elements.
//    Thus, we only have to compare elements with their neighbors that are distance 1, 2, or 3 away.

//Complexity Analysis
//
//    Time Complexity: O(N)O(N), where NN is the length of A.
//
//    Space Complexity: O(1)O(1).
class Task1 {
  public static void main(String[] args) {

    int[] input = { 5,1,5,2,5,3,5,4 }; //5

    System.out.println("Array elements:");
    System.out.println(Arrays.toString(input));

    int majorElement= repeatedNTimes(input);
    System.out.println("Major element: "+majorElement );



  }
  public static int repeatedNTimes(int[] A) {
    for (int k = 1; k <= 3; ++k)
      for (int i = 0; i < A.length - k; ++i)
        if (A[i] == A[i+k])
          return A[i];

    throw null;
  }

  public static int repeatedNTimesCount(int[] A) {
    Map<Integer, Integer> count = new HashMap();
    for (int x: A) {
      count.put(x, count.getOrDefault(x, 0) + 1);
    }

    for (int k: count.keySet())
      if (count.get(k) > 1)
        return k;

    throw null;
  }
}
