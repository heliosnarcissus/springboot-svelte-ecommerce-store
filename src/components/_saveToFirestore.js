import {firebasedb} from "./_firebase.js"

export function saveToFirestore(name,email,message){

    let timeNow = new Date();
    var timestamp = timeNow.getTime();

    firebasedb.collection("contactform-message").add({
        name: name,
        email: email,
        message: message,
        pos: timestamp
    })
    console.log('saved to firestore success!');
}

