/**
 * Created by java_dev on 24.04.17.
 */
public class CompImplComparable implements Comparable{
    String name;
    int age;

    public CompImplComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        CompImplComparable entry = (CompImplComparable) o;

        int result = name.compareTo(entry.name);
        if (result != 0)    {
            return result;
        }

        result = age - entry.age;
        if (result != 0)    {
            return (int) result / Math.abs(result);         //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        }
        return 0;
    }
}
