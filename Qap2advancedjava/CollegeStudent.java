public class CollegeStudent extends Student {
    private String major; // student's major
    private int year; // current level in college

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
