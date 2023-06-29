package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int answer = first > second ? first : -first;

        System.out.println(answer);
    }
}
