import java.util.Date; /* Will automatically import when you enter over "Date.util" */

public class referencetypes {

    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();   //Instance of the date class (new is used to allocate new memory in the used system).
        now.getTime();           //Member accessing the date using the "." to return the time component of the desired object.
        System.out.println(now);  //You can type "sout + tab" to create this line of code faster!
    }

}


// Notes

/* Reference types are used for more complex objects. eg. dates and mail messages. */

/* Using the "." function is exclusive to reference types, and is unavailable for primitive types. */