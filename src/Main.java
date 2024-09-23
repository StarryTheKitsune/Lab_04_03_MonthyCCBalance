public class Main {
    public static void main(String[] args)
    {
        double cardBalance = 5000;
        final double INTEREST_RATE = 0.17;


        cardBalance = cardBalance + cardBalance * INTEREST_RATE;
        System.out.println("Your balance after one month will be: $" + cardBalance + ".");
        cardBalance = cardBalance + cardBalance * INTEREST_RATE;
        System.out.println("Your balance after two months will be: $" + cardBalance + ".");
    }
}