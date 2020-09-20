/* object Main inherits the main method of App trait.
args is like String(args[])
app is a helper boilerplate code provided by scala
a trait is like interface of java, but it can have partial implementation also
*/

object Main extends App {
	if (args.length == 0) {
        println("dude, please give your name")
    }
	else
	{ val name = args(0)
	println("hello",name)}
}

/*without extending to app; we use main function as in java as below:

object Foo {
  def main(args: Array[String]) = {
    println("Hello, " + args(0))
  }
}
*/
