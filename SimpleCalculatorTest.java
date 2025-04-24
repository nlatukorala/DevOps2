public class SimpleCalculatorTest {

    private static SimpleCalculator calculator = new SimpleCalculator();
    
    public static String testAdd(int x, int y, int expected) {
        int result = calculator.add(x, y);
        if(result == expected){
            return "Passed";
        }
        return "Failed";
    }

    public static void main(String[] args){
        System.out.println("Testing SimpleCalculator");
        System.out.println("---------------------------");
        System.out.println("Testing add() method");
        System.out.println("add(2,3):"+testAdd(2,3,5));
        System.out.println("add(10,5):"+testAdd(10,5,15));
    }
}
