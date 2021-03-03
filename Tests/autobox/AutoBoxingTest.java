package autobox;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutoBoxingTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void autoBox(){
        int theAge = 15;
        Integer age = theAge;
    }

    @Test
    void autoUnboxing(){
        Double theBalance = Double.valueOf(25.3);
        double balance = theBalance;
    }

    @Test
    void pentaxList(){
        List<String> pentax = new ArrayList<>();
        pentax.add("sukanmi");
        pentax.add("onyie");
        pentax.add("billy");

        Iterator<String> names = pentax.iterator();
        while (names.hasNext()){
            System.out.println(names.next());
        }

        assertTrue(pentax.size() == 3);

        pentax.remove("onyie");


    }
}