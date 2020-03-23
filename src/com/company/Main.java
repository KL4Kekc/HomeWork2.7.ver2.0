package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Введите текст А");
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        Iterator<String> iteratorA = listA.iterator();
        while (iteratorA.hasNext()) {
            String string1 = (String) iteratorA.next();
            System.out.println(string1);
        }
        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите текст Б");
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        Iterator<String> iteratorB = listB.iterator();
        while (iteratorB.hasNext()) {
            String string2 = (String) iteratorB.next();
            System.out.println(string2);
        }
        System.out.println("-------------");


        ArrayList<String> listC = new ArrayList<>();
        iteratorA = listA.iterator();
        iteratorB = listB.iterator();
        Collections.reverse(listB);

        while (iteratorA.hasNext()) {
            String list1 = iteratorA.next();

            String list2 = iteratorB.next();
            listC.add(list1);
            listC.add(list2);
            System.out.println(list1);
            System.out.println(list2);
        }

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                if (string1.length() < string2.length())
                    return -1;
                else {
                    return 1;
                }

            }
        });
        System.out.println(listC);
    }
}
