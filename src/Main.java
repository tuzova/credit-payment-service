public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println(creditPayment);

        creditPayment = service.calculate(1_000_000, 9.99, 24);
        System.out.println(creditPayment);

        creditPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println(creditPayment);
    }
}