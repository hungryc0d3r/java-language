/***
       int -> min and max Value
       byte -> min and max Value
       short -> min and max Value
       long -> min and max Value
***/
public class primitivePart1 {
public static void main(String[] args) {
  // int max and min values
  System.out.println("Integer -> int -> max and min values");
  int myMaxIntValue = Integer.MAX_VALUE;
  int myMinIntValue = Integer.MIN_VALUE;
  System.out.println("Max value of Int is: "+myMaxIntValue);
  System.out.println("Min value of Int is: "+myMinIntValue);
  System.out.println("Busted max value of Int is: "+(myMaxIntValue + 1));
  System.out.println("Busted min value of Int is: "+(myMinIntValue - 1));
  // byte max and min values
  System.out.println("byte-> max and min values");
  byte myMaxByteValue = Byte.MAX_VALUE;
  byte myMinByteValue = Byte.MIN_VALUE;
  System.out.println("Max value of Byte is: "+myMaxByteValue);
  System.out.println("Min value of Byte is: "+myMinByteValue);
  System.out.println("Busted max value of Byte is: "+(myMaxByteValue + 1));
  System.out.println("Busted min value of Byte is: "+(myMinByteValue - 1));
  // short max and min value
  System.out.println("short -> max and min values");
  short myMaxShortValue = Short.MAX_VALUE;
  short myMinShortValue = Short.MIN_VALUE;
  System.out.println("Max value of Short is: "+myMaxShortValue);
  System.out.println("Min value of Short is: "+myMinShortValue);
  System.out.println("Busted max value of Short is: "+(myMaxShortValue + 1));
  System.out.println("Busted min value of Short is: "+(myMinShortValue - 1));
  // long max and min value
  System.out.println("long -> max and min values");
  long myMaxLongValue = Long.MAX_VALUE;
  long myMinLongValue = Long.MIN_VALUE;
  System.out.println("Max value of Long is: "+myMaxLongValue);
  System.out.println("Min value of Long is: "+myMinLongValue);
  System.out.println("Busted max value of Long is: "+(myMaxLongValue + 1));
  System.out.println("Busted min value of Long is: "+(myMinLongValue - 1));
}
}
