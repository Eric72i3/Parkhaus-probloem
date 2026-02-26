public class Parkhaus{
    public static void main (String args[]){
        int einfahren;

        if (freieplaetze>0) {
            einfahren = 1;
        }
        else {
            einfahren = 0;
        }
        System.out.println("Darf einfahren: " + einfahren);
    }
}
