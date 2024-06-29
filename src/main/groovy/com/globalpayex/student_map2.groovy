package com.globalpayex

def students = [
         Tuple.tuple("rakesh", 'm', 90),
        Tuple.tuple("ranjeet",'m', 78),
        Tuple.tuple("priti", 'f',68),
        Tuple.tuple("raj", 'm', 58)
]

//create a new list of tuple consisting of only name and marks of all the male students

def maleStudents =
        students.findAll {
            it.v2 == 'm'
        }.collect {
                    Tuple.tuple(it.v1, it.v2)
                }

println maleStudents

