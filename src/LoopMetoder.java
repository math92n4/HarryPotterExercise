import java.util.ArrayList;
import java.util.Arrays;

public class LoopMetoder {

    public int calculateTotalPoints(ArrayList<Person> persons) {
        int total = 0;
        for (Person person : persons) {
            total += person.getPoint();
        }
        return total;
    }

    public Person findMinimum(ArrayList<Person> persons) {
        Person personWithMin = persons.get(0);
        for (Person person : persons) {
            if (person.getPoint() < personWithMin.getPoint())
            personWithMin = person;
        }
        return personWithMin;
    }

    public Person findMaximum(ArrayList<Person> persons) {
        Person personWithMax = persons.get(0);
        for (Person person : persons) {
            if (person.getPoint() > personWithMax.getPoint()) {
                personWithMax = person;
            }
        }
        return personWithMax;
    }

    public double calculateAverage(ArrayList<Person> persons) {
        double avg = calculateTotalPoints(persons) / persons.size();
        return avg;
    }

    public Person findByFirstName(ArrayList<Person> persons,String firstName) {
        for (Person person : persons) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }

    public Person findByLastName(ArrayList<Person> persons,String lastName) {
        for (Person person : persons) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                return person;
            }
        }
        return null;
    }

}
