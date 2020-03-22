public class TestStosu {
    public static void main(String [] args){
        Stos s= new Stos(4);

        for(String st : args){
            int i= Integer.parseInt( st );
            s.daj(i);
        }

        System.out.println("Capacity:  "+s.capacity());

        while(!s.empty()){
            System.out.println(s.wez());
        }
    }

}
