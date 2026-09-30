package Exercise7;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personList =
            new ArrayList<>();

    public void addPerson(Person person) {

        personList.add(person);

        System.out.println("Person added successfully!");
    }

    public void updatePerson(String id) {

        for (Person person : personList) {

            if (person.getId().equals(id)) {

                person.updatePerson(id);

                System.out.println("Person updated!");
                return;
            }
        }

        System.out.println("ID not found!");
    }

    public void deletePersonById(String id) {

        for (int i = 0; i < personList.size(); i++) {

            if (personList.get(i).getId().equals(id)) {

                personList.remove(i);

                System.out.println("Person deleted!");
                return;
            }
        }

        System.out.println("ID not found!");
    }

    public void findPersonById(String id) {

        for (Person person : personList) {

            if (person.getId().equals(id)) {

                person.displayInfo();
                return;
            }
        }

        System.out.println("ID not found!");
    }

    public void displayEveryone() {

        for (Person person : personList) {

            person.displayInfo();
        }
    }
}