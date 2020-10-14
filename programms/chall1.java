/**
 * chall1  - 50000L +10L * (bytevalue + shortvalue + intvalue)
 */
public class chall1 {
  public static void main(String[] args) {
    int myInt = 50;
    byte myByte = 10;
    short myShort = 20;

    long myLong = 50000L + 10L * (myByte + myShort + myInt);
    System.out.println(myLong);

    short valueShort = (short) (1000 + 10 * (myByte + myShort + myInt));
    System.out.println(valueShort);
  }
}
