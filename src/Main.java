import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Person harry = new Person("Harry","Potter");
        Person ron = new Person("Ron","Weasley");
        Person hermione = new Person("Hermione","Granger");
        Person ginny = new Person("Ginny","Weasley");
        Person draco = new Person("Draco","Malfoy");
        Person neville = new Person("Neville","Longbottom");

        Person[] persons = {harry,ron,hermione,ginny,draco};

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

        persons[0] = harry;
        persons[1] = ginny;
        persons[2] = ron;
        persons[3] = hermione;
        persons[4] = neville;

        System.out.println("---------------\nARRAY:");

        System.out.println(Arrays.toString(persons));

        System.out.println("---------------\nENHANCED FOR LOOP:");

        for (int i=0; i<persons.length; i++) {
            System.out.println(Arrays.toString((persons)));
        }


    }


}
