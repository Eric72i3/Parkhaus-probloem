import java.util.Scanner;
public class Schranke{



    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        boolean laeuft = true;
        int belegt = 0;
        int gesamt = 0;
        int bezahlt = 0;
        int plfrei = 0; // Platzhalter, muss noch mit der tatsächlichen Anzahl der freien Plätze verknüpft werden

        System.out.println("Geben Sie den Wert für belegt ein");
        belegt = sc.nextInt();
        System.out.println("Geben Sie den Wert für gesamt ein");
        gesamt = sc.nextInt();
        sc.nextLine(); // Loopt sonst in der nächsten Eingabe
        System.out.println("Debugging - Befehle: print_debug, set_var, beenden");
        System.out.println("--------------------------------------------------------------------");
        

        while (laeuft == true) {

            boolean invalide_eingabe = true;
            boolean ef = false;
            boolean af = false;

            System.out.println("Möchten Sie einfahren oder ausfahren?");
            String einfahren = sc.nextLine().trim();

            while (invalide_eingabe == true) {

                //Für einfache Anpassungen
                if (einfahren.equalsIgnoreCase("ein")) {
                    ef = true;
                    invalide_eingabe = false;
                }
                else if (einfahren.equalsIgnoreCase("aus")) {
                    af = true;
                    invalide_eingabe = false;
                }
                else if (einfahren.equalsIgnoreCase("print_debug")) { // Debugging
                    System.out.println("belegt: " + belegt + ", gesamt: " + gesamt + ", bezahlt: " + bezahlt + ", plfrei: " + plfrei + ", ef: " + ef + ", af: " + af );
                    System.out.println("--------------------------------------------------------------------");
                    break;
                }
                else if (einfahren.equalsIgnoreCase("set_var")) { // Debugging
                    System.out.println("Geben Sie den Wert für belegt ein");
                    belegt = sc.nextInt();
                    System.out.println("Geben Sie den Wert für gesamt ein");
                    gesamt = sc.nextInt();
                    sc.nextLine(); // Loopt sonst in der nächsten Eingabe
                    System.out.println("--------------------------------------------------------------------");
                    break;
                }
                else if (einfahren.equalsIgnoreCase("beenden")) { // Programm beenden
                    System.out.println("Programm wird beendet");
                    laeuft = false;
                break;
                }


                if (ef == true) {
                  int freieplaetze = gesamt-belegt;

                System.out.println("Verfügbare Parkplätze: " + freieplaetze);


        if (freieplaetze>0) {
            plfrei = 1;
            System.out.println("Darf einfahren" );
        }
        else {
            plfrei = 0;
                     System.out.println("Darf nicht einfahren" );
                     break;
                    }
                }
                


                if (ef == true && plfrei == 1) {
                    System.out.print("Parkdauer in Stunden eingeben: ");
                    double stunden = sc.nextDouble();
                    sc.nextLine(); // Loopt sonst in der nächsten Eingabe
                    double preis;
                    if (stunden <= 1) {
                        preis = 1.0;
                    }else {
                        preis = stunden * 1.0;
                    }
                    System.out.println("Zu zahlender Parkpreis: " + preis + " €, bitte ok eingeben, um zu Zahlen");
                    String bezahlt_eingabe = sc.nextLine().trim();
                     if (bezahlt_eingabe.equalsIgnoreCase("ok")) {
                          bezahlt = 1;
                         System.out.println("Zahlung bestätigt");
                    }else {
                        System.out.println("Zahlung abgebrochen, bitte erneut einfahren");
                        break;
                    }
                }


                if (ef == true && bezahlt == 1 && plfrei == 1) {
                    belegt = belegt + 1;
                    bezahlt = 0;
                    plfrei = 0; // Wird oben wieder auf 1 gesetzt
                    System.out.println("Einfahrschranke wird geöffnet, Willkommen");
                } 
                
                else if (ef == true && bezahlt == 0) {
                    System.out.println("Bitte bezahlen Sie zuerst");
                }
                
                else if (ef == true && plfrei == 0) {
                    System.out.println("Es sind keine freien Plätze mehr vorhanden");
                } 
                
                else if (af == true) {
                    belegt = belegt - 1;
                    System.out.println("Ausfahrschranke wird geöffnet, danke für Ihren Besuch");
                } 
                
                else {
                    System.out.println("ungültige eingabe");
                    System.out.println("Möchten Sie einfahren oder ausfahren? Bitte geben Sie 'ein' oder 'aus' ein");
                    einfahren = sc.nextLine().trim();
                }
                System.out.println("--------------------------------------------------------------------");
            }
            // Platzhalter
            plfrei = 1;
            // Platzhalter
        }
    }
}

    }
}
