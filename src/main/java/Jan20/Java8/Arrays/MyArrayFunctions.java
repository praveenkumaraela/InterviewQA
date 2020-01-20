package Jan20.Java8.Arrays;

import java.util.function.IntFunction;

public class MyArrayFunctions implements IntFunction<String[]> {





    @Override
    public String[] apply(int value) {
        return new String[value];
    }


}
