// unfinished

object Show
object Then
object Around

class Bug {
  private var pos = 0
  private var dir = 1

  def move(length:Int) = {
    pos += length * dir
    this
  }

  def turn(word:Around.type = null) = {
    dir = -dir
    this
  }

  def show = {
    print(pos)
    print(' ')
    this
  }

  def and(word:Then.type) = this
  def and(word:Show.type) = this.show
  //def turn(word:Around.type) = this.turn()
}

val bugsy = new Bug

bugsy move 4 show and Then //move 6 and show turn around move 5 and show
