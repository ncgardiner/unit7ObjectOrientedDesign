public class Billfold
{
    Card card1;
    Card card2;
    public void addCard(Card card)
    {
        if (card1==null)
            card1 = card;
        else if (card2==null)
            card2 = card;
    }
    
    public String formatCards()
    {
        String format = "\n";
        if (card1!=null)
            format += card1.format();
        if (card2!=null)
            format += "\n"+card2.format();
        return format;
    }
    
    public int getExpiredCount()
    {
        int count = 0;
        if (card1==null)
            if (card1.isExpired())
                count++;
        else if (card2==null)
            if (card2.isExpired())
                count++;
        return count;
    }
}