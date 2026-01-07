package loanbuddy;

public class LoanBuddy {

    public static void main(String[] args) {

        Applicant user = new Applicant("Kartik", 720, 60000, 500000);

        LoanApplication loan = new HomeLoan(user, 120);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved for " + user.getName());
            System.out.println("Monthly EMI: ₹" + (int) loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected");
        }
    }
}
