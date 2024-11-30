package Collection_Framework;


import java.util.*;

public class All_Programs {
    public static void main(String[] args) {

//  1.Write a Java program to create an array list, add some colors (strings) and print out the collection.//

        ArrayList<String> l = new ArrayList<>();
        l.add("Red");
        l.add("Orange");
        l.add("Blue");
        l.add("White");
        l.add("Green");
        l.add("Pink");
        l.add("Yellow");

        System.out.println(l);

//    2.Write a Java program to iterate through all elements in an array list. //

        for (String str : l) {
            System.out.println(str);
        }

//     3.Write a Java program to insert an element into the array list at the first position. //

        l.add(1, "Purple");
        System.out.println("3.Insert an element into 1st position " + l);

//       4.Write a Java program to retrieve an element (at a specified index) from a given array list. //

        System.out.println("4.Retrieve an element " + l.get(3));

//      5.Write a Java program to update an array element by the given element. //

        l.set(4, "Black");
        System.out.println("5.update element by given element " + l);

//        6.Write a Java program to remove the third element from an array list. //

        l.remove(3);
        System.out.println("6.remove third element " + l);

//     7.Write a Java program to search for an element in an array list.//

        if (l.contains("Pink")) {
            System.out.println("Pink is found in list");
        } else
            System.out.println("not found in list");

//     8.Write a Java program to sort a given array list. //

        Collections.sort(l);
        System.out.println("8.After sorting " + l);

//     9.Write a Java program to copy one array list into another. //

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Rose");
        l1.add("Lotus");
        l1.add("Tulip");

        System.out.println(l1);

        l.addAll(2, l1);
        System.out.println("9." + l);

//    10.Write a Java program to shuffle elements in an array list. //

        System.out.println("10.Original ArrayList " + l);

        Collections.shuffle(l);
        System.out.println("Shuffled Arraylist " + l);

//    11.Write a Java program to reverse elements in an array list.//

        Collections.reverse(l);
        System.out.println("11.After Reversing " + l);

//    12.Write a Java program to extract a portion of an array list. //

        ArrayList<String> sublist = new ArrayList<>(l.subList(1, 4));
        System.out.println("12.Extracted portion " + sublist);

//    13.Write a Java program to compare two array lists. //

        if (l == l1) {
            System.out.println("The two arrays are equal ");
        } else {
            System.out.println("13.Two arrays are not equal ");
        }

//    14.Write a Java program that swaps two elements in an array list. //

        String temp = l.get(1);
        l.set(1, l.get(3));
        l.set(3, temp);

        System.out.println("14.After Swapping " + l);

//    15.Write a Java program to join two array lists. //

        l1.addAll(3, l);
        System.out.println("15.Joined Array " + l1);

//    16.Write a Java program to clone an array list to another array list. //

        l1.clone();
        System.out.println("16.Cloned ArrayList " + l1);

//    17.Write a Java program to empty an array list. //

        l1.clear();
        System.out.println("17.After clearing arraylist " + l1);

//    18. Write a Java program to test whether an array list is empty or not. //

        if (l1.isEmpty()) {
            System.out.println("ArrayList IS Empty");
        }
        else{
            System.out.println("ArrayList is Not Empty");
        }

//     19. Write a Java program for trimming the capacity of an array list. //

        l.trimToSize();
        System.out.println("19.size after trimming " + l.size());

//     20. Write a Java program to increase an array list size. //

        l.ensureCapacity(10);
        l.add("Violet");
        l.add("Peach");
        l.add("Olive");

        System.out.println("20.After increasing size of Arraylist " + l);
        System.out.println("After increasing size " + l.size());

//    21. Write a Java program to replace the second element of an ArrayList with the specified element. //

        l.set(2,"Silver");
        System.out.println("21.After replaced element " + l);

//    22. Write a Java program to print all the elements of an ArrayList using the elements' position. //

        for (int i = 0; i < (l.size()); i++) {

            System.out.println("Element at index of " + i + " : " + l.get(i) );

        }
















    }
}
