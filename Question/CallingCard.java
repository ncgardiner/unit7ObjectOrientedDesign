public class CallingCard extends Card
{
    private int cardNum;
    private int pin;
    public CallingCard(String n, int num, int inPin)
    {
        super(n);
        this.cardNum = num;
        this.pin = inPin;
    }
    
    public String format()
    {
      return super.format()+"\nCard Number: " + cardNum + "\nPin:" + pin;
    }
    
}