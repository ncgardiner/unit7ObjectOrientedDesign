public class BillfoldTest
{
    public static void main(String[]args)
    {
        DriverLiscense card1 = new DriverLiscense("steve",2012);
        IDCard card2 = new IDCard("john",4056);
        Billfold billfold = new Billfold();
        billfold.addCard(card1);
        System.out.println(billfold.formatCards());
        billfold.addCard(card2);
        System.out.println(billfold.formatCards());
        System.out.println("\n"+card1.isExpired());
        System.out.println("\n"+card1.equals(card2));
        System.out.println("\n"+card1.equals(card1));
    }
}