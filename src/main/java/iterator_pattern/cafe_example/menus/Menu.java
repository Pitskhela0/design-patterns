package iterator_pattern.cafe_example.menus;


import iterator_pattern.cafe_example.iterators.Iterator;

public interface Menu <T>{
    public Iterator<T> createIterator();
}
