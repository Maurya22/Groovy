package com.globalpayex

//Closures
// very much - function
//it treat as value
def operations(a,b){
//    clouser can access enclosing scope data

//    compute addition logic
    def add = {
        def r1 = a +b
        r1 +10
    }
// compute multiplication logic
    def multiplication = {
        def r2 = a * b
        r2+10
    }

    println add()
    println multiplication()

}

operations(5,2)

def nos = [5,6,8,4,3,2,1,7,10]

def forEach(list,fn){
    for(def element in list){
        fn(element)
    }
}

println "****Evens******"
def fn ={element ->
    if(element % 2 ==0){
        println element
    }
}

forEach(nos,fn)

println "**odd number greater than 3"
//forEach(nos, {element ->
//    if(element % 2 && element >3){
//        println element
//    }
//})

//forEach(nos, {
////    implicit parameter "it"
//    if(it % 2 && it >3){
//        println it
//    }
//})

forEach(nos){
    if(it % 2 && it > 3){
        println it
    }
}


