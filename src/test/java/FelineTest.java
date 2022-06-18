import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import static local.helpers.ArrayHelpers.equalsArrayValues;


public class FelineTest {
    private Feline feline;

    public FelineTest() {
        this.feline = new Feline();
    }

    /*
    * Test eat meet Feline
    * */
    @Test
    public void testEatMeat() {
        try {
            assertTrue(equalsArrayValues(Arrays.asList("Животные", "Птицы", "Рыба"), feline.eatMeat()));
        } catch (Exception e) {
            System.out.println("Ошибка при создании экзепляра класса Feline: " + e);
        }
    }

    /*
     * Test getting family Feline
     * */
    @Test
    public void testGetFamily() {
        assertEquals( "Кошачьи" ,feline.getFamily());
    }

    /*
     * Test getting kittens without params
     * */
    @Test
    public void testGetKittensNonParams() {
        assertEquals( 1,feline.getKittens());
    }

    /*
     * Test getting kittens with param
     * */
    @Test
    public void testGetKittensWithParam() {
        assertEquals( 2,feline.getKittens(2));
    }
}
