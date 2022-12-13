public class Person {

    private String firstName;
    private String lastName;
    private int point;

    public Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.point = 0;
    }

    //GETTERS

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPoint() {
        return point;
    }

    //SETTERS

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    //toString

    public String toString() {
        return firstName + " " + lastName + " has " + point + " point";
    }

    //add point method

    public void addPoints(int point) {
        this.point += point;
    }

}
