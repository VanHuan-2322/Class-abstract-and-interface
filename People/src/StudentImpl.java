public class StudentImpl extends People implements Student {
    public StudentImpl(String name, int age, Boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("HS đang ăn");
    }

    @Override
    public void sleep() {
        System.out.println("HS đang ngủ");
    }

    @Override
    public void study() {
        System.out.println("HS đang học");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println("HS học khóa học: " + course);
    }

    @Override
    public void attendClass() {
        System.out.println("Hs tham gia lớp");
    }
}

class EmployeeImpl extends People implements Employee {
    public EmployeeImpl(String name, int age, Boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Hs ăn");
    }

    @Override
    public void sleep() {
        System.out.println("Hs ngủ");
    }

    @Override
    public void study() {
        System.out.println("Hs đang học");
    }

    @Override
    public void work() {
        System.out.println("Hs làm việc");
    }

    @Override
    public void takeABreak() {
        System.out.println("Hs nghỉ giải lao");
    }
}
