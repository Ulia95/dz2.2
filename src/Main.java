public class Main {

    public static void main(String[] args) {
        int customerAcoount1 = 100;
        int replenishmentAmount = 1500;
        int bonus = 0;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        }
        int customerAccount2 = customerAcoount1 + replenishmentAmount + bonus;

        System.out.println("Начисленные бонусы: " + bonus);
        System.out.println("Баланс: " + customerAccount2);
    }
}
