package iterator_pattern.cafe_example.iterators;

import iterator_pattern.cafe_example.MenuItem;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }

}
