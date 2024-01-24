import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.stream().filter(i -> i % 2 == 0)
        .forEach(i -> System.out.println(i * 2));
    }
}