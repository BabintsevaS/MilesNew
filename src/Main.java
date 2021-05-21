public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.milesAmount(1000);
        System.out.println("На вашем счету: " + miles + " миль");

        int miles1 = service.milesAmount(2000);
        System.out.println("На вашем счету: " + miles1 + " миль");

        int miles2 = service.milesAmount(35000);
        System.out.println("На вашем счету: " + miles2 + " миль");

    }
}

