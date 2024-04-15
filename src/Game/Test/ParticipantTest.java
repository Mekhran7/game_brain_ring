package Game.Test;

import Game.Students;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipantTest {

    @Test
    void getName() {
        assertEquals("Olga",new Students("Olga", 19).getName());
        assertEquals("Kolya",new Students("Kolya", 20).getName());
    }

    @Test
    void getAge() {
        assertEquals(19,new Students("Olga", 19).getAge());
        assertEquals(20,new Students("Kolya", 20).getAge());
    }
}