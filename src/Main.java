public class Main {

    public static void main(String[] args) {


        int ticketPrice = 100;     //стоимость билета
        int ticketAmount = 3;   //количество билетов
        int bonusMilesAmount = ticketPrice * ticketAmount / 20;


        System.out.println("количество начисленных миль за купленный билет:");
        System.out.println((bonusMilesAmount) + "миль");


    }
}
