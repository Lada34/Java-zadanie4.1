public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();


        int totalMiles1 = service.calculate(5000);
        System.out.println(totalMiles1);

        int totalMiles2 = service.calculate(1000);
        System.out.println(totalMiles2);

        int totalMiles3 = service.calculate(900);
        System.out.println(totalMiles3);

        int totalMiles4 = service.calculate(20000);
        System.out.println(totalMiles4);
    }
}
