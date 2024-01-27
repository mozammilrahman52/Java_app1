package mock1;

import java.util.ArrayList;

public class E {
    public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(200);
    list.add(300);
    list.add(200);
    list.add(300);
    list.add(101);


    ArrayList uniqueList = new ArrayList();


    for (int i = 0; i < list.size(); i++) {

        if (!uniqueList.contains(list.get(i))) {
            uniqueList.add(list.get(i));
        }
    }


    for (Object element : uniqueList) {
        System.out.println(element);
    }
  }
}
