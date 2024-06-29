package com.globalpayex


def students = [
      90 : Tuple.tuple("rakesh", 'm', 90),
      78 : Tuple.tuple("ranjeet",'m', 78),
      68 : Tuple.tuple("ramesh", 'm',68),
      58 : Tuple.tuple("raj", 'm', 58)
]

Scanner scanner = new Scanner(System.in)
println "Please enter roll no search : "
def rollno = scanner.nextInt()

def result = students[rollno]
if(result){
    println "Student Name : $result.v1\nStudent Gender : $result.v2\nStudent RollNo : $result.v3"
}
else {
    println "Not found"
}


