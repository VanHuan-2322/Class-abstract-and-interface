public class Main {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tuan Anh", 25, false);
        System.out.println(student);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
    }
}

