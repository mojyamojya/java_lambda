import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main4 {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.stream().filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
            
        })
        .forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer i) {
                System.out.println(i * 3);
            }
            
        });
    }
}