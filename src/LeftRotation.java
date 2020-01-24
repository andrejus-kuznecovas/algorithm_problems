import java.util.Arrays;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class LeftRotation {

  public static void main(String[] args) {

    int[] input = {1,2,3,4,5, 6, 7, 8, 9};
    int lengthOfArray= 9;
    int shiftAmount= 2;

    System.out.println("Array elements:");
    System.out.println(Arrays.toString(input));
    int[] newArray= leftRotation(lengthOfArray, shiftAmount, input);
    System.out.println(Arrays.toString(newArray));
  }

  public static int[] leftRotation(int lengthOfArray, int shiftAmount, int[] inputArray){

    int[] newArray= new int[inputArray.length];
    for(int i = 0; i < lengthOfArray; i++){
      int newLocation = (i + (lengthOfArray - shiftAmount)) % lengthOfArray;
      System.out.println(newLocation +"="+(lengthOfArray)+ "-" +shiftAmount+ "%"+ lengthOfArray);
      //String str = String.format("%d (newLocation)  = %d (i) + ( %d (lengthOfArray) - %d (shiftAmount) ) $ %d (lengthOfArray ",newLocation, i, lengthOfArray, shiftAmount, lengthOfArray );
      //System.out.println(str);
      newArray[newLocation] = inputArray[i];
    }
    return newArray;
  }
}