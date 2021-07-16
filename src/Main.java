public class Main {
    public static void main(String[] args) {
        int current_balance = 100;
        int payment = 1100;
        int bonus = (payment > 1000) ? payment / 100 : 0;
        int result = current_balance + payment + bonus;

        System.out.println("Ваш баланс: " + result + " руб.");
        System.out.println("Количество бонусов: " + bonus + " руб.");
    }
}