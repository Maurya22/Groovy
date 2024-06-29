package com.globalpayex

ArrayList.metaClass.evens{
    delegate.findAll{it % 2==0}

}

ArrayList.metaClass.odds{
    delegate.findAll{it % 2!=0}
}

ArrayList.metaClass.sortDecending {
//    delegate.sort(false) { a, b -> b.compareTo(a) }
//    Spaceship operator
    delegate.sort(false) {a, b -> b <=> a}
}

def nos = [6,4,5,6,8,2,9,8]

println nos.evens()
println nos.odds()

def nos1 =[89,5,4,2,3,9,1]
println nos1.evens()
println nos1.odds()



println nos.sortDecending()

println nos





