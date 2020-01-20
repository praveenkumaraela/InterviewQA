package Jan20.Java8;

import java.util.stream.Stream;

public class JavaStreams1 {

    public static void main(String args[]){

        Stream.of("Praveen","Eshwari","Aarush")
                .sorted()
                .findAny()
                .ifPresent(System.out::print);


    }
}
