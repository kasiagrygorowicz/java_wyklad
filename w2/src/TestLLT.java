
    public class TestLLT {
        public static void main( String [] args ) {
            Lista l = new Lista_Liniowa();
            Lista k = new ListaT();

            for( String s : args ) {
                l.insert( Double.parseDouble( s ) );
                k.insert( Double.parseDouble( s ) );
            }

            System.out.println( ((ListaT)k).freeSpace() );

            for( Double d : l ) {
                System.out.print( d + " -> " );
            }
            System.out.println( "Koniec" );

            for( Double d : k ) {
                System.out.print( d + " -> " );
            }
            System.out.println( "Koniec" );
        }
    }


