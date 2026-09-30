package Exercise7;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PersonList list = new PersonList();

        int choice;

        do {

            System.out.println("\n===== PERSON MANAGEMENT =====");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    Student student =
                            new Student("", "", null,
                                    0, "");

                    student.addPerson();

                    list.addPerson(student);

                    break;

                case 2:

                    Teacher teacher =
                            new Teacher("", "", null,
                                    "", "");

                    teacher.addPerson();

                    list.addPerson(teacher);

                    break;

                case 3:

                    System.out.print("Enter Person ID: ");
                    String updateId = sc.nextLine();

                    list.updatePerson(updateId);

                    break;

                case 4:

                    System.out.print("Enter Person ID: ");
                    String deleteId = sc.nextLine();

                    list.deletePersonById(deleteId);

                    break;

                case 5:

                    System.out.print("Enter Person ID: ");
                    String findId = sc.nextLine();

                    list.findPersonById(findId);

                    break;

                case 6:

                    list.displayEveryone();

                    break;

                case 7:

                    System.out.println("Exit program!");

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}