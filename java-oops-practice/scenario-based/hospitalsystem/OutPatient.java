class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, double fee) {
        super(id, name);
        this.consultationFee = fee;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Consultation Fee: ₹" + consultationFee);
    }
}