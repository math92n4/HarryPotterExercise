import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        LoopMetoder loopMetoder = new LoopMetoder();
        Person harry = new Person("Harry","Potter");
        Person ron = new Person("Ron","Weasley");
        Person hermione = new Person("Hermione","Granger");
        Person ginny = new Person("Ginny","Weasley");
        Person draco = new Person("Draco","Malfoy");
        Person neville = new Person("Neville","Longbottom");

        Person[] persons = {harry,ron,hermione,ginny,draco,neville};

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

        persons[0] = harry;
        persons[1] = ginny;
        persons[2] = ron;
        persons[3] = hermione;
        persons[4] = neville;
        persons[5] = draco;

        System.out.println("---------------\nARRAY:");

        System.out.println(Arrays.toString(persons));

        System.out.println("---------------\nENHANCED FOR LOOP:");

        for (int i=0; i<persons.length; i++) {
            System.out.println(Arrays.toString((persons)));
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
