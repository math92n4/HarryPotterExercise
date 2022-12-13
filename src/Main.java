public class Main {


    public static void main(String[] args) {

        Person harry = new Person("Harry","Potter");
        Person ron = new Person("Ron","Weasley");
        Person hermione = new Person("Hermione","Granger");

        harry.setPoint(100);
        ron.setPoint(231);
        hermione.setPoint(420);

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(hermione);

    }


}
