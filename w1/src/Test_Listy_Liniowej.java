public class Test_Listy_Liniowej {

    public static void main(String [] args) {
       Lista_Liniowa insercik = new Lista_Liniowa();
        Lista_Liniowa appendzik = new Lista_Liniowa();


        for( String s : args ) {
            insercik.insert( Double.parseDouble( s ) );
            appendzik.append( Double.parseDouble( s ) );
        }

        Element it = insercik.first();
        while( it != null ) {
            System.out.print( it.x + " -> " );
            it = it.next;
        }
        System.out.println( "Koniec" );

        it = appendzik.first();
        while( it != null ) {
            System.out.print( it.x + " -> " );
            it = it.next;
        }
        System.out.println( "Koniec" );
    }
}
