public abstract class People {
    protected String name;
    protected int age;
    protected boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void study();

    @Override
    public String toString() {
        return "A people with name: " + getName() + ", age: " + getAge() + " and gender: " + (isGender() ? "Nam" : "Nữ");
    }
}

interface Student {
    public void registerCourse(String course);

    public void attendClass();
}

interface Employee {
    public void work();

    public void takeABreak();
}
