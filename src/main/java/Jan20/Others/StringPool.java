package Jan20.Others;

import java.util.HashMap;
import java.util.Map;

public class StringPool {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";

        if(str==str2){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }


        //Calling Map
        System.out.println(getHashMapDtls());

      /*  Map map = getHashMapDtls();

        map.entrySet().stream()
                .forEach(k, v) -> System.out.println();*/

    }

    public static HashMap<String, String> getHashMapDtls() {

        HashMap<String, String> testNull = new HashMap<>();

        testNull.put(null, "Sairam");
        testNull.put(null, "Sairam-Replace above KEY");
        testNull.put("1", "Sairam2");
        testNull.put("2", "Sairam3");
        return testNull;
    }
}
