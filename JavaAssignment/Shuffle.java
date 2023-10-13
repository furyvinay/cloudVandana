import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            
            int random = i + (int) (Math.random() * (length - i));

            int temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }

        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
}
