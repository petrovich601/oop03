import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable<Cat>, Comparator<Cat> {
    private List<Cat> catList;

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    @Override
    public Iterator<Cat> iterator() {
        return new ListOfCatIterator(catList);
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return 0;
    }
}
