package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        String string = "";
        int value = values.length % 2;
        int middleIndex = values.length/2;
        int evenMid = middleIndex - 1;
        if( value == 0 ){
            string += values[evenMid] + "\n" + values[(evenMid+1)];
        }
        else{
            string += values[middleIndex];
        }
        return string;
    }

    public static String[] removeMiddleElement(String[] values) {
        return null;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values, values.length-1);
    }
}