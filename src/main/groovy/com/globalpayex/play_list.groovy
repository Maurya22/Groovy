package com.globalpayex

// List
//ordered collection of elements

def cars = ["audi","bmw","i20"]

//indexing accessing
println cars[0]
println  cars[-2]


//modify
cars[0] = "mercedes"
println cars[0]

//sublist
def marks = [10,3,6,8,3,5,6]
println marks[-4..-1]
println marks[0..5]


//membership
println "bmw" in cars
println "mercedes" in cars

for(def car in cars){
    println car.toUpperCase()
}

//add element in list
cars << "porshe"
println cars
cars << "audi" << "i10"
println cars

//remove from the end
cars.removeLast()
println cars

//add element start of the list
cars.push("i10")
println cars

//remove elememt start of the list
cars.pop()
println cars

def m1 = [1,3,5]
def m2 =[3,5,9]
println m1 - m2
println m2 - m1
println m1.intersect(m2)
println((m1+m2).unique())


// statistics
println marks
println marks.max()
println marks.min()
println marks.average()

def markDivision = [
        [5,6,7,3],
        [6,8,6,3],
        [10,5,8]
]
println markDivision.flatten().average()


def names =["rakesh", "ranjeet",null,"sunil"]
println names*.toUpperCase()

//safe object navigation (?.)
names.each { println it?.toUpperCase()}