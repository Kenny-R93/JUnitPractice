import org.example.TestScores;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestScoresTest {
    @Test
    void NinetyOrHigherReturnsA(){
        TestScores A = new TestScores();
        assertEquals("A", A.calculateGrade(90));
    }
}
