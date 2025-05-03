package iterator_pattern.cafe_example;

import iterator_pattern.cafe_example.iterators.Iterator;

import java.awt.*;

public class Cafe {
    Menu panCakeHouseMenu;
    Menu dinnerMenu;
    public Cafe(Menu panCakeHouseMenu, Menu dinnerMenu){
        this.dinnerMenu = dinnerMenu;
        this.panCakeHouseMenu = panCakeHouseMenu;
    }

    public void printMenu(Iterator<iterator_pattern.cafe_example.MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
