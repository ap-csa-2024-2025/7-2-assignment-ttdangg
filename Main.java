import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] nums = (1,2,3,4,5);
    for (int i = 0; i< nums.length; i++)
    {
      System.out.println(nums[i]);
    }


    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(new Integer(1));
    nums.add(new Integer(2));
    nums.add(new Integer(3));
    nums.add(new Integer(4));
    nums.add(new Integer(5));

    for (int i = 0; i < nums.size(); i++)
    {
      System.out.println(nums.get(i));
    }









    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (int i = 0; i < arr.size(); i++)
    {
      Integer temp = arr.get(i);
      if (arr.get(i).intValue() % 2 == 0)
      {
        ans.add(temp);
      }
    }
    return ans;
  }
}
