package iterator_pattern.cafe_example.menus;

import iterator_pattern.cafe_example.iterators.DinnerMenuIterator;
import iterator_pattern.cafe_example.iterators.Iterator;
import iterator_pattern.cafe_example.MenuItem;


public class DinnerMenu implements Menu<MenuItem>{
    MenuItem[] menuItems;
    public DinnerMenu(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
