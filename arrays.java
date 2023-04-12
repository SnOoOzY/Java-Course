import java.util.Arrays;


public class arrays {
    
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

    }

    public static void main2(String[] args) {
        int[] numbers2 = { 2, 3, 5, 1, 4 };
        Arrays.sort(numbers2);
        System.out.println(numbers2);
    }

}



// Notes

/* To convert an integer variable to an array add a "[]" & "new int [values]" */

/* When printing an array, Java will return a bizarre string, because Java returns a string thats calculated based on the address of the object in the memory. */

/* We can see the actual values of the array we made by using the Arrays class in the System.out! */

/* There is a new, more modern syntax for arrays, as seen in main2. */

/* You can sort values in an array by using the Arrays.sort class */