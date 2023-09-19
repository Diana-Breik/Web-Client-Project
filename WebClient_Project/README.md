Aufgabe: WebClient
Erstellt euch ein neues Projekt und nutzt die Daten aus der Rick&Morty API
https://rickandmortyapi.com
*
* Schritt 1: Schreibe einen Endpunkt, der alle Rick&Morty-Character zurückgibt (aber reduzierte Charakter-Details).
* Wenn ihr im Postman GET http://localhost:8080/api/characters/ eingebt sollen alle Charaktere in diesem Beispielformat ausgegeben werden:

[
{"id": 1, "name": "Rick Sanchez", "species": "Human"},
{"id": 2, "name": "Morty Smith", "species": "Human"},
... weitere
]

*
* Schritt 2: Schreibe einen Endpunkt, der einen Rick&Morty-Character zurückgibt. Wenn ihr im Postman GET http://localhost:8080/api/characters/2 eingebt, soll der Character mit der Id 2 zurückgegeben werden.

``{"id": 2, "name": "Rick Sanchez", "species": "Human"}

*
* Schritt 3: Schreibe einen Endpunkt, der eine gefilterte Liste von Rick&Morty-Character zurückgibt.(Es soll nach dem Status gefiltert werden). Wenn ihr im Postman GET http://localhost:8080/api/characters?status=alive eingebt, soll eine Liste von lebenden Charakteren zurückgeben werden.
* Schritt 4: Schreibe einen Endpunkt für eine Spezies-Statistik. Wenn ihr im Postman GET http://localhost:8080/api/species-statistic?species=Human eingebt, soll die Anzahl der lebenden "Human"-Charaktere als Zahl (kein JSON) ausgegeben werden. Gleiches soll auch für alle anderen Spezies funktionieren.
* Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite bearbeiten.

Wie viele lebende Menschen gibt es?


—————


Bonus-Aufgabe
Super, Ihr seid gut vorangekommen! Bearbeitet jetzt diese freiwillige Bonusaufgabe, um Euer Verständnis zu vertiefen.
*
* Binde die Book-API von https://my-json-server.typicode.com/Flooooooooooorian/BookApi/books in eurer Projekt BookLibrary ein.
* Zum Beispiel GET https://my-json-server.typicode.com/Flooooooooooorian/BookApi/books/978-3-8362-8745-6.

————


Bonus Aufgabe Github Api
* Stelle einen /api/github/<username> Endpunkt zuverfügung, der mittels der Github Api das Profil des jeweiligen Nutzers abruft.
* Sei kreativ und ergänze deinen Server um weitere Endpunkte, die weitere Informationen von der Github API abrufen.
