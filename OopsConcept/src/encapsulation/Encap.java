package encapsulation;

public class Encap {
    private String name;
    private int roll;
    private char section;
    private String course;

    void setName(String n) {
        this.name = n;
    }

    void setRoll(int roll) {
        this.roll = roll;
    }

    void setSection(char section) {
        this.section = section;
    }

    void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll() {
        return this.roll;
    }

    public char getSection() {
        return this.section;
    }

    public String getCourse() {
        return this.course;
    }

}
