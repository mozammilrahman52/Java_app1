package mock1;

import java.util.ArrayList;
import java.util.List;

public class C {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(200);
        list.add(300);
        list.add(200);
        list.add(300);
        list.add(101);

        int j = 0;
       // int C = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {

//                list.get(j) = list.get(i);
                list.set(j, list.get(i));
                j++;
               // C++;
            }
        }
        list.subList(j, list.size()).clear();
        int k = 0;
        for (k = 0; k < list.size()-1; k++) ;
        System.out.println(list.get(k));
    }

}
