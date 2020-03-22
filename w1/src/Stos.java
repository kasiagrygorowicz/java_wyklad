public class Stos {
    private int [] stos;
    private int wsk_stosu;

    public Stos(){
        stos=new int[16];
        wsk_stosu=0;
    }

    public Stos(int size){
        stos=new int[size];
        wsk_stosu=0;
    }

    public void daj (int x){
        if(wsk_stosu==stos.length)
            doubleSize();
        stos[wsk_stosu++]= x;

    }

    public void doubleSize(){
        int [] nowy_stos =new int[2*stos.length];
                for(int i=0;i<wsk_stosu;i++)
                nowy_stos[i]=stos[i];
                stos=nowy_stos;
    }

    public int wez(){
        return stos[--wsk_stosu];

    }

    public boolean empty(){
        return wsk_stosu==0;
    }

    public int capacity(){
        return stos.length;
    }

}
