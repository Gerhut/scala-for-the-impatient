class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var noFee = 3
  
  def earnMonthlyInterest(interest: Double) = {
    noFee = 3
    super.deposit(interest)
  }

  override def deposit(amount: Double) = {
    if (noFee > 0) {
      noFee -= 1
      super.withdraw(1)
    }
    super.deposit(amount)
  }
  
  override def withdraw(amount: Double) = {
    if (noFee > 0) {
      noFee -= 1
      super.withdraw(1)
    }
    super.withdraw(amount)
  }
}

val account = new SavingsAccount(100)
println(account.withdraw(5))
println(account.withdraw(5))
println(account.withdraw(5))
println(account.withdraw(5))
println(account.earnMonthlyInterest(10))
println(account.withdraw(5))
println(account.withdraw(5))
println(account.withdraw(5))
println(account.withdraw(5))
