package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        //adding the elements
        list.addFirst("Akram");
        list.add("Rahman");
        list.addLast("Salman");

        //deleting the elements
        /*
        list.remove("Rahman");
        list.remove(0);
        list.removeFirst();
        list.removeLast();
        list.removeFirstOccurrence("Salman");
        list.removeLastOccurrence("Salman");
        */

        //Traversal
        list.add("Akram");
        list.add("Hafeeza");
        list.add("Parvez");
        list.add("Salman");
        list.add("Rahman");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String temp = itr.next();
            System.out.println(temp);
        }


        //searching
        boolean isAkramPresent = list.contains("Akram");
        int akramPosition = list.indexOf("Akram");

        System.out.println("Akram present "+isAkramPresent+ " at "+akramPosition);

        //updating
        list.set(0,"Mohammed Akramudding");

        //size checking
        System.out.println("Family is of size "+list.size());

        //clearing the list
        list.clear();
        System.out.println(list.size());

        //getting first and last elements
        list.add("Akramuddin");
        list.add("Abdul Rahman");

        System.out.println("Eldest in the family : "+list.getFirst()+" \nYoungest in the family : "+list.getLast());

    }
}
