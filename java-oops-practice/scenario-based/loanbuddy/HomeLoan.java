package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5, "Home Loan");
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000) {
            setApproved(true);
            return true;
        }
        return false;
    }

    @Override
    public double calculateEMI() {
        return baseEMICalculation(1.0); // standard rate
    }
}
