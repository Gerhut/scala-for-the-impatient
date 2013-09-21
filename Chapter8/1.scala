class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = { super.withdraw(1); super.deposit(amount) }
  override def withdraw(amount: Double) = { super.withdraw(1); super.withdraw(amount) }
}

val account = new FeeBankAccount(10)
println(account.deposit(20))
println(account.withdraw(20))
