
public class Main {

    public static void main(String[] args) {

    }
    public static String morningGreeting(String name) {
        return "早上好, " + name +"!";
    }
    // 4. afternoonGreeting

    public static String afternoonGreeting(String name) {
        return "下午好, " + name +"!";
    }

    // 1. add.
    public static int add(int a,int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a,int b,int c, int d) {
        return a + b + c + d;
    }
    // 5. triple
    public static String triple(String name1) {
        return name1+name1+name1;
    }
    // 6. half
    public static double half(double a) {
        return a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        return Math.toIntExact(Math.round(a));
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {

      return Math.toIntExact(-Math.round(-a));


}}
