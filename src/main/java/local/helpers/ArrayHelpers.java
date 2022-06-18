package local.helpers;
import java.util.List;

public class ArrayHelpers {
    /*
     * Array comparison method (List<String>, List<String>)
     * */
    public static boolean equalsArrayValues(List<String> ActualArr, List<String>expectedArr) {
        for(String item : ActualArr) {
            if(!expectedArr.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
