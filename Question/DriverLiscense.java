import java.util.GregorianCalendar;
public class DriverLiscense extends Card
{
    private int expireYear;
    public DriverLiscense(String n, int expYear)
    {
        super(n);
        this.expireYear = expYear;
    }
    
    public String format()
    {
      return super.format()+"\nExpiration Year: " + expireYear;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.get(calendar.YEAR)<=expireYear)
            return false;
        else
            return true;
    }
}