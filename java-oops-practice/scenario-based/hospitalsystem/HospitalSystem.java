public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rohit", 5);
        Patient p2 = new OutPatient(102, "Anita", 500);

        Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");

        Bill bill = new Bill(5000);

        d1.displayInfo();
        p1.displayInfo();
        p2.displayInfo();

        System.out.println("Final Bill Amount: ₹" + bill.calculatePayment());
    }
}