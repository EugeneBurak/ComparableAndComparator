import java.util.Comparator;

/**
 * Created by java_dev on 25.04.17.
 */
public class SortedByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if (o1.age > o2.age)    {
            return 1;
        }
        if (o1.age < o2.age)    {
            return -1;
        }
        return 0;
    }
}
