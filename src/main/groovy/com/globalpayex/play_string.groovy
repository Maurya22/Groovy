package com.globalpayex

def fullName = "rakesh maurya"
def msg = 'India'
def addition = "Addition is ${5+4}"

def sql ='''
       Select *
       from Emp
       where age ==21;
'''

println(sql)

// Indexing
println msg[3]
println fullName[8]
println msg[-3]


//substring
println fullName[0..5]
println fullName[-6..-1]

//iteration
for(def v in fullName){
    println v
}

//other operation
println fullName.toUpperCase()
println fullName.capitalize()
println fullName.startsWith("rakesh")
println fullName.endsWith("maurya")
println fullName.contains("esh")


def msg1 = "good morning to all , have a good day ead"
println msg1.count("good")

def age = '17'
println age.isNumber()
def pi = '3.17'
println pi.isFloat()

def username = "rakesh23344"
println username.isNumber()

println fullName.reverse()
println fullName.size()

def studentData = "               rakesh Maurya"
println studentData.strip()

def maliciousData = "           "
println maliciousData.isAllWhitespace()
