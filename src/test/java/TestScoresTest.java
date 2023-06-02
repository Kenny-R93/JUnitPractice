import org.example.TestScores;
import org.junit.After;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestScoresTest {
    @Test
    void fiftyNineOrLowerReturnsF() {
        TestScores F = new TestScores();
        assertEquals("F", F.calculateGrade(59));
    }

    @Test
    void sixtyReturnsD() {
        TestScores D = new TestScores();
        assertEquals("D", D.calculateGrade(60));
    }

    @Test
    void seventyReturnsC() {
        TestScores C = new TestScores();
        assertEquals("C", C.calculateGrade(70));
    }

    @Test
    void eightyReturnsB() {
        TestScores B = new TestScores();
        assertEquals("B", B.calculateGrade(80));
    }

    @Test
    void ninetyOrHigherReturnsA() {
        TestScores A = new TestScores();
        assertEquals("A", A.calculateGrade(90));
    }
}
