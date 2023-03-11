import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("barsik", 2, 5),
                new Cat("murzik", 3, 2),
                new Cat("Vasya", 2, 4)));
        Iterator<Cat> ce = cats.iterator();

        while (ce.hasNext()) {
            System.out.println(ce.next().getName());
        }
        List<Cat> db = new ArrayList<>();

        for (Cat cat : cats) {
            db.add(cat);
        }
        System.out.println(db);
        db.sort(new AgeComporator());
        System.out.println(db);
    }
}