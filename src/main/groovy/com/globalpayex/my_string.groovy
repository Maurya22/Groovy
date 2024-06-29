package com.globalpayex

String.metaClass.csvify ={
//    delegate <-> this
    delegate.replaceAll " ", ","
}

def data = "rakesh m 10 99"
//str ->  rakesh,m,10,99
println data.csvify()


