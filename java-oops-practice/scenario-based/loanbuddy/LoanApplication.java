package loanbuddy;

//Base loan application class
public abstract class LoanApplication implements IApprovable {

 protected String loanType;
 protected int term; // in months
 protected double interestRate;

 private boolean approved; // restricted access
 protected Applicant applicant;

 public LoanApplication(Applicant applicant, int term, double interestRate, String loanType) {
     this.applicant = applicant;
     this.term = term;
     this.interestRate = interestRate;
     this.loanType = loanType;
     this.approved = false;
 }

 protected void setApproved(boolean status) {
     this.approved = status;
 }

 public boolean isApproved() {
     return approved;
 }

 // Common EMI formula
 protected double baseEMICalculation(double rateMultiplier) {
     double P = applicant.getLoanAmount();
     double R = (interestRate * rateMultiplier) / (12 * 100);
     int N = term;

     return (P * R * Math.pow(1 + R, N)) /
            (Math.pow(1 + R, N) - 1);
 }
}

