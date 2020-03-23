import java.util.Iterator;

public class Lista_Liniowa implements Lista {

    private Element head;

    public Lista_Liniowa() {
    } //konstruktor, nie trzeba pisac java sama zrobi jesli jest pusty


    public Iterator<Double> iterator() {
        return new MyIterator();
    }


    private class MyIterator implements Iterator<Double> {
        private Element current = head;

        public boolean hasNext() {
            return current != null;
        }

        public Double next() {
            double x = current.x;
            current = current.next;
            return x;
        }

    }






    private class Element {
        double x;
        Element next;

        Element(double x) {
            this.x = x;
            this.next = null;
        }

        Element(double x, Element n) {
            this.x = x;
            this.next = n;
        }
    }

        public void insert(double x){
            head= new Element(x,head);
        }


        public void append(double x){
            if(head==null){
                head =new Element(x);
            }else{
                Element it =head;
                while(it.next!=null)
                    it=it.next;
                it.next= new Element(x);
            }
        }

}
