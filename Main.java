package com.company;
import java.lang.Math ;

public class Main {

    public static void main(String[] args) {
        //Hello World
        System.out.println("Hello world!");
        int i = 2;

        // Exponential
        System.out.println(Math.pow(i,-100));

        //Simple Loop
        printLoop(30);

        // Simple List
        int [] myList;
        myList = new int [] {1,2,3,4};
        printList(myList);

        //Creating List of size n
       int [] list;
       list = createList(100);
       printList(list);

       //get max in the list
        System.out.println("this is max value of the list "+  maxlist(list));


       //Remove the element
        int [] my_list;
        my_list = remove(list,10);
        System.out.print("we remove "+10);
        printList(my_list);

        // Strings

        String s ="AMAN";
        String t;
        t = s.substring(1,4);
        System.out.println(t);

        //Math

        System.out.println(Math.sqrt(80));




    }

    // Simple Loop
    public static void printLoop(int n){
        int i;
        for (i=0; i < n; i++){
            System.out.println(n);
            n--;
        }
    }

    // Simple List
    public static void printList( int [] myList){
        int i;
        for(i= 0 ; i<myList.length; i++)
        System.out.println(myList[i]+" ");

    }

    //Creating a List of Specified number
    public static int[] createList(int n){
        int [] list;
        int i;
        list = new int[n];

        for (i=0; i<n; i++) {
            list[i] = i ;
        }
        return list;

    }

    //Get the max value of the list
    public static int maxlist(int[] mylist) {
        int max;
        int i;
        max = mylist[0];

        for (i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[i];
            }
        }
        return max;
    }

    //Remove a particular element
    public static int [] remove(int[] list , int element){
        int [] newList;
        int position;
        int i;
        position = -1;
        for( i = 0; i <list.length; i++){
            if(list[i] == element){
                position = i;
            }
        }
        if(position == -1) {
            System.out.println("we did not find the element");
            newList = list;
        }
        else {
            newList = new int[list.length - 1];
            System.arraycopy(list, 0, newList, 0, position);
            System.arraycopy(list, position + 1, newList, position, newList.length - position);
        }
        return newList;



    }


}
