SPECIFICA DEI REQUISITI

1) INTRODUZIONE

Il software da realizzare è una applicazione mobile, in particolare per dispositivi Android, nell’ambito della ristorazione.
L’app viene utilizzata da camerieri e addetti alla cucina per la gestione e visualizzazione delle comande in un ristorante o in un bar.

2) DESCRIZIONE GENERALE

Il software, installato sul dispositivo in possesso del cameriere e del cuoco permetterà di svolgere le seguenti azioni: 

•	NUOVA PRENOTAZIONE
•	CANCELLA PRENOTAZIONE
• MODIFICA PRENOTAZIONE
•	NUOVO ORDINE
•	CANCELLARE ORDINE
•	MODIFICA ORDINE
•	VISUALIZZAZIONE ORDINE
• VISUALIZZA PRENOTAZIONE
• CHECK ORDINE
• CHECK PRENOTAZIONE


Gli utenti del nostro software saranno esclusivamente il personale di sala e il personale della cucina del locale.
Dopo l'accensione dell'applicazione, l'interfaccia grafica  mostrerà una schermata in cui sarà possibile accedere tramite due diversi utenti:

-UTENTE SALA
-UTENTE CUCINA

Selezionando uno dei due utenti, verrano poi mostrate le azioni che quell'utente potrà svolgere.
Nel caso di "UTENTE SALA" comprariranno :

- NUOVA PRENOTAZIONE
- NUOVO ORDINE
- VISUALIZZA ORDINE
- VISUALIZZA PRENOTAZIONE

Nel caso di "UTENTE CUCINA" invece verrà mostrata solamente la funzione VISUALIZZA ORDINE.
Tramite la funzione NUOVA PRENOTAZIONE il cameriere potrà creare una nuova prenotazione attraverso l'inserimento del nome della persona che fa la prenotazione, il suo numero di cellulare e il numero di tavolo, quest'ultimo sarà assegnato dal cameriere.
Il sistema poi provvederà a inserire anche un codice id univoco.
Invece selezionando NUOVO ORDINE si potrà creare un nuovo ordine selezionando i piatti scelti dal cliente. Anche in questo caso il sistema poi provvederà a fornire un codice univoco.
Selezionando la funzione VISUALIZZAZIONE ORDINE e VISUALIZZAZIONE PRENOTAZIONE si potranno vedere i vari ordini/prenotazioni e selezionando uno di essi si avrà la possibilità di eseguire le seguente azioni:
-per le prenotazioni MODIFICA PRENOTAZIONE, CHECK PRENOTAZIONE (operazione da fare quando il cliente arriva al locale) e CANCELLA PRENOTAZIONE.
-per gli ordini  MODIFICA ORDINE, CHECK ORDINE (operazione da fare quando un piatto è pronto) e CANCELLA ORDINE.

3) REQUISITI

Per definire l'importantanza dei requisiti ci siamo affidati ad un modello MoSCoW (must have, should have, could have, won't have).

  3.1) REQUISITI FUNZIONALI

  1) MUST HAVE: NUOVA PRENOTAZIONE, VISUALIZZA PRENOTAZIONE, NUOVO ORDINE, VISUALIZZA ORDINE
  2) SHOULD HAVE:MODIFICA PRENOTAZIONE, MODIFICA ORDINE, CANCELLA PRENOTAZIONE, CANCELLA ORDINE
  3) COULD HAVE: CHECK PRENOTAZIONE,CHECK ORDINE
  4) WON'T HAVE: LISTA PIATTI CON ALLERGENI, LISTA TAVOLI, NOTE ALL'INTERNO DELL' ORIDNE

  3.2) REQUISITI NON FUNZIONALI

  1) MUST HAVE: interfaccia semplice ed intuitiva per non creare difficoltà nell' utilizzo
  2) SHOULD HAVE: integrità dei dati nel database per non confondere ordini e prenotazioni. 
  3) COULD HAVE: tempi di risposta brevi (nell' ordine dei secondi), gestione della concorrenza nell' accesso al database 
  4) WON'T HAVE:   





