public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("=== Part 3: Health Professional Objects ===");

        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Clark", "Family Medicine", 18);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Lee", "General Medicine", 22);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Jones", "Primary Care", 20);

        Cardiologist cardio1 = new Cardiologist(201, "Dr. David Kim", "Cardiology", "Angioplasty");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Lisa Wang", "Cardiology", "Heart Valve Replacement");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        cardio1.printDetails();
        cardio2.printDetails();

        System.out.println("------------------------------");

    }
}