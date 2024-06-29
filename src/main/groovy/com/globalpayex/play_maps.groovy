package com.globalpayex

// Map
// Entry : key and Value
//key should be unique, indexing happen by key
//Mutable

def em =[:]
def emap = ["E0001": "Rakesh","E0002" : "Sunil"]

println emap

// add a new entry
emap["E0003"] = "rahul"
println emap

//update an existing entry
emap["E0003"] ="Raj"
println  emap

//remove an entry from map
emap.remove("E0003")
println emap

println emap.size()
println emap.keySet()
println emap.values()

//iterating
for(def entry : emap){
    println "Emp id : $entry.key\nEmp Name : $entry.value"
}

// memebership
println "E0002" in emap
