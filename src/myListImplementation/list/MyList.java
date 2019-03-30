package myListImplementation.list;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return false;
        }
        return super.add(o);
    }

    private boolean isExists(Collection c) {
        for (Object element : c) {
            for (Object thisElement : this) {
                if (element.equals(thisElement)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        // если хоть один элемент коллекции совпадает с элементом текущей, то коллекция не добавляется
        if (isExists(c)) {
            return false;
        }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (index <= this.size()) {
            // если хоть один элемент коллекции совпадает с элементом текущей, то коллекция не добавляется
            if (isExists(c)) {
                return false;
            }
            return super.addAll(index, c);
        }
        return false;
    }

    @Override
    public void add(int index, Object element) {
        if (index <= this.size() && !this.contains(element)) {
            super.add(index, element);
        }
    }
}
