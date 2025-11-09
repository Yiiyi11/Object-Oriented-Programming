public class Appointment {

    private String patientName;    // 患者姓名
    private String patientMobile;  // 患者手机号（用String，支持开头0或+）
    private String timeSlot;       // 预约时间槽（如"08:00", "10:30"）
    private HealthProfessional doctor; // 关联的医生（父类类型，可接收子类对象）

    public Appointment() {
        this.patientName = "Unknown Patient";
        this.patientMobile = "Unknown Mobile";
        this.timeSlot = "Unspecified Time";
        this.doctor = new HealthProfessional(); // 默认医生对象
    }

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Appointment Time: " + timeSlot);
        System.out.println("Consulting Doctor:");
        doctor.printDetails(); // 调用医生对象的printDetails()（多态体现）
    }
}