package Jan20.Collection;

import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysToList {

public static void main(String[] args) {
     /* Array Declaration and initialization*/
    String citynames[] = {"Praveen", "Aarush", "eshwari"};
    System.out.println(citynames[0]);
    Arrays.stream(citynames).sorted();

    System.out.println("Sorted + First = " + Arrays.stream(citynames).sorted().findFirst().toString());
    System.out.println("First = " + Arrays.stream(citynames).findFirst().toString());

    ArrayList<String> cityList = new ArrayList<String>(Arrays.asList(citynames));
    cityList.add("Savithri");
    cityList.add("Suman");
    System.out.println(cityList);

    System.out.println(" Arrays List For Loop ..... ");
    for(String str: cityList ){
        System.out.println(str);
    }
 }
}



