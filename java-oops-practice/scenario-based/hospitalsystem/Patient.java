interface Payable {
    double calculatePayment();
}


abstract class Patient {
    private int patientId;
    private String name;
    private String medicalHistory; // sensitive data

    // normal admission
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = "Not disclosed";
    }

    // emergency admission
    public Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public abstract void displayInfo();
}