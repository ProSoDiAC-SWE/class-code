class BankAccount(
    private val owner: String,
    private var balance: Double
){
    fun getOwner(): String{
        return owner
    }

    fun getBalance(): Double{
        return balance
    }

    fun deposit(amount: Double): Boolean{
        if(amount > 0){
            balance += amount
            return true
        }
        return false
    }

    fun withdraw(amount: Double): Boolean{
        return if (amount > 0 && balance >= amount){
            balance -= amount
            true
        } else {
            false
        }
    }
    override fun toString(): String{
        return "Ciao $owner. Hai sul conto $balance"
    }
}

fun main(){
    val acc = BankAccount("Pluto", 1000.0)

    acc.deposit(1000.0)
    acc.withdraw(200.0)

    println(acc)
}