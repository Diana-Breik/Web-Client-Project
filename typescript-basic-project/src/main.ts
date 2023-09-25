let age: number = 7

for(let i =1; i<=age; i++){
    console.log(i)
}

function functionAge():void{
    if(age>18){
        console.log("Ja, age ist größer als 18")
    }
    else{
        console.log("Nein, age ist nicht größer als 18")
    }
}
functionAge()

let score:number = 0
//Gebt 'Score ist verfügbar.' aus, wenn 'score' einen Wert ungleich 0 hat.
if(score){
     console.log("Score ist verfügbar!")
 }
// Diese Zeile wird ausgeführt, da "wertFalsy" den Wert 0 hat, der als "falsy" betrachtet wird.
 else{
     console.log("Score ist falsy.")
 }


score = 11
if(score){
    console.log("Score wird als truthy ausgewertet.")
}
else{
    console.log("Score ist falsy.")
}

let username: string = ""
if(username){
    console.log("Username ist verfügbar und hat einen Wert!")
}
else{
    console.log("Username wird als falsy ausgewertet.")
}

let isAdmin:boolean = false
if(isAdmin){
    console.log("isAdmin wird als truthy ausgewertet.")
}
else{
    console.log("isAdmin wird als falsy ausgewertet.")
}

if(isAdmin === false){
    console.log("isAdmin ist false.")
}

function weihnachtsbaum(zahl:number):void {
    //das Baum von Oben
    for(let i =1; i<= zahl; i++){
         let spaces: string = ' '.repeat(zahl-i)
         let stars :string = '*'.repeat(2* i -1)
         console.log(spaces+stars)
    }
    //der Stamm des Baumes
    for(let i =1; i<= zahl; i++){
        console.log(' '.repeat(zahl - 1) + '*')
    }
}
weihnachtsbaum(5)