import com.example.Feline;
import com.example.Lion;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;



@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;

    private final int countKittens;
    private final boolean haveMane;

    private final List<String> meal = Arrays.asList("Животные", "Птицы", "Рыба");

    private Feline feline;

    public LionTest (String sex, int countKittens, boolean haveMane) {
        this.sex = sex;
        this.countKittens = countKittens;
        this.haveMane = haveMane;
        this.feline = new Feline();
    }

    @Parameterized.Parameters
    public static List<Object[]> parameters() {
        return Arrays.asList(
                new Object[] { "Самец", 1, true },
                new Object[] {"Самка", 1, false }
                );
    }

    private boolean equalsArrayValues(List<String>ActualArr, List<String>expectedArr) {
        for(String item : ActualArr) {
            if(!expectedArr.contains(item)) {
                return false;
            }
        }
        return true;
    }

    /*
     * Test getting count kitten
     * */
    @Test
    public void testGetKitten() {
        try {
            Lion lion = new Lion (sex, feline) ;
            assertEquals(countKittens, lion.getKittens());
        } catch (Exception e) {
            System.out.println("Ошибка при создании экзепляра класса Lion: " + e);
        }

    }

    /*
     * Test does have mane
     * */
    @Test
    public void testDoesHaveMane() {
        try {
            Lion lion = new Lion (sex, feline) ;
            assertEquals(haveMane, lion.doesHaveMane());
        } catch (Exception e) {
            System.out.println("Ошибка при создании экзепляра класса Lion: " + e);
        }
    }

    /*
    * Test getting food
     * */
    @Test
    public void testGetFood(){
        try {
            Lion lion = new Lion (sex, feline) ;
            try {
                List<String> lionFood = lion.getFood();
                System.out.println(meal);
                System.out.println(lionFood);
                assertTrue(equalsArrayValues(meal, lionFood));
            } catch(Exception e) {
                System.out.println("Ошибка при получение еду для класса Lion: " + e);
            }
        } catch (Exception e) {
            System.out.println("Ошибка при создании экзепляра класса Lion: " + e);
        }
    }

}
