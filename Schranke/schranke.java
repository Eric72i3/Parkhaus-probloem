import java.util.Scanner;
public class Schranke{
    // Platzhalter
    static int belegt = 20;
    static int gesamt = 200;
    static int bezahlt = 1;
    static int plfrei = 1;
    // Platzhalter

    // An Eric und Piotr:
    //  Das was wir in der Schule gemacht haben wurde nicht gespeichert, ich hab es jetzt einfach neu gemacht.
    // Die Namen von den Variablen müssen wir noch mit den anderen abgleichen und ich hab die Class jetzt anders genannt eil es sonzt mit den anderen Datein nicht funktziopniert hat
    // Habe auch noch eine while schleife eingebaut damit eine ungültige eingabe nicht das ganze Programm zum absturz bringt
    // Die eingabe ist jetzt auch ein String damit man bei irgendeiner eingabe keinen Absturtz bekommt
    
    public static void main (String args[]){
        boolean invalide_eingabe = true;
        while (invalide_eingabe == true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Möchten Sie einfahren (1) oder ausfahren (0)?");
        String einfahren = sc.nextLine();

        if (einfahren.equals("1") && bezahlt == 1 && plfrei == 1) {
            invalide_eingabe = false;
            belegt = belegt + 1;
            bezahlt = 0;
            plfrei = 0;// Wird oben neu auf 1 gesetzt
            System.out.println("Einfahrschranke wird geöffnet");
        } else if (einfahren.equals("0") && bezahlt == 0) {
            invalide_eingabe = false;
            System.out.println("Bitte bezahlen Sie zuerst");
        } 
        // Sollte nie passieren, da man ohne freie Plätze nicht bezahlen kann, aber zur Sicherheit
        else if (einfahren.equals("1") && plfrei == 0) {
            System.out.println("Es sind keine freien Plätze mehr vorhanden");
        }else if (einfahren.equals("0")) {
            belegt = belegt - 1;
            invalide_eingabe = false;
            System.out.println("Ausfahrschranke wird geöffnet");
        } else {
            System.out.println("ungültige eingabe");  // danach schleife neustarten
        }
    }
    bezahlt = 1;
    plfrei = 1;
}
}