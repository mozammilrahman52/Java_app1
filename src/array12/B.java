package array12;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class B {


        public static void main(String[] args) {
            List<Integer> inp1 = Arrays.asList(1, 2, 3, 4, 8, 4, 5, 3, 6, 7, 8);

            // Find distinct even numbers
            List<Integer> distinctEvenNumbers = inp1.stream()
                    .filter(number -> number % 2 == 0)
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println("Distinct even numbers: " + distinctEvenNumbers);

            // Find squares of distinct even numbers
            List<Integer> squares = distinctEvenNumbers.stream()
                    .map(number -> number * number)
                    .collect(Collectors.toList());

            System.out.println("Squares of distinct even numbers: " + squares);
        }


}
