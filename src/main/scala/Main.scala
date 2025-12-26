class ExampleClass {

}

object Main {

  def main(args: Array[String]): Unit = {
    val instance = new ExampleClass

    instance.nonExistentMethod("someStringArg", 5)
  }

}
