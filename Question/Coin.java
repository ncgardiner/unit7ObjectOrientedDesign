import java.util.Collections;
import java.util.ArrayList;
/**
   A coin with a monetary value.
*/
public class Coin implements Comparable<Coin>
{
   private double value;
   private String name;
  
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }
   
   public int compareTo(Coin other)
   {
        return (int)this.value - (int)other.value;
        //if (this.value > otherCoin.value)
        //      return 1;
        //else if (this.value<otherCoin.value)
        //      return -1;
        //else
        //      return 0;
   }
   
   public static void main(String[]args)
   {
       ArrayList<Coin> list = new ArrayList<Coin>();
       list.add(new Coin( 0.10, "dime"));
       list.add(new Coin( 0.05, "nickel"));
       list.add(new Coin( 0.01, "penny"));
       list.add(new Coin( 0.25, "quarter"));
       
       System.out.println("original list: "+list);
       
       Collections.sort(list);
       
       System.out.println("\nsorted list: "+list);
   }
}



























