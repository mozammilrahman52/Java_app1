package mock1;

import java.util.ArrayList;

public class D {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(200);
            list.add(300);
            list.add(200);
            list.add(300);
            list.add(101);

            int j = 0;  // Declare and initialize j outside the loop

            for (int i = 0; i < list.size() - 1; i++) {
                if (!list.get(i).equals(list.get(i + 1))) {
                    // Assign the current element to the position indicated by j
                    list.set(j, list.get(i));
                    j++;
                }
            }

            // Trim the list to remove the duplicates at the end
            list.subList(j, list.size()).clear();

            // Print the modified list
            for (int k = 0; k < list.size(); k++) {
                System.out.println(list.get(k));
            }
        }

}
