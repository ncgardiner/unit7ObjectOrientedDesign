public class Card
{
    private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public boolean equals(Card card1)
   {
        if (this.format().equals(card1.format()))
            return true;
        else
            return false;
   }
}