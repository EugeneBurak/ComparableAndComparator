import java.util.Comparator;

/**
 * Created by java_dev on 25.04.17.
 */
public class CompImplComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = o1.compareTo(o2);
        if (result == 0)    {
            return o1.compareTo(o2);
        }
        return result;
    }
}
