package com.globalpayex

// tuple
// Heterogenous data
// ordered
// imputable

def t1 = Tuple.tuple("rakesh", 10,'m', 90)

//access elements
println t1.v1
println t1.v2
println t1.v3

//iterate
for(def v in t1){
    println v
}

// can not modify
//t1.v2 = 20




