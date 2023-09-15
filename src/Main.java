
public class Main {

    public static void main(String[] args) {
        System.out.println(add(1,3));
        System.out.println(add(1,2,3,4));
        System.out.println(morninggreeting("Toby Fox"));
        System.out.println(afternoongreeting( "Mac Miller"));
        System.out.println(triple( "oohbaby"));
        System.out.println(half( 19));
        System.out.println(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundPositiveValueToNearestInteger(8.49));
        System.out.println(roundNegativeValueToNearestInteger(-8.49));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
    }

    public static String morninggreeting(String name) {
        return "早上好앟," + name +"!";
    }
    // 4. afternoonGreetingnoonGreeting

    public static String afternoongreeting(String name) {
        return "下午好앟," + name +"!";
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
