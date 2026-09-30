package Exercise7;

import java.util.Date;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName,
            Date dateOfBirth, String department,
            String teachingSubject) {

        super(id, fullName, dateOfBirth);

        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {

        System.out.println("\n--- Add Teacher ---");

        super.addPerson();

        System.out.print("Enter Department: ");
        setDepartment(sc.nextLine());

        System.out.print("Enter Teaching Subject: ");
        setTeachingSubject(sc.nextLine());
    }

    @Override
    public void updatePerson(String id) {

        System.out.println("\n--- Update Teacher ---");

        super.updatePerson(id);

        System.out.print("Enter Department: ");
        setDepartment(sc.nextLine());

        System.out.print("Enter Teaching Subject: ");
        setTeachingSubject(sc.nextLine());
    }

    @Override
    public void displayInfo() {

        System.out.println("\n--- Teacher ---");

        super.displayInfo();

        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: "
                + teachingSubject);
    }
}