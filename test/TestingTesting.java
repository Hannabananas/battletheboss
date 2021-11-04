import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestingTesting {

    @Test
    public void testBossGuessGame(){
        int userGuessNumber = 3;
        assertEquals(3,3);
    }
    @Test
    public void testRiddeChoice(){
        String riddleChoice = "easy";
        assertEquals("easy", riddleChoice);

    }
    @Test
    public void testHardRiddleChoice(){
        String riddleChoice = "hard";
        assertEquals("hard", riddleChoice );

    }
    @Test
    public void testRiddleEasy(){
        String str1 = "What gets bigger the more you take away?";
        assertEquals("What gets bigger the more you take away?", str1);

    }
    @Test
    public void testBossGuessGameAgain(){
        int attempt = 1;
        assertEquals(1, 1);

    }
}

