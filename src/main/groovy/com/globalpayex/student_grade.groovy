package com.globalpayex

//def grade(n) {
//    if(n > 100 || n < 0){
//        "Invalid"
//    }
//    else if(n >= 70) {
//        "A"
//    }
//    else if(n >= 60) {
//        "B"
//    }
//    else if(n >= 40){
//        "C"
//    }
//    else {
//        "F"
//    }
//}

def grade(n){
    switch (n) {
        case 70..100: "A"
            break
        case 60..69: "B"
            break
        case 40..59: "C"
            break
        case 0..39: "F"
            break
        default: "I"
    }
}

println("The Grade of Student is ${grade 100}")

