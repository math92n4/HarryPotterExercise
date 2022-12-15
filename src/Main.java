import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        LoopMetoder loopMetoder = new LoopMetoder();
        Person harry = new Person("Harry","Potter");
        Person ron = new Person("Ron","Weasley");
        Person hermione = new Person("Hermione","Granger");
        Person ginny = new Person("Ginny","Weasley");
        Person draco = new Person("Draco","Malfoy");
        Person neville = new Person("Neville","Longbottom");

        persons.add(harry);
        persons.add(ron);
        persons.add(hermione);
        persons.add(ginny);
        persons.add(draco);
        persons.add(neville);

        harry.addPoints(100);
        ron.addPoints(231);
        hermione.addPoints(420);
        ginny.addPoints(1000);
        draco.addPoints(215);
        neville.addPoints(7);

        System.out.println("REGULAR PRINT:");
        System.out.println(harry);
        System.out.println(ron);
        System.out.println(hermione);
        System.out.println(ginny);
        System.out.println(draco);
        System.out.println(neville);

        persons.set(0, harry);
        persons.set(1, ginny);
        persons.set(2, ron);
        persons.set(3, hermione);
        persons.set(4, neville);
        persons.set(5, draco);

        System.out.println("---------------\nARRAY:");

        System.out.println(persons);

        System.out.println("---------------\nENHANCED FOR LOOP:");

        for (int i=0; i<persons.size(); i++) {
            System.out.println(persons);
        }

        System.out.println("---------------\nTOTAL CALCULATED POINTS:");
        System.out.println(loopMetoder.calculateTotalPoints(persons));

        System.out.println("---------------\nPERSON WITH MIN POINTS:");
        System.out.println(loopMetoder.findMinimum(persons));

        System.out.println("---------------\nPERSON WITH MAX POINTS:");
        System.out.println(loopMetoder.findMaximum(persons));

        System.out.println("---------------\nAVG POINTS:");
        System.out.println(loopMetoder.calculateAverage(persons));

        System.out.println("---------------\nFIND FIRSTNAME IN LIST:");
        System.out.println(loopMetoder.findByFirstName(persons,"ginny"));

        System.out.println("---------------\nFIND LASTNAME IN LIST:");
        System.out.println(loopMetoder.findByLastName(persons,"potter"));





    }


}
