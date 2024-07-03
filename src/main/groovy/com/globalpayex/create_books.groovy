package com.globalpayex

import com.globalpayex.college.Author
import com.globalpayex.college.Book
import com.globalpayex.college.Contact

//def authors = [
//        new Author(name: 'Rakesh', gender: 'm', ratings: 5,
//                contact: new Contact(email: 'rakesh@gmail.com',mobile: 9876543210, websiteUrl: 'https://slowathon.com')),
//        new Author(name: 'Jane', gender: 'f', ratings: 4,
//                contact: new Contact(email: 'jane@gmail.com',mobile: 876543210, websiteUrl: 'https://jane.com'))
//]
//
//def book = new Book(title: 'Book 1', price: 999, pages: 1000, authors: authors)

// groovy builder
// ObjectGraphBuilder

def ogb = new ObjectGraphBuilder(classNameResolver: 'com.globalpayex.college')
def book = ogb.book(title : 'Book 1', price : 9000, pages : 1000){
    author (name : 'Rakesh', gender : 'm', ratings : 5) {
        contact email : 'rakesh@gmail.com', mobile :9876543210, websiteUrl : 'https://slowathon.com'
    }
    author(name : 'Jane', gender : 'f', ratings : 4) {
        contact email : 'jane@gmail.com', mobile :8976543210, websiteUrl : 'https://jane.com'
    }

}
println book


