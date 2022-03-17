public class Main {

    public static void main(String[] args) {


        int ticketPrice = 100;     //стоимость билета
        int bonusMilePrice = 20;   //стоимость одной мили
        int bonusMileAmount = ticketPrice / bonusMilePrice;


        System.out.println("количество начисленных миль за купленный билет:");
        System.out.println((bonusMileAmount) + "миль");


    }
}
