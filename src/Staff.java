public class Staff {
    private char name;
    private char gender;
    private int age;
    private String title;

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void greeting(Staff s) {
        System.out.println("Hello " + s.getTitle() + " " + s.getName() + ", I'm " + this.getName() + " aged " + this.getAge());
    }
}
