import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Person harry = new Person("Harry","Potter");
        Person ron = new Person("Ron","Weasley");
        Person hermione = new Person("Hermione","Granger");

        Person[] persons = {harry,ron,hermione};

        harry.setPoint(100);
        ron.setPoint(231);
        hermione.setPoint(420);

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(hermione);

        System.out.println("---------------\nARRAY:");

        System.out.println(Arrays.toString(persons));

        System.out.println("---------------\nENHANCED FOR LOOP:");

        for (int i=0; i<persons.length; i++) {
            System.out.println(Arrays.toString((persons)));
        }


    }


}
