public static void main(String[] args) {
    int currentYear = 2026;

    // Test valid patient
    Patient validPt = new Patient(1001, "John Doe", 1978, 175.5, 78.0);
    System.out.println(validPt.getDetails(currentYear));

    // Test invalid patient
    Patient invalidPt = new Patient(1002, "Joe Dohn", -780, -160.0, -65.0, "C", "123");
    System.out.println(invalidPt.getDetails(currentYear));

    Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "123-456-7890");
    System.out.printf("Patient BMI: %.2f%n", patient.getBMI());
}
