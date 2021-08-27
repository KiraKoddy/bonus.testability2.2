public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 800;
        int bonusMiles = service.calculate(800);
        System.out.println("Бонусные мили: " + bonusMiles);
    }
}