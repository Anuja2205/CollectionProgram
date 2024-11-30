package Collection_Framework;

import java.util.*;

public class HashSet_Programs {
    public static void main(String[] args) {

        HashSet h = new HashSet<>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");

        System.out.println(h);

//  1. Write a Java program to append the specified element to the end of a hash set. //

        h.add(10);
        System.out.println("1.After append an element " + h );

//  2. Write a Java program to iterate through all elements in a hash list. //

        for (Object o: h){
            System.out.println("2. " + o);
        }

//  3. Write a Java program to get the number of elements in a hash set. //

        System.out.println("3.Number of elements " + h.size());

//  4. Write a Java program to empty an hash set. //

        h.clear();
        System.out.println("4." + h);

//  5. Write a Java program to test if a hash set is empty or not. //

        if (h.isEmpty()) {
            System.out.println("HashSet is Empty ");
        }
        else {
            System.out.println("HashSet is not Empty");
        }

//  6. Write a Java program to clone a hash set to another hash set. //

        HashSet<String> h1 = new HashSet();
        h1.add("20");
        h1.add("30");
        h1.add("40");

        System.out.println("6.Before Clone HashSet " + h1);

        h1.clone();
        System.out.println("After cloned HashSet " + h1);

//  7. Write a Java program to convert a hash set to an array. //

        String[] array = new String [h1.size()];
        h1.toArray(array);

        System.out.println("7.Array Elements :");
        for(String item : array){
            System.out.println(item);
        }

//  8. Write a Java program to convert a hash set to a tree set. //

        TreeSet<String> treeSet = new TreeSet<>(h1);

        System.out.println("8.TreeSet Elements: ");
        for (String item: treeSet){
            System.out.println(item);
        }

//  9. Write a Java program to find numbers less than 7 in a tree set. //

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(7);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(4);
        System.out.println("Numbers less than 7 are: " );

        for (Integer number : treeSet1.headSet(7) ){
            System.out.println(number);
        }

//  10. Write a Java program to compare two hash set.  //

        HashSet<String> hs = new HashSet<>();
        hs.add("Anuja");
        hs.add("Pragati");
        hs.add("Anjali");

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Anuja");
        hs1.add("Pragati");
        hs1.add("10");

        if (hs1.equals(hs)){
            System.out.println("10.Both HashSets are equal");
        }
        else{
            System.out.println("10.Both HashSets are not equal");
        }

//  11. Write a Java program to compare two sets and retain elements that are the same. //

        HashSet<String> set1 = new HashSet<>();
        set1.add("100");
        set1.add("200");
        set1.add("300");
        set1.add("400");

        HashSet<String> set2 = new HashSet<>();
        set2.add("500");
        set2.add("600");
        set2.add("200");

        System.out.println("Set 1: " + set1 );
        System.out.println("Set 2: " + set2);

        set1.retainAll(set2);

        System.out.println("Common Elements: " + set1);

//  12. Write a Java program to remove all elements from a hash set. //

        set1.clear();
        System.out.println(set1);

            }
        }




