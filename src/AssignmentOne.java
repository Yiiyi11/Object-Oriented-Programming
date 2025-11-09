import java.util.ArrayList;

public class AssignmentOne {
    // 1. 定义静态ArrayList（所有方法可共享）
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    // 2. createAppointment()：创建预约（验证信息完整性）
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // 验证：所有信息不可为空或空白
        if (patientName.isBlank() || patientMobile.isBlank() || timeSlot.isBlank() || doctor == null) {
            System.out.println("Error: Incomplete information! Appointment not created.");
            return;
        }
        // 验证手机号格式（仅允许数字和+，10-15位，符合国际手机号规范）
        if (!patientMobile.matches("^[+]?[0-9]{10,15}$")) {
            System.out.println("Error: Invalid mobile number! Appointment not created.");
            return;
        }
        // 创建预约并添加到集合
        Appointment newAppt = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointmentList.add(newAppt);
        System.out.println("Success: Appointment created for " + patientName + "\n");
    }

    // 3. printExistingAppointments()：打印所有预约
    public static void printExistingAppointments() {
        System.out.println("=== All Existing Appointments ===");
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments found.\n");
            return;
        }
        // 遍历集合打印每个预约（索引从1开始，更直观）
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("Appointment " + (i + 1) + ":");
            appointmentList.get(i).printAppointmentDetails();
            System.out.println(); // 空行分隔，增强可读性
        }
    }

    // 4. cancelBooking()：通过手机号取消预约
    public static void cancelBooking(String patientMobile) {
        System.out.println("=== Canceling Appointment for Mobile: " + patientMobile + " ===");
        boolean found = false;
        // 遍历集合查找匹配手机号的预约（假设一个手机号对应一个预约）
        for (int i = 0; i < appointmentList.size(); i++) {
            Appointment appt = appointmentList.get(i);
            if (appt.getPatientMobile().equals(patientMobile)) {
                appointmentList.remove(i); // 移除匹配的预约
                System.out.println("Success: Appointment canceled for mobile " + patientMobile + "\n");
                found = true;
                break; // 找到后退出循环，避免重复取消
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for mobile " + patientMobile + "\n");
        }
    }

    // 5. main方法（完整包含Part3和Part5代码）
    public static void main(String[] args) {
        System.out.println("=== PROG2004 A1 Health Service Appointment System ===");
        System.out.println();

        // ------------------------------
        // Part 3 – Using classes and objects（完整实现）
        // ------------------------------
        System.out.println("=== Part 3: Health Professional Objects ===");

        // 创建3个GeneralPractitioner对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Clark", "Family Medicine", 18);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Lee", "General Medicine", 22);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Jones", "Primary Care", 20);

        // 创建2个Cardiologist对象
        Cardiologist cardio1 = new Cardiologist(201, "Dr. David Kim", "Cardiology", "Angioplasty");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Lisa Wang", "Cardiology", "Heart Valve Replacement");

        // 调用每个对象的printDetails()方法，打印所有信息
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        cardio1.printDetails();
        cardio2.printDetails();

        // Part3 分隔线（作业要求）
        System.out.println("------------------------------");

        // ------------------------------
        // Part 5 – Collection of appointments（完整实现）
        // ------------------------------
        System.out.println("\n=== Part 5: Appointment Collection Management ===");

        // 步骤1：创建4个预约（2个全科，2个心脏病）
        // 复用Part3的医生对象，避免重复创建
        createAppointment("John Smith", "0412345678", "09:00", gp1);    // 全科1
        createAppointment("Emma Davis", "0487654321", "11:30", gp2);   // 全科2
        createAppointment("James Brown", "0423456789", "14:00", cardio1); // 心脏病1
        createAppointment("Olivia Wilson", "0498765432", "16:30", cardio2); // 心脏病2

        // 步骤2：打印所有预约
        printExistingAppointments();

        // 步骤3：取消Emma的预约（手机号0487654321）
        cancelBooking("0487654321");

        // 步骤4：再次打印，验证取消效果
        printExistingAppointments();

        // Part5 分隔线（作业要求）
        System.out.println("------------------------------");
    }
}