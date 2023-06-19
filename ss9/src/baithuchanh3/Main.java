package baithuchanh3;

public class Main {
    // Khởi tạo các đối tượng học sinh và giáo viên

    public static void main(String[] args) {
        Student student1 = new Student("Le The Thuy", 28);
        Student student2 = new Student("Nguyen thi hong Nhung",28);
        Student student3 = new Student("Thu Tra", 24);
        Teacher teacher1 = new Teacher("DO Hoan", 22);
        Teacher teacher2 = new Teacher("Thi Xuan", 32);
        Teacher teacher3 = new Teacher("Hoa", 22);

        // Hiển thị thông tin bằng phương thức displayInfor()
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        teacher1.displayInfo();
        teacher2.displayInfo();
        teacher3.displayInfo();
    }

}
