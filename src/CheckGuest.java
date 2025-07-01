

/*
State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista
- creare e inizializzare l’array contenente i nomi degli invitati
- chiedere all’utente come si chiama
- verificare che il nome sia presente nella lista
- lasciarlo entrare o rispedirlo cortesemente da dove è venuto 
 */

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
        
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax","Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis","Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


        Scanner scan = new Scanner(System.in);
        
        
        //chiedo all'utente come si chiama
        System.out.print("Inserisci il tuo Nome e Cognome ");
        String nomeUtente = scan.nextLine();


        //verifico se il nome è nella lista utilizzando un ciclo for e un valore booleano per stampare alla fine il messaggio se è in lista o no
        //equals() serve per conforntare il contenuto tra due stringhe
        Boolean inLista = false;
         for (int i = 0; i < listaInvitati.length; i++) {
            if (listaInvitati[i].equals(nomeUtente)) {
                inLista = true;
                break;
            }
        }
        //stampo messaggio finale 
        if (inLista) {
        System.out.println(nomeUtente + " è presente nella lista, entri pure!");
        } else {
        System.out.println(nomeUtente + " ci dispiace ma il suo nome non è nella lista, non può entrare!");
        }
    }
}    
