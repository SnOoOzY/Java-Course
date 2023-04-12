/* Type      Byte             Range
 * byte      1            [-128, 127]
 * short     2            [-32K, 32K]
 * int       4            [-2B, 2B]
 * long      8
 * float     4
 * double    8
 * char      2             A, B, C
 * boolean   1             true / false
 */



 public class primitivetypes {

    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true; /* OR false */

    }

 }


// Notes

/* Primitive types are used for more simple objects, like numbers, characters and booleans. */

/* Like using "," in writing, you can use "_" in Java to make large numbers more readable. */

/* When using long instead of int for large numerical values, the compiler will always return an error, unless you add an "l" (or "L", capitalisation doesn't matter) to the END of the value. */

/* When using float instead of double, you put an "F" at the end of the numerical value so that an error does not occur. */

/* Single characters should be surrounded with singular quotes, whereas strings should be double quotes */