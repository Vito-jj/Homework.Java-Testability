public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма: 1 000 000, срок: 12 месяцев");
        System.out.println(service.calculate(1000000, 12));

        System.out.println();
        System.out.println("Сумма: 1 000 000, срок: 24 месяца");
        System.out.println(service.calculate(1000000, 24));

        System.out.println();
        System.out.println("Сумма: 1 000 000, срок: 36 месяцев");
        System.out.println(service.calculate(1000000, 36));

    }
}
