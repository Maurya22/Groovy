package com.globalpayex

import groovyjarjarantlr4.v4.runtime.atn.BlockEndState


//def perimeter(length=4, breadth=2) { 2 * (length + breadth)}

def perimeter(Map dimension){
    2 * (dimension["length"]+dimension["breadth"])
}

def area(Map dimension) {  dimension["length"] * dimension["breadth"] }

def statistics(Map dimension){
    p = perimeter(dimension)
    a = area(dimension)
    Tuple.tuple(p,a)
}

//def  l1 = 5
//def b1 = 3
//
//def p1 = perimeter l1,b1
//def a1 = area l1,b1
//
//println "Perimeter is $p1"
//println "Area is $a1"
//
//println("Perimeter is ${perimeter(7)}")
////println "Area is ${area(breath :4)}"
//
//def t = statistics(l1,b1)
//println "Perimeter is ${t.v1}"
//println "Area is ${t.v2}"

println perimeter("length":4,"breadth" : 5)

println statistics("length" : 5, "breadth": 6)


