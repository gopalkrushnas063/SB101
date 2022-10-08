import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,7,69,4,3,87};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,7);
        System.out.println(index);
    }
}
