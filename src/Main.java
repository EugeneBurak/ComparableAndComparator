import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("============ CompImplComparable ============ ");

        TreeSet<CompImplComparable> ex = new TreeSet<CompImplComparable>();
        ex.add(new CompImplComparable("Stive Global", 21));
        ex.add(new CompImplComparable("Stive Global", 22));
        ex.add(new CompImplComparable("Nancy Summer", 32));
        ex.add(new CompImplComparable("Aaron Eagle", 23));
        ex.add(new CompImplComparable("Barbara Smith", 86));

        for(CompImplComparable e : ex) {
            System.out.println("Name: " + e.name + ", age: " + e.age);
        }

        System.out.println("============ CompImplComparableReverseSort ============ ");

        TreeSet<CompImplComparableReverseSort> ex1 = new TreeSet<CompImplComparableReverseSort>();
        ex1.add(new CompImplComparableReverseSort("Stive Global", 21));
        ex1.add(new CompImplComparableReverseSort("Stive Global", 22));
        ex1.add(new CompImplComparableReverseSort("Nancy Summer", 32));
        ex1.add(new CompImplComparableReverseSort("Aaron Eagle", 23));
        ex1.add(new CompImplComparableReverseSort("Barbara Smith", 86));
        ex1.add(new CompImplComparableReverseSort("Arnold Barak", 33));
        ex1.add(new CompImplComparableReverseSort("Barak Arnold", 33));

        for(CompImplComparableReverseSort e : ex1) {
            System.out.println("Name: " + e.name + ", age: " + e.age);
        }

        System.out.println("============ CompImplComparator ============ ");

        TreeSet<String> ex2 = new TreeSet<String>(new CompImplComparator());
        ex2.add("Stive Global");
        ex2.add("Stive Cooper");
        ex2.add("Nancy Summer");
        ex2.add("Aaron Eagle");
        ex2.add("Barbara Smith");

        Iterator<String> i = ex2.iterator();

        while(i.hasNext()) {
            String ts = i.next();
            System.out.println("Str: " + ts);
        }

        System.out.println("============ CompImplComparator Name & age ============ ");

        Human[] humen = new Human[3];
        humen[0] = new Human("Mike", 56);
        humen[1] = new Human("Corvin", 32);
        humen[2] = new Human("Tom", 50);

        System.out.println("============ no sorted ============");

        for(Human j : humen) {
            System.out.println("Name: " + j.name + "; age: " + j.age);
        }

        System.out.println("============ sorted by age ============");

        Arrays.sort(humen, new SortedByAge());

        for(Human k : humen) {
            System.out.println("Name: " + k.name + "; age: " + k.age);
        }

        System.out.println("========== sorted by name ===========");

        Arrays.sort(humen, new SortedByName());
        for(Human ii : humen) {
            System.out.println("Name: " + ii.name +"; age: " + ii.age);
        }
    }

}
