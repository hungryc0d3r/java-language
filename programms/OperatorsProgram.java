public class OperatorsProgram {
    public static void main(String[] args) {
        double myFirstNum = 20d;
        double mySecondNum = 80d;
        double Result = (myFirstNum + mySecondNum)*100;
        System.out.println("Result = "+Result);
        double Remainder = Result % 40d;
        System.out.println("Remainder is: "+ Remainder);
        boolean isNoRemainder = (Remainder == 0) ? true : false;
        System.out.println("isNoRemainder: "+ isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }
    }
}
