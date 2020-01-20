package Jan20.Factory;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Line implements GeomentricShape{

    @Override
    public void draw(){
        System.out.println("Draw Line");
    }
}
