public class LoopMetoder {


    public int calculateTotalPoints(Person[] persons) {
        int total = 0;
        for (Person person : persons) {
            total += person.getPoint();
        }
        return total;
    }


}
