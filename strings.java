
public class strings {
    public static void main(String[] args) {
        String message = "   Hello World" + "!!";
        System.out.println(message.replace("!", "**"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

    }
}


// Notes

/* Though it may look like the string is primitive, it is just an easier way to write the string. Making it a "string literal". */

/* There are many operations you can return, such as message.endsWith(), message.startsWith() & message.length() */

/* message.indexOf("") returns the index of the first occurence of the character specified! If you pass a character or phrase that doesnt exist, it returns "-1". */

/* message.replace("take, replace") takes the specified value(s), and replaces it with the desired value(s). AKA, arguments. */

/* Arguments and parameters are not the same. Paramaters are the holes that are defined in methods. Arguments are the actual values we pass. */