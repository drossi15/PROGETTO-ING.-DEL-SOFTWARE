PROGETTAZIONE (design) DEL SOFTWARE

CONCETTI DI ASTRAZIONE E MODULARITA'. 
Durante lo sviluppo del software abbiamo cercato di orientarci verso un'alta coesione tra i componenti, la quale è molto importante. 
In particolare siamo andati alla ricerca di una coesione di tipo sequenziale. L'altro aspetto importante di cui il team si è imposto di seguire è l'accoppiamento, nello specifico siamo andati alla ricerca di un basso accoppiamento. Ciò permette di avere una comunicazione più semplice, prove di correttezza più semplici, modifiche che influenzano meno altri moduli, un aumento della riusabilità e una comprensibilità migliore.


Questo è un pezzo di software del metodo che permette di visualizzare le prenotazioni e gli ordini. In particolare, eseguo la query che mi ritorna la tabella con le prenotazioni e per ogni tupla la trasformo in una stringa che poi andrò a salvare in una lista.

![complessità flowchart](https://user-images.githubusercontent.com/101459546/222957231-861f69b7-a397-4ee1-86e1-fa17520bf00d.png)

La complessità ciclomatica di questo codice è uguale a  M = E - N + P + 1= 10-9+0+1=2

