class Matrix(val rows:Int, val cols:Int) {
  private val values = Array.ofDim[Int](rows, cols)
  def apply(row:Int, col:Int) = values(row)(col)
  def update(row:Int, col:Int, value:Int) { values(row)(col) = value }
  def +(that:Matrix) = {
    if (rows != that.rows || cols != that.cols)
      throw new Exception("Rows or cols don't match.");
    val result = new Matrix(rows, cols)
    for(rowIndex <- 0 until rows)
      for(colIndex <- 0 until cols)
        result(rowIndex, colIndex) = this(rowIndex, colIndex) + that(rowIndex, colIndex)
    result
  }
  def *(that:Matrix) = {
    if (cols != that.rows)
      throw new Exception("First cols doesn't match second rows.")
    val result = new Matrix(this.rows, that.cols)
    for (thisRowIndex <- 0 until this.rows)
      for (thatColIndex <- 0 until that.cols) {
        var value = 0
        for (thisColIndex <- 0 until this.cols)
          for (thatRowIndex <- 0 until that.rows)
            value += this(thisRowIndex, thisColIndex) * that(thatRowIndex, thatColIndex)
        result(thisRowIndex, thatColIndex) = value
      }
    result
  }
  def *(value:Int) = {
    val result = new Matrix(rows, cols)
    for(rowIndex <- 0 until rows)
      for(colIndex <- 0 until cols)
        result(rowIndex, colIndex) = this(rowIndex, colIndex) * value
    result
  }
  override def toString(): String = (for (row <- values) yield row.mkString(" ")).mkString("\n")
}

val mat1 = new Matrix(2, 1)
mat1(0, 0) = 2
mat1(1, 0) = 3
val mat2 = new Matrix(2, 1)
mat2(0, 0) = 4
mat2(1, 0) = 5
val mat3 = new Matrix(1, 2)
mat3(0, 0) = 6
mat3(0, 1) = 7

println(mat1)
println
println(mat2)
println
println(mat3)
println
println(mat1 + mat2)
println
println(mat2 * mat3)
println
println(mat2 * 2)
