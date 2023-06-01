# java-wish-list

1: 

## Package
`org.lessons.java.christmas`

## Todo
Creare una classe `Main` con metodo `main`, in cui implementare il seguente programma:
creare un `ArrayList` dove salvare *la lista dei desideri*
continuare a chiedere all’utente di inserire *un nuovo desiderio* nella lista, fino a che l’utente sceglie di fermarsi.

Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare.

Ad ogni iterazione aggiungere il desiderio alla lista.

Al termine dell’inserimento stampare a video la lista di desideri.


2: 

## Package
`org.java.myset`

## Todo
All'interno dello stesso progetto creare nuova classe `MainSet` contenente un altro metodo `main`.

All'interno del metodo generare randomicamente 5 numeri diversi tra loro compresi tra 2 e 12.

Stampare alla fine tutti i valori.

### Hint
Sfruttare le funzionalita' dell'interfaccia `Set`


3: 

## Package
`org.java.mymap`

## Todo
Attraverso queste 2 righe di codice
```java
String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

System.out.println(Arrays.asList(str.split(" ")));
```
Che restituiscono l'output:
```
[Lorem, ipsum, dolor,, sit, amet, consectetur, adipisicing, elit., Totam, -, repudiandae, est,, alias, in, ullam, excepturi, ipsam, modi, odio, Lorem, ipsum, dolor, asperiores, voluptatum,, #, quam, distinctio, !, Lorem, ipsum, dolor,, sit, amet, consectetur, adipisicing, elit., Totam, repudiandae, Totam, repudiandae, est, ;, accusantium, voluptatum,, quam, distinctio, aut, magnam, quod, veniam, esse, nesciunt, debitis.]
```

Ottenere una mappa che colleghi ogni parola con la sua frequenza all'interno della frase data.

### Hint
Usare la struttura `Map` per ottenere qualcosa del tipo
```sh
{Lorem=5; ipsum=3, ...}
```

## Bonus
Eliminare tutte le componenti **NON ALFABETICHE** (es: virgole, punti, ecc) ed eseguire il calcolo `case insensitive`.

