package ArrayList;
/*
*
Add elements: list.add(value)
Access elements: list.get(index)
Update elements: list.set(index, value)
Remove elements: list.remove(index or value)
Size of ArrayList: list.size()
Check if it contains an element: list.contains(value)
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);

        //before removing
        for(int i=0;i<list.size();i++){
//            System.out.print("index = "+i+" element = "+list.get(i)+"\n");
        }

        //after removing
        list.remove(0);
        for(int i=0;i<list.size();i++){
//            System.out.print("index = "+i+" element = "+list.get(i)+"\n");
        }

        list.set(0,99);
        for(int i=0;i<list.size();i++){
//            System.out.print("index = "+i+" element = "+list.get(i)+"\n");
        }

        boolean status99 = list.contains(99);
        System.out.println("99 Present : "+status99);


        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry","Guava"));
        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            String fruit = itr.next();
            if(fruit.equals("Cherry")){
                itr.remove();
            }
        }

        System.out.println(fruits);
    }
}
