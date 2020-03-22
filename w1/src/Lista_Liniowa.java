public class Lista_Liniowa {

    private Element head;

    //konstruktor
    Lista_Liniowa(){

    }

    public Element first(){
        return head;
    }
//dodaje na poczatek losty, kolejnosc wypisywania odwrotna
    public void insert(double x){
        head= new Element(x,head);
    }

//dodaje na koniec listy, tak jak podamy argumenty tak beda wyswietlone w tescie
    public void append (double  x){
        if(head==null){
            head=new Element(x);
        }else{
            Element it = head;
            while(it.next!=null)
                it=it.next;
            it.next=new Element(x);
        }
    }

}
