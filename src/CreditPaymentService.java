public class CreditPaymentService {

    public double calculate(int amount, double term) {
        double annualRate = 9.99;

        double i;
        i= (annualRate / term) / 100;

        double monthlyPayment;
        double componentPayment = 1 + i;
        double xComponent = i / (Math.pow(componentPayment, term) - 1);
        monthlyPayment = amount * (i + xComponent);

        return monthlyPayment;
    }
}
