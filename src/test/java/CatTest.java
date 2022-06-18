import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import static local.helpers.ArrayHelpers.equalsArrayValues;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = new Feline();
    private final Cat cat;

    public CatTest() {
        this.cat = new Cat(this.feline);
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Cat catMock;

    /*
    * Test getting sound Cat
    * */
    @Test
    public void testGetSoundVoid() {
        catMock.getSound();
        Mockito.verify(catMock).getSound();
    }
    /*
     * Test sound Cat correct
     * */
    @Test
    public void testGetSoundCorrect() {
        assertEquals("Мяу", cat.getSound());
    }

    /*
     * Test getting food Cat
     * */
    @Test
    public void testGetFoodVoid() {
        try {
            catMock.getFood();
            Mockito.verify(catMock).getFood();
        }catch(Exception e) {
            System.out.println("Ошибка при получении еды в классе Cat" + e);
        }
    }

    /*
     * Test getting food Cat
     * */
    @Test
    public void testGetFoodCorrect() {
        try {
            assertTrue(equalsArrayValues(Arrays.asList("Животные", "Птицы", "Рыба"), cat.getFood()));
        } catch (Exception e) {
            System.out.println("Ошибка при получении еды в классе Cat" + e);
        }
    }

}
