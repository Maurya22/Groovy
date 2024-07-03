package com.globalpayex

import com.globalpayex.banking.Account

def acc1 = new Account(accNumber: "789990088BAS", accountType: "Saving",balance: 5600.0, contactNos: [87654342109])
def acc2 = new Account(accNumber: "6547888899ABC", accountType: "Saving",balance: 7600.0)


println acc1.getDetails()
//acc1.withdraw(1000)
acc1 - 5000     // internally acc1.minus(5000)
println acc1.balance

acc1 + 7000 // internally acc1.plus(7000)
println acc1.balance


acc1.contactNos.add(89786663763777)

acc1 << 100

acc1 << 200 << 450
println acc1.contactNos

