import java.util.ArrayList;
import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>(n);
      if (n <= 0)  // The smallest list we can make
      {
          
          return tempList;
          
 
      }
      else        // All other size lists are created here
      {
          tempList.add(n);
          tempList.addAll(makeList(n-1));



      }
      return tempList;
   }
}
  