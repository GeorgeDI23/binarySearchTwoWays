package ml.georgedi23;

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




}
