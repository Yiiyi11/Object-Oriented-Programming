public class HealthProfessional {
    private int id;          // ID（仅数字，用int类型确保）
    private String name;     // 姓名
    private String specialization; // 额外属性：专业领域（如"General Medicine"、"Cardiology"）

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "Unspecified";
    }

    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}