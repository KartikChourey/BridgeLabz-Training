package loanbuddy;

//Applicant details
public class Applicant {

 private String name;
 private int creditScore;
 private double income;
 private double loanAmount;

 public Applicant(String name, int creditScore, double income, double loanAmount) {
     this.name = name;
     this.creditScore = creditScore;
     this.income = income;
     this.loanAmount = loanAmount;
 }

 // Controlled access
 protected int getCreditScore() {
     return creditScore;
 }

 protected double getIncome() {
     return income;
 }

 protected double getLoanAmount() {
     return loanAmount;
 }

 public String getName() {
     return name;
 }
}

