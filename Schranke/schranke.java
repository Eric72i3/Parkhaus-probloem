import java.util.Scanner;
public class Schranke{
    // Platzhalter
    static int belegt = 20;
    static int gesamt = 200;
    static int bezahlt = 1;
    static int plfrei = 1;
    // Platzhalter

    // An Eric und Piotr:
    // Das, was wir in der Schule gemacht haben, wurde nicht gespeichert. Ich habe es jetzt einfach neu gemacht.
    // Die Namen der Variablen müssen wir noch mit den anderen abgleichen, und ich habe die Klasse jetzt anders genannt,
    // weil es sonst mit den anderen Dateien nicht funktioniert hat.
    // Ich habe auch noch eine While-Schleife eingebaut, damit eine ungültige Eingabe nicht das ganze Programm zum Absturz bringt.
    // Die Eingabe ist jetzt auch ein String, damit man bei irgendeiner Eingabe keinen Absturz bekommt
    // Eigentlich müssten wir noch eine Schleife drum machen, damit das Programm immer weiter läuft. Ich habe es gerade auch versucht,
    // hat aber nicht funktioniert.

    public static void main (String args[]){
        boolean invalide_eingabe = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Möchten Sie einfahren oder ausfahren?");
        String einfahren = sc.nextLine().trim();


    if (einfahren.equalsIgnoreCase("einfahren")) {
    // Der Code der anderen müsste dann hier dazwischen, also sowohl das Prüfen nach freien Plätzen als auch das Bezahlen.
        } 
        while (invalide_eingabe == true) {
        if (einfahren.equalsIgnoreCase("einfahren") && bezahlt == 1 && plfrei == 1) {
            invalide_eingabe = false;
            belegt = belegt + 1;
            bezahlt = 0;
            plfrei = 0; // Wird oben wieder auf 1 gesetzt
            System.out.println("Einfahrschranke wird geöffnet");
        } else if (einfahren.equalsIgnoreCase("einfahren") && bezahlt == 0) {
            invalide_eingabe = false;
            System.out.println("Bitte bezahlen Sie zuerst");
        } 
        // Sollte nie passieren, da man ohne freie Plätze nicht bezahlen kann, aber zur Sicherheit
        else if (einfahren.equalsIgnoreCase("einfahren") && plfrei == 0) {
            System.out.println("Es sind keine freien Plätze mehr vorhanden");
        }else if (einfahren.equalsIgnoreCase("ausfahren")) {
            belegt = belegt - 1;
            invalide_eingabe = false;
            System.out.println("Ausfahrschranke wird geöffnet");
        } else {
            
            System.out.println("ungültige eingabe"); 
            System.out.println("Möchten Sie einfahren oder ausfahren? Bitte geben Sie 'einfahren' oder 'ausfahren' ein");
            einfahren = sc.nextLine().trim();
        }
    }
    bezahlt = 1;
    plfrei = 1;
    System.out.println("belegt: " + belegt);
}
}
