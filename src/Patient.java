public class Patient {
    private int id;        // patient's ID
    private String name;   // patient's full name
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms
    private String bloodGroup; //patient's blood type (A,B,O,AB or Unknown)
    private String phoneNumber; //patient's contact number or N/A

    public Patient(int id, String name, int birthYear, double height, double weight) {
        this(id, name, birthYear, height, weight, "Unknown", "N/A");
    }

    //Full constructor
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber){
        this.id = id;
        this.name = name;
        if (birthYear >= 1900 && birthYear <= 2026){
            this.birthYear = birthYear;
        }
        else{
            this.birthYear = 2003;
        }

        if (weight >=0.5 && weight <= 500){
            this.weight = weight;
        }
        else{
            this.weight = 53;
        }

        if (height>=30 && height<=300){
            this.height = height;
        }
        else{
            this.height = 164;
        }

        // Blood group must be one of the four main ABO types; otherwise mark as "Unknown".
        if (bloodGroup != null &&
                (bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("O") || bloodGroup.equals("AB"))) {
            this.bloodGroup = bloodGroup;
        } else {
            this.bloodGroup = "Unknown";
        }

        // Phone number must be a reasonable length (7-15 characters)
        // this range covers most real-world phone numbers, with or without a country code
        if (phoneNumber != null && phoneNumber.length() >= 7 && phoneNumber.length() <= 15){
            this.phoneNumber = phoneNumber;
        }
        else {
            this.phoneNumber = "N/A";
        }

    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }

    //New Getter
    public String getBloodGroup(){
        return this.bloodGroup;
    }

    //New Getter
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public int getAge(int currentYear){
        return currentYear-birthYear;
    }

    // Calculates BMI using the formula: BMI = weight (kg) / (height (m))^2
    public double getBMI() {

        if (height <= 0)
        {
            return 0;
        }

        double heightInMeters = height / 100.0;

        return weight / (heightInMeters * heightInMeters);
    }

    public String getDetails (int currentYear){
        return "Patient Name: " + name + "\n" +
                "Patient Age: " + getAge(currentYear) + "\n" +
                "Patient Height (cm): " + height + "\n" +
                "Patient Weight (kg): " + weight + "\n" +
                "Blood Group: " + bloodGroup + "\n" +
                "Phone Number: " + phoneNumber + "\n";
    }

}