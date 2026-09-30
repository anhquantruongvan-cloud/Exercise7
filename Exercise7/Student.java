package Exercise7;

import java.util.Date;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student(String id, String fullName,
            Date dateOfBirth, float gpa, String major) {

        super(id, fullName, dateOfBirth);

        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {

        System.out.println("\n--- Add Student ---");

        super.addPerson();

        System.out.print("Enter GPA: ");
        setGpa(sc.nextFloat());
        sc.nextLine();

        System.out.print("Enter Major: ");
        setMajor(sc.nextLine());
    }

    @Override
    public void updatePerson(String id) {

        System.out.println("\n--- Update Student ---");

        super.updatePerson(id);

        System.out.print("Enter GPA: ");
        setGpa(sc.nextFloat());
        sc.nextLine();

        System.out.print("Enter Major: ");
        setMajor(sc.nextLine());
    }

    @Override
    public void displayInfo() {

        System.out.println("\n--- Student ---");

        super.displayInfo();

        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}