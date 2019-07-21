package rocks.zipcode.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char ch = getMiddleCharacter(str);
        ch = Character.toUpperCase(ch);
        return str.substring(0,str.length()/2)+ch+str.substring(str.length()/2+1);

    }

    public static String lowerCaseMiddleCharacter(String str) {
        char ch = getMiddleCharacter(str);
        ch = Character.toLowerCase(ch);
        return str.substring(0,str.length()/2)+ch+str.substring(str.length()/2+1);

    }

    public static Boolean isIsogram(String str) {
        String[] ary = str.split("");
        Set<String> mySet = new HashSet<String>(Arrays.asList(ary));

        if(str.length() == mySet.size()){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    return true;
//                }
//            }
//        }
//                return false;
        return (str.matches(".*(.)\\1.*"));
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder builder = new StringBuilder();
        char lastchar = '\0';
        for (int i = 0; i < str.length(); i++) {
            String string = builder.toString();
            if (!string.equals("") && (string.charAt(string.length() - 1) == str.charAt(i))) {
                builder.deleteCharAt(string.length() - 1);
            }
            else if (str.charAt(i) != lastchar)
                builder.append(str.charAt(i));
            lastchar = str.charAt(i);
        }
        return builder.toString();
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);

    }
}
