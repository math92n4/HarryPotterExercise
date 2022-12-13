import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Person harry = new Person("Harry","Potter");
        Person ron = new Person("Ron","Weasley");
        Person hermione = new Person("Hermione","Granger");
        Person ginny = new Person("Ginny","Weasley");

        Person[] persons = {harry,ron,hermione,ginny};

        harry.setPoint(100);
        ron.setPoint(231);
        hermione.setPoint(420);
        ginny.setPoint(1000);

        System.out.println("REGULAR PRINT:");
        System.out.println(harry);
        System.out.println(ron);
        System.out.println(hermione);
        System.out.println(ginny);

        persons[0] = harry;
        persons[1] = ginny;
        persons[2] = ron;
        persons[3] = hermione;

        System.out.println("---------------\nARRAY:");

        System.out.println(Arrays.toString(persons));

        System.out.println("---------------\nENHANCED FOR LOOP:");

        for (int i=0; i<persons.length; i++) {
            System.out.println(Arrays.toString((persons)));
        }


    }


}
