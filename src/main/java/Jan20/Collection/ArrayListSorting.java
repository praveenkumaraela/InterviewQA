package Jan20.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting  {

    //https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
    public static void main(String args[]){
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(223, "Chaitanya", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 32));

//        arraylist = Collections.sort(arraylist);

        for(Student str: arraylist){
            System.out.println(str.getStudentname());
        }
        sortArrays();

    }


    public static void sortArrays(){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Praveen");
        arrList.add("Eshwari");
        arrList.add("Aarush");
        Collections.sort(arrList);
        System.out.println("Calling Arrary List after SORT...");
        System.out.println(arrList);


    }
}