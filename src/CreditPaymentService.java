public class CreditPaymentService {
    public double calculate(int loanAmount, double interestRate, int creditTerm) {
        double monthlyInterestRate = interestRate / 12 / 100;
        double pow = Math.pow((1 + monthlyInterestRate), creditTerm);
        double annuityCoefficient = (monthlyInterestRate * pow) / (pow - 1);
        double creditPayment = (int)(annuityCoefficient * loanAmount);
        return creditPayment;
    }
}