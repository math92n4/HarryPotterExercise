public class LoopMetoder {

    public int calculateTotalPoints(Person[] persons) {
        int total = 0;
        for (Person person : persons) {
            total += person.getPoint();
        }
        return total;
    }

    public Person findMinimum(Person[] persons) {
        Person personWithMin = persons[0];
        for (Person person : persons) {
            if (person.getPoint() < personWithMin.getPoint())
            personWithMin = person;
        }
        return personWithMin;
    }

    public Person findMaximum(Person[] persons) {
        Person personWithMax = persons[0];
        for (Person person : persons) {
            if (person.getPoint() > personWithMax.getPoint()) {
                personWithMax = person;
            }
        }
        return personWithMax;
    }

    public double calculateAverage(Person[] persons) {
        double avg = calculateTotalPoints(persons) / persons.length;
        return avg;
    }

    public Person findByFirstName(Person[] persons,String firstName) {
        for (Person person : persons) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }

    public Person findByLastName(Person[] persons,String lastName) {
        for (Person person : persons) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                return person;
            }
        }
        return null;
    }

}
