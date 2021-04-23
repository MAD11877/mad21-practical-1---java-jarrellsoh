import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter the number of integers to be entered: ");
    int amount = in.nextInt();
    ArrayList<Integer> numberList = new ArrayList<>();
    for(int i = 0;i<amount;i++){
      // System.out.print("Enter the number: ");
      int number = in.nextInt();
      numberList.add(number);
    }

    int modeNumber = 0, modeCount = 0;
    for(int i = 0;i<numberList.size();i++){
     int count = 0;
      for (int j = 0;j<numberList.size();j++){
        if (numberList.get(i) == numberList.get(j)){
          count += 1;
        }
      }
      if (count > modeCount){
        modeCount = count;
        modeNumber = numberList.get(i);
      }
    }

    System.out.println(modeNumber);
  }
}
