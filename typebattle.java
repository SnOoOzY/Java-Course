import java.awt.*;


public class typebattle {
    
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;                              // Since both X and Y objects are on different memory allocations, so they are independent, meaning if one of them changes values, it will not effect the others value.
        x = 2;
        System.out.println(y);
    }

    public static void main2(String[] args) {

        Point point1 = new Point(1, 1);     /*  When this is run, it will give the point a memory location (eg 100). */
        Point point2 = point1;                  /* Then it allocates a seperate part of the memory to the point1 attribute, which stores the address of our point object!! (100).  */
        point1.x = 2;                           /* Will update the value of x within the point 1 object. */
        System.out.println(point2);
        
    } 

}

// Notes

/* a BIG difference between primitive and reference is that reference types our variable holds the address of our object in memory, NOT inside of the actual pointer object! */

/* multiple memory allocations can reference the same object */