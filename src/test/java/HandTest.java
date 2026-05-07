import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    @Test
    void getValue() {
        Card card = new Card("Hearts","K");
        card.flip();

        int actualPointValue = card.getPointValue();

        int expectedPointValueOfKing = 11;

        Assertions.assertEquals(expectedPointValueOfKing,actualPointValue);

    }
}