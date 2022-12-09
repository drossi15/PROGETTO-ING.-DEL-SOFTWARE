# PROGETO-ING.-DEL-SOFTWARE
progetto per il corso di ingegneria del software
![image](https://user-images.githubusercontent.com/119944651/206684594-fb35fd4d-f10b-4575-baa0-97eb58bf8c1d.png)





                                    
                                 



INDICE

•	Project Plan ……………………………....    pag.4
•	Specifica dei requisiti…………....…... ……..    pag.10
•	Architettura e Design . …………………… .    pag.
•	Implementazione ………………………….    pag.
•	Utente …… ……………………………..    pag.
•	Test.. .. …………………………………..    pag.
















               PREFAZIONE

Lo scopo di questo documento è di racchiudere tutta la documentazione elaborata durante l’intero progetto. 
Ogni attività è racchiusa capitolo per capitolo.
I vari capitoli tratteranno la documentazione relativa al piano di progetto (project plan), all’indicazione e stesura dei requisiti del progetto (ingegneria dei requisiti), all’architettura, al design ed all’implementazione del software, alla guida per l’utente per l’utilizzo dell’applicazione ed infine alla descrizione della fase di test svolta. 









                  PROJECT PLAN


-       INTRODUZIONE 

Il progetto riguarda lo sviluppo di un’applicazione rivolta a ristoranti e bar. In particolare, l’app fornisce la gestione delle comande prese dai camerieri, sia che lavorino appunto in un ristorante oppure in un bar. Il cameriere è in grado di prendere gli ordini di uno o più tavoli e inviare direttamente tutto alla cucina e alla cassa. In questo modo l’obiettivo è quello di proporre una maggiore efficienza, velocità e sicurezza della gestione delle comande, evitando l’ormai obsoleto metodo del “carta e penna”. Al progetto lavoreranno Giorgio e Diego.


 
-       MODELLO DI PROCESSO

Per il modello di processo abbiamo deciso di utilizzare il modello Agile. Questo modello fa sì che la serie di cicli di sviluppo non sia ampiamente pianificata in anticipo, ma la nuova situazione viene rivista alla fine di ogni ciclo. Essendo il team è composto da 2 persone, abbiamo scelto questa metodologia in quanto la caratteristica peculiare del modello Agile è la presenza di piccoli team di sviluppo.


 
-       ORGANIZZAZIONE DEL PROGETTO

Una parte importante nello sviluppo del nostro progetto è l’organizzazione del database. Il database, infatti, avrà un ruolo centrale in quanto tutti i tavoli con i rispettivi ordini verranno salvati all’interno del database e ciò deve essere esente da conflitti. 
‘AGGIUNGERE ORGANIZZAZIONE TEAM’????????


 
-       STANDARD, LINEE GUIDA, PROCEDURE

Di grande importanza è la documentazione del software. Nella documentazione sono inserite tutte le funzionalità che il nostro software deve avere e rispettare. Grazie all’utilizzo del modello Agile la documentazione verrà aggiornata all’occorrenza. Il concetto base nel nostro team è infatti chiedere e ricercare risposte a problemi che intercorrono durante lo sviluppo del software, senza fissarci troppo sulla documentazione.


 
-       ATTIVITA’ DI GESTIONE

Ogni volta che termina una giornata di lavoro sullo sviluppo del nostro software, tra colleghi ci si aggiorna e si valutano eventuali nuove proposte e modifiche effettuate. 


 
-       RISCHI 

??????????
 


-       PERSONALE

Entrambi i membri del team saranno presenti e operativi sull’intero sviluppo del progetto rispettando le proprie mansioni e garantendo i propri obiettivi. Tutto il team è responsabile del progetto senza distinzioni.



 
-       METODI E TECNICHE


 
-       GARANZIA DI QUALITA’

Utilizzando gli attributi di qualità di McCall, saranno garantiti correttezza, affidabilità nel lungo periodo, efficienza, integrità massima in quanto eventuali interferenze potrebbero significare gravi perdite per il ristorante, usabilità efficace in quanto l’interfaccia è molto user-friendly.



-       PACCHETTI DI LAVORO

Pianificazione, modellazione, implementazione classi, implementazione database, implementazione grafica.
 






-       RISORSE 

Computer personali dei membri del team, Android Studio (gratuito) per lo sviluppo del codice; aule università e proprie abitazioni per aree di lavoro.
 

 
-       BUDGET

Il budget in questo progetto ha un ruolo ininfluente, in quanto non necessita l’acquisto di hardware/software. L’app verrà installata su comuni dispositivi mobile Android. Per il nostro sviluppo e test utilizziamo virtualizzazioni di dispositivi Android direttamente sui nostri computer con anche qualche test su dispositivi esterni già in nostro possesso.  
 

-       CAMBIAMENTI 

Dato l’utilizzo del modello Agile, i cambiamenti sono tenuti in debita considerazione. I cambiamenti durante lo sviluppo sono inevitabili. Eventuali idee e modifiche attuate/da attuare verranno elaborate e valutate da tutto il team, tenendo traccia dei cambiamenti avvenuti. 
 


-       CONSEGNA

La nostra applicazione verrà distribuita su Google Play Store e sarà a pagamento ad un prezzo di €… . Il costo dell’app garantisce il mantenimento e l’affidabilità nell’utilizzo. Per tanto l’app potrà essere scaricata da chiunque. Tuttavia, se l’app verrà utilizzata in ristoranti di grosse dimensioni (=gran numero di dispositivi utilizzati) si potranno effettuare accordi per la vendita del prodotto.


















          SPECIFICA DEI REQUISITI

Il software da realizzare è una applicazione mobile, in particolare per dispositivi Android, nell’ambito della ristorazione. L’app viene utilizzata da camerieri e addetti alla cucina per la gestione delle comande in un ristorante o bar. Il software, installato sul dispositivo in possesso del cameriere, fornirà l’accesso all’elenco dei tavoli del ristorante. 
Il cameriere potrà selezionare il tavolo dove sta prendendo la comanda e selezionare i piatti e le bevande ordinate dai clienti di quel tavolo. Egli può quindi prendere più ordini più volte per uno stesso tavolo, in quanto è ovvia la possibile situazione in cui dei clienti vogliano ordinare dapprima un primo e delle bevande e solo successivamente un secondo oppure un contorno oppure un dolce. 
Il cameriere però dovrà, una volta terminata la comanda di un tavolo, confermare la comanda stessa, prima di poterne aprire un’altra per un altro tavolo. In questo modo si evitano possibili errori di compilazione delle comande e malintesi nelle ordinazioni dei clienti, riducendo il rischio di disagio nei clienti stessi. 
Un altro possibile scenario è l’intolleranza alimentare da parte di alcuni clienti. Per tanto, ogni piatto, primo, secondo, contorno o dolce che sia, avrà una lista di allergeni associata. Il cameriere, al momento, tramite una apposita funzionalità potrà visualizzare e comunicare ai clienti eventuali allergeni dei piatti prima di prendere ufficialmente l’ordine. 
Inoltre, il cameriere potrà aggiungere delle note nella comanda: ad esempio un cliente che chiede una modifica a un piatto può specificarla al cameriere, il quale la inserirà nelle note della comanda. 
Una volta confermato l’ordine il tutto viene salvato in una apposita sezione del database dell’applicazione. 
La cucina potrà quindi visualizzare continuamente, aggiornando l’app, la presenza di nuovi ordini. Anche tutti i piatti sono salvati nel database in modo da comparire al cameriere al momento dell’ordine. 
Il software dovrà funzionare chiaramente anche in concomitanza ad altri dispositivi utilizzati, anche, contemporaneamente dagli altri camerieri. E’ infatti ovvio che ci saranno situazioni in cui più camerieri stanno usando l’app per prendere ordini da tavoli diversi nello stesso momento. Il database, quindi verrà aggiornato di volta in volta. 
Siccome ogni dispositivo può operare su un tavolo alla volta ed è necessario confermare l’ordine prima di passare al tavolo successivo, non ci saranno problemi di ordini in conflitto tra loro. 
Il sistema software deve essere dotato di un’interfaccia amichevole, con menu a tendina, finestre, pulsanti e vari text field. Inoltre, non deve interfacciarsi con nessun sistema hardware o software esterni.

Quindi, riassumendo, le principali funzionalità che il software dovrà quindi implementare sono le seguenti: 
•	PRENOTAZIONE TAVOLI
•	PRENDERE COMANDA
•	VISUALIZZAZIONE COMANDA
•	VISUALIZZAZIONE TAVOLI
•	MODIFICA COMANDA
•	CANCELLAZIONE COMANDA
•	CANCELLAZIONE PRENOTAZIONE


