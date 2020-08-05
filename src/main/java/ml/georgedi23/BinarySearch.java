package ml.georgedi23;

import java.util.Arrays;

public class BinarySearch {


    public Integer iterativeBinarySearch(Integer[] intArray, Integer searchedValue) {
        int start = 0;
        int end = intArray.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2; // protecting for large values edge case for overflow error

            if (searchedValue == intArray[middle]) {
                return middle;
            } else if (searchedValue < intArray[middle]) {
                end = middle - 1;
            } else {
                start = middle +1;
            }
        }
        return null;
    }

    public Integer recursiveBinarySearch(Integer[] intArray, Integer searchedValue, Integer startingIndex) {
            int middle = intArray.length / 2; // protecting for large values edge case for overflow error

            if (searchedValue == intArray[middle]) {
                return middle + startingIndex;
            } else if (searchedValue < intArray[middle]) {
                return recursiveBinarySearch(Arrays.copyOf(intArray, intArray.length/2), searchedValue, startingIndex);
            } else if (searchedValue > intArray[middle]){
                return recursiveBinarySearch(Arrays.copyOfRange(intArray, (intArray.length/2)+1,intArray.length), searchedValue, middle+1);
            } else {
                return null;
            }
    }




}
