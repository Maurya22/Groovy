package com.globalpayex.college

// Groovy Bean
class Student {
//     instance variables
    String name
    Character gender
    Integer roll
    Integer marks

    // static variable
    static Integer count =0

    // constructor
    Student(){
        Student.count++
    }

    // constructors
    // default
//    Student(Map map){
//        super()
//        this.name = map['name']
//        this.gender = map['gender']
//        this.roll = map['roll']
//        this.marks = map['marks']
//    }

    // instance method

    String getDetails() {
  // this -> current object
        "Name : ${this.name}\nRoll : $roll\nMarks : $marks\nGender : $gender"
    }

    void setRoll(Integer roll) {
        if(roll > 0) {
            this.roll = roll
        }
    }

    void setGender(Character gender) {
        if(gender=='f' || gender =='m') {
            this.gender = gender
        }
    }

    Character getGender() {
        this.gender?.toUpperCase()
    }

    Character calculateGrade(){
        switch (this.marks) {
            case 70..100: 'A'
                break
            case 60..69: 'B'
                break
            case 40..59: 'C'
                break
            case 0..39: 'F'
                break
            default: 'I'
        }
    }

    //static method
    static Student create(Map map){
        new Student(map)
    }

}
