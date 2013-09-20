class BankAccount {
  private var _balance = 0.0
  def deposit(cash:Double) {
    _balance += cash
  }
  def withdraw(cash:Double) {
    _balance -= cash
  }
  def balance = _balance
}

val account = new BankAccount
account.deposit(400)
println(account.balance)
account.withdraw(300)
println(account.balance)
