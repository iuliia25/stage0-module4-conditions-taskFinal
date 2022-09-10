package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int fraction = dividend / divider;
        if (fraction * divider == dividend) {
            System.out.println("can be divided completely");
        }
        if (fraction * divider != dividend) {
            System.out.println("cannot be divided completely");
        }
        else {
            System.out.println("division by zero");
        }
    }
}
