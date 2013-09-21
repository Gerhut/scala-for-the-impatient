import java.lang.System._

val username = getenv("user.name")
val password = readLine()

if (password == "secret")
  out.println("Welcome.")
else
  err.println("Invalid password.")
  