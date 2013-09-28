class Bug {
  private var pos = 0
  private var dir = 1

  def move(length:Int):this.type = {
    pos += length * dir
    this
  }

  def turn():this.type = {
    dir = -dir
    this
  }

  def show():this.type = {
    print(pos)
    print(' ')
    this
  }
}

val bugsy = new Bug

bugsy.move(4).show().move(6).show().turn().move(5).show()
