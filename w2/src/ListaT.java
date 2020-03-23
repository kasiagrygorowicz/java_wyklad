import java.util.Iterator;

public class ListaT implements Lista {

    private double t[] = new double[1000000];
    private int last = 0;

    public Iterator<Double> iterator() {
        return new MyIterator();
    }
    public int freeSpace() {
        return 1000000 - last;
    }



    private class MyIterator implements Iterator<Double> {
        private int it = 0;

        public boolean hasNext() {
            return it < last;
        }

        public Double next() {
            return t[it++];
        }
    }

    public void insert( double x ) {
        for( int i= last; i > 0; i-- )
            t[i] = t[i-1];
        t[0] = x;
        last++;
    }

    public void append( double x ) {
        t[last++] = x;
    }
}
