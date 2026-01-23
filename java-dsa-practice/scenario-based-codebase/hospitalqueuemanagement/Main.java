package hospitalqueuemanagement;


public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.register(900, "Rahul");
        hospital.register(830, "Anita");
        hospital.register(1000, "Kartik");

        System.out.println("Patient Queue:");
        hospital.displayPatients();

        System.out.println("Patient at 830 discharged");
        hospital.discharge(830);

        System.out.println("Updated Queue:");
        hospital.displayPatients();
    }
}

