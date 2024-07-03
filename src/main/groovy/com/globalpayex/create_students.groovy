package com.globalpayex

import com.globalpayex.college.Student

println Student.count
def s1 = new Student(name : 'rakesh', gender : 'm', marks : 90, roll : 10)

println Student.count
def s2 = new Student(name : 'priti', gender : 'f', marks : 88, roll : 23)

println Student.count

println s1.getDetails()
println s2.getDetails()

println s1.calculateGrade()
println s2.calculateGrade()

def s3 = Student.create(gender: 'm', name: 'ranjeet', roll: 15, marks: 77)
println s3.getDetails()

s3.roll = -67  // encapsulation  // s3.setRoll(-67) --> done internally
println s3.getDetails()

s3.roll = 20
println s3.getDetails()

println s3.gender
def s4 = new Student()
println s4.gender

