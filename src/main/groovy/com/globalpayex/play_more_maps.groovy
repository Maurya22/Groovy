package com.globalpayex

def students = [
        90 : Tuple.tuple("rakesh", 'm', 90),
        78 : Tuple.tuple("ranjeet",'m', 78),
        68 : Tuple.tuple("priti", 'f',68),
        58 : Tuple.tuple("raj", 'm', 58)
]

// print the name and roll number of all the male student

//def malestudents = students.each {
//    if(it.value.v2 =="m"){
//        println "Name : $it.value.v1\nRollNo : $it.key"
//    }
//}

//def malestudents = students.each { rollno, studentTuple ->
//    if(studentTuple.v2 =="m"){
//        println "Name : $studentTuple.v1\nRollNo : $rollno"
//    }
//}


def  malestudent =students.findAll {rollno, studentTuple->
    studentTuple.v2=="m"
}
println malestudent

// create a new map hwre return name in captilized

def m3 = students.collectEntries {rollno, studentTuple ->
    [rollno,Tuple.tuple(studentTuple.v1.capitalize(),studentTuple.v2,studentTuple.v3)]
}
println m3

def genderCount = students.countBy { it.value.v2 }
println genderCount

def gendergroup = students.groupBy {it.value.v2}
println gendergroup

