package array12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
//    inp1 = [1,2.3,4,8,4,5,3,6,7,8]
//    find distinct even numbers and then using map, find their squares.
//    distinct even numbers result = [2,4,6,8]
//    final result = [4,16,36,64]

    public static void main(String[] args) {
        List<Integer> inp1 = Arrays.asList(1,2,4,8,4,5,3,6,7,8);
//        List<Integer> distinctEven = inp1.stream().filter(x->x%2==0).distinct()
//                .collect(Collectors.toList());
        List<Integer> distinctEven = inp1.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Even Number:"+distinctEven);

        List<Integer> finalResult = distinctEven.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("Final Result:"+finalResult);
    }

}
