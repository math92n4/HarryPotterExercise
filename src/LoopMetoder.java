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
        Person personWithMin = null;
        int minNumber = Integer.MAX_VALUE;
        for (Person person : persons) {
            if (person.getPoint() < minNumber)
            personWithMin = person;
            minNumber = person.getPoint();
        }
        return personWithMin;
    }

    public Person findMaximum(ArrayList<Person> persons) {
        Person personWithMax = null;
        int maxNumber = Integer.MIN_VALUE;
        for (Person person : persons) {
            if (person.getPoint() > maxNumber) {
                personWithMax = person;
                maxNumber = person.getPoint();
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
