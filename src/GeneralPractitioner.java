public class GeneralPractitioner extends HealthProfessional {

    private int maxPatientsPerDay;

    public GeneralPractitioner() {
        super(); // 必须先调用父类构造
        this.maxPatientsPerDay = 20; // 默认接诊上限20人
    }

    public GeneralPractitioner(int id, String name, String specialization, int maxPatientsPerDay) {
        super(id, name, specialization); // 调用父类全参构造
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    public int getMaxPatientsPerDay() {
        return maxPatientsPerDay;
    }

    public void setMaxPatientsPerDay(int maxPatientsPerDay) {
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    @Override
    public void printDetails() {
        System.out.println("=== General Practitioner Details ===");
        super.printDetails(); // 调用父类方法打印共同属性
        System.out.println("Max Patients per Day: " + maxPatientsPerDay);
        System.out.println(); // 空行，增强输出可读性
    }
}