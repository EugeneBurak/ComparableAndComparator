/**
 * Created by java_dev on 25.04.17.
 */
public class CompImplComparableReverseSort implements Comparable {
    String name;
    int age;

    public CompImplComparableReverseSort(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        CompImplComparableReverseSort entry = (CompImplComparableReverseSort) o;

        int result;
        result = entry.age - age;           //Changed position of operators.
        if (result != 0)    {
            return (int) result / Math.abs(result);         //It is necessary to obtain -1 OR +1.
        }

//        result = entry.name.compareTo(name);            //Changed position of operators.
//        if (result != 0)    {
//            return result;
//        }
//        return 0;


        String str1 = name.substring(name.indexOf(" "));            //Comparison by last name
//        System.out.println(str1);
        String str2 = entry.name.substring(entry.name.indexOf(" "));
//        System.out.println(str2);
        result = str2.compareTo(str1);            //Changed position of operators.
        if (result != 0)    {
            return result;
        }
        return 0;
    }
}
