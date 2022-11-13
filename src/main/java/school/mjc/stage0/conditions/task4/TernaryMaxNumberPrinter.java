package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int result;
        result = first > second ? first : second;
        result = third > result ? third : result;

        System.out.println(result);
    }
}
