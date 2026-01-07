package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5, "Auto Loan");
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000) {
            setApproved(true);
            return true;
        }
        return false;
    }

    @Override
    public double calculateEMI() {
        return baseEMICalculation(1.1); // slightly higher rate
    }
}
