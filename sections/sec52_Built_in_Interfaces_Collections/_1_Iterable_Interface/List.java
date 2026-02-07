package sections.sec52_Built_in_Interfaces_Collections._1_Iterable_Interface;

import java.util.Iterator;

public class List<T> implements Iterable {
    // public T[] items = (T[]) new Object[10];             // Iterable interface'inin kullanılmadığı durumda main metodda foreach yaparken items variable'ına erişebilmesi için public yapmak gerekir
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {        // En üstte implements Iterable dedikten sonra otomatik eklenir
        // return null;
        return new ListIterator(this);
    }

    // Alttaki metodlar, Iterator'ın çalışabilmesi için eklendi (Alttaki kısımlar eklenmeden önce main metodda yazan kod çalışmıyordu)
    // hasNext() ve next() metodları Iterator interface'inin built-in metodlarıdır
    private class ListIterator implements Iterator<T> {
        private List<T> list;
        private int index;

        public ListIterator(List<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            // return false;
            return (index < list.count);
        }

        @Override
        public T next() {
            // return null;
            return list.items[index++];
        }
    }
}
