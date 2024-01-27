package mock1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
         myList.add(10);
         myList.add(20);
         myList.add("Mozammil");
         myList.add('A');
         myList.remove(1);
        System.out.println(myList.get(0));
        System.out.println(myList);
    }

}
class MyArrayList{//Object
     Object[] obj = new Object[5];
     int size = 0;
    public void add(Object data){
        obj[size++] = data;
        if(size==obj.length){
            Object[] newObj = new Object[(obj.length)*2];
            for (int i=0; i<obj.length; i++){
                newObj[i] = obj[i];
                obj = newObj;
            }
        }

    }

    public void remove(int i){
        obj[i] = "";
    }
    public Object get(int i){
        return obj[i];
    }
    public String toString(){
        for (int i=0; i<obj.length; i++){
            System.out.println(obj[i]);
        }
        return " ";
    }


}