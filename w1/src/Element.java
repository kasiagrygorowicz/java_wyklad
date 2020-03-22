public class Element {

    double x;
   Element next;

   //konstruktory
   Element(double x){
       this.x=x;
       this.next=null;

    }

   Element(double x, Element n){
       this.x=x;
       this.next=n;
   }



}
