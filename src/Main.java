public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 1000;
        int miles = service.milesAmount(ticketPrice);
        System.out.println("На вашем счету: " + miles + " миль");

        BonusMilesService service1 = new BonusMilesService();
        int ticketPrice1 = 2000;
        int miles1 = service1.milesAmount(ticketPrice1);
        System.out.println("На вашем счету: " + miles1 + " миль");

    }
}

