package iterator_pattern.cafe_example.menus;

import iterator_pattern.cafe_example.iterators.Iterator;
import iterator_pattern.cafe_example.iterators.PancakeHouseIterator;


public class PancakeHouseMenu implements Menu<String>{
    @Override
    public Iterator<String> createIterator() {
        return new PancakeHouseIterator();
    }
}
