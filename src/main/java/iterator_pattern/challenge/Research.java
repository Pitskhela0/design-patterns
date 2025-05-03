package iterator_pattern.challenge;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Research {
    public static void main(String[] args) {

    }

    private Iterator<Integer> iterator(){
        List<Integer> list = new ArrayList<>();
        return new Iterator<Integer>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public Integer next() {
                return list.get(index++);
            }
        };
    }
}
