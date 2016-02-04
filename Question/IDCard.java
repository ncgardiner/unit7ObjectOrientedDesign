public class IDCard extends Card
{
    private int idNum;
    public IDCard(String n, int num)
    {
        super(n);
        this.idNum = num;
    }
    
    public String format()
    {
      return super.format()+"\nID Number: " + idNum;
    }
    
    public boolean equals(Object other)
    {
        if (this.getClass() == other.getClass())
        {
            boolean isEqual = super.equals(other);
            IDCard otherID = (IDCard) other;
            return isEqual && this.idNum==(otherID.idNum);
        }
        else
            return false;
    }
}