package autobox;

import java.util.ArrayList;
import java.util.List;

public class CollectionTests {

    public static void main(String[] args) {
        String[] colors = {"MAGENTA, RED, BLUE , CYAN"};
        List<String> list = new ArrayList<String>();

        for(String color : colors){
            list.add(color);
        }
    }
}
