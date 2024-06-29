package com.globalpayex

def nos = [5,6,7,8,9,10,34,78]

//print all even number more than 2

//println "*****even number more than 2"
//
//nos.each {
//    if(it % 2==0 && it>2){
//        println it
//    }
//}

//from the number list create separte even list or odd list

def evenList =[]
def oddList =[]

nos.each {
    if(it % 2 ==0){
        evenList.add(it)
    }
    else {
        oddList.add(it)
    }
}


println "Even List  : $evenList"
println "Odd list  : $oddList"


//create new list where nos is more than 5
// filtering
def l1 =nos.findAll {it > 5}
println l1

//create new list from nos consisting of marks deducted by 1
//mapping
def l2 = nos.collect {it -1}
println l2


//create a new list
// filter odd elements more than 3
// square the filter out odd number

def l3 = nos.findAll {it%2 && it >3}.collect {it ** 2}
println l3

//find out whether every student has scored above 3 or not

def greaterThanThree = nos.every { it > 3 }
println greaterThanThree

def cars = ["audi","bmw","mercedes"]
def car_capital = cars.collect {it.capitalize()}
println car_capital

def l4 = cars*.capitalize()
println l4

def l5 = nos*.minus(1)
println l5

