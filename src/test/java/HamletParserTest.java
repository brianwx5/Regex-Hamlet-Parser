import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String word = "Hamlet, Leon";
        String expected = "Leon, Leon";

        //When
        String actual = hamletParser.changeHamletToLeon(word);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String word = "Horatio, horatio";
        String expected = "Tariq, Tariq";

        //When
        String actual = hamletParser.changeHoratioToTariq(word);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testChangeHoratioAndHamletToLeonAndTariq() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String word = "Horatio and Hamlet";
        String expected = "Tariq and Leon";

        //When
        String actual = hamletParser.changeHoratioAndHamletToLeonAndTariq(word);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testHamletParser() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String word = "Horatio and Hamlet";
        String expected = "Tariq and Leon";

        //When
        String actual = hamletParser.changeHoratioAndHamletToLeonAndTariq(hamletText);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }

}