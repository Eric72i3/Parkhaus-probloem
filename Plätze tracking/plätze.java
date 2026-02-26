public class Parkhaus{
    public static int frei(int gesamt, int besetzt) {return gesamt-besetzt;}
    
    public static void main (String args[]){
    
    int gesamt=200;
    int besetzt=0;
    int freieplaetze = gesamt-besetzt;

    System.out.println("Verfügbare Parkplätze: " + freieplaetze);

    int einfahren;

        if (freieplaetze>0) {
            einfahren = 1;
            System.out.println("Darf einfahren" );
        }
        else {
            einfahren = 0;
            System.out.println("Darf nicht einfahren" );
        }


  }
}
