import java.util.Comparator;

/**
 * Created by java_dev on 25.04.17.
 */
public class SortedByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.name.compareTo(o2.name);
    }
}
