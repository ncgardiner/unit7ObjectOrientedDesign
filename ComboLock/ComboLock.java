public class ComboLock
{
    private int currentPos = 0;
    private int d1 = 0;
    private int d2 = 0;
    private int d3 = 0;
    private int currentDisc=1;
    private boolean open = false;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        d1 = secret1;
        d2 = secret2;
        d3 = secret3;
    }
    public void reset()
    {
        currentPos = 0;
        currentDisc = 1;
        open = false;
    }
    public void turnRight(int ticks)
    {
        for (int i = currentPos; i > (currentPos-ticks); i--)
        {
            currentPos--;
            if (currentPos < 0)
                currentPos=39;
        }
        check();
    }
    public void turnLeft(int ticks)
    {
        for (int i = currentPos; i < (currentPos+ticks); i++)
        {
            currentPos++;
            if (currentPos > 39)
                currentPos=0;
        }
        check();
    }
    public boolean open()
    {
        return open;
    }
    private void check()
    {
        if (currentDisc == 1)
        {
            if (d1 == currentPos)
                currentDisc = 2;
        }
        else if (currentDisc == 2)
        {
            if (d2 == currentPos)
                currentDisc = 3;
        }
        else
        {
            if (d3 == currentPos)
                open = true;
            else
                open = false;
        }
    }
}




























