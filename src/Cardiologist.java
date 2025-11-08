public class Cardiologist extends HealthProfessional {

    private String specializedSurgery;

    public Cardiologist() {
        super();
        this.specializedSurgery = "Coronary Artery Bypass Graft"; // 默认手术类型
    }

    public Cardiologist(int id, String name, String specialization, String specializedSurgery) {
        super(id, name, specialization);
        this.specializedSurgery = specializedSurgery;
    }

    public String getSpecializedSurgery() {
        return specializedSurgery;
    }

    public void setSpecializedSurgery(String specializedSurgery) {
        this.specializedSurgery = specializedSurgery;
    }

    @Override
    public void printDetails() {
        System.out.println("=== Cardiologist Details ===");
        super.printDetails(); // 复用父类代码，避免重复
        System.out.println("Specialized Surgery: " + specializedSurgery);
        System.out.println(); // 空行分隔
    }
}