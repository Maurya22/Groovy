package com.globalpayex

def students = [
        Tuple.tuple("rakesh",'m', 90),
        Tuple.tuple("ramesh", 'm', 78),
        Tuple.tuple("raj",'m', 68),
        Tuple.tuple("ram",'m', 66)
]

//def maxTuple = students[0]
//
//for(def student in students){
//    if(student.v3>maxTuple.v3){
//        maxTuple = student
//    }
//}

//println "Name: $maxTuple.v1\nGender : $maxTuple.v2\nMarks : $maxTuple.v3"

Scanner scanner = new Scanner(System.in)
println "Please enter roll no search : "
def rollno = scanner.nextInt()

def studentfound

for(def student in students){
    if(rollno == student.v3){
        studentfound = student
        break
    }
}
if(studentfound){
    println "Name: $studentfound.v1\nGender : $studentfound.v2\nMarks : $studentfound.v3"
} else {
    println "Not found"
}







