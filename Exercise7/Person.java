package Exercise7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String fullName;
    private Date dateOfBirth;

    Scanner sc = new Scanner(System.in);

    public Person() {

    }

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void addPerson() {

        System.out.print("Enter ID: ");
        setId(sc.nextLine());

        System.out.print("Enter Full Name: ");
        setFullName(sc.nextLine());

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateString = sc.nextLine();

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");

        try {
            setDateOfBirth(sdf.parse(dateString));
        } catch (ParseException e) {
            System.out.println("Invalid date!");
        }
    }

    @Override
    public void updatePerson(String id) {

        System.out.print("Enter Full Name: ");
        setFullName(sc.nextLine());

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateString = sc.nextLine();

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");

        try {
            setDateOfBirth(sdf.parse(dateString));
        } catch (ParseException e) {
            System.out.println("Invalid date!");
        }
    }

    @Override
    public void displayInfo() {

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: "
                + sdf.format(dateOfBirth));
    }
}