public class Main {

    public static void main(String[] args) {

        BonusMiliServis service = new BonusMiliServis();

        int bonus1 = (int) service.calculate(100000);

        System.out.println("expected result:5000, actual result: " + bonus1);

        System.out.println("Your actual result: " + bonus1);
    }
}
