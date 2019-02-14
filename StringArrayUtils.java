import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String firstElement = array[0];
        return firstElement;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String secondElement = array[1];
        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String lastElement = array[array.length -1];
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondElement = array[array.length -2];
        return secondElement;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++){
            String s = array[i];
        }

        for(String s : array){
            if(s.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for( int i =0; i < array.length/2; i++){
            String temp = array[i];
            array[i] = array[array.length -(1 + i)];
            array[array.length -(1+i)] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for( int i =0; i < array.length/2; i++){
            if(!array[i].equals(array[array.length -(1+i)])){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPan = true;

        for(char x = 'a'; x <= 'z'; x++){
            boolean found = false;

            for(int i = 0; i < array.length; i++){
                String lowercase = array[i].toLowerCase();
                if(lowercase.contains(Character.toString(x))){
                    found = true;
                    break;
                }   
            }

            if (!found) {
                isPan = false;
                break;
            }
        }   
        return isPan;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0;i< array.length ;i++ ) 
        {
            if(value.equals(array[i])) {
                count++;
            }
        }
        return count;  
    }

    /**
     * @param array array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //Find out length of array by finding out the number of occurance for valueToRemove
        int count = getNumberOfOccurrences(array,valueToRemove);
        //create new array
        String[] newArray = new String[array.length - count];
        int newArrayIndex = 0;
        //go through every element in the array with a loop
        for(int x=0;x<array.length;x++){
            if(!valueToRemove.equals(array[x])){
                newArray[newArrayIndex] = array[x];
                newArrayIndex++;
            }
        }
        //if !valueToRemove.equals(x) 
        //add it to new array
        //increment newArrayIndex
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<String>();
        //Loop
        for(int i = 0;i < array.length-1;i++){
            if(!array[i].equals(array[i+1])){
                list.add(array[i]);
            }
        }
        list.add(array[array.length-1]);

        return list.toArray(new String[0]);

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String temp = "";
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < array.length ; i++) {
            if(array[i].equals(array[i-1])){
                temp+=array[i-1];
            }else {
                temp+=array[i-1];
                list.add(temp);
                temp="";
            }
        }
        temp += array[array.length-1];
        list.add(temp);
        System.out.println(list);
        return list.toArray(new String[0]);
    }

}
