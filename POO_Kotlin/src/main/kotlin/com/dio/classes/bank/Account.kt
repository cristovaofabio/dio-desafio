package com.dio.classes.bank

class Account constructor (val number:String,val branch:String, private var balance:Double){

    fun deposit(value:Double){
        balance+=value
    }

    fun withdrawal(value: Double){
        if (value<balance) balance-=value
        else println("Don't is possible to withdrawal the value ")
    }
}