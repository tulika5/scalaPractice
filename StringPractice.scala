/*String's supertype is StringOps, so, many functionalities are inherited from it
normally, string is immutable(remember python :D , java also-String final class), but scala uses implicit conversions to allow u to do anything
so, scala string have String + collection features
*/
object StringPractice extends App{
    val s="Hello"
    println(s.length) //output:5
    
    s.foreach(println) 
    /*outptut:
    H
    e
    l
    l
    o
    */
    
     val result = "hello world".filter(_ != 'l')
    print(result) //heo word
    
     print("scala".drop(2).take(2).capitalize) //Al
     
     /*test string equality*/
     val a="Hello"
     val b="Hello"
     print(a==b) //true
     //scala uses== to compare objects; not like java which needs equals to compare objects
     //also, it doesn't throw null pointer exception even if one of the strings are null
     
     //create multiline string
     val c=""""Hello
     I am
     Tulika""""
     println(c) //there may be not good formatting, like empty spacing etc so, follow below ways:
     
     val speech = """Four score and
    |seven years ago""".stripMargin  //pipe is default for stripmargin; can use custom also , as below:
    
    val speech = """Four score and
    #seven years ago""".stripMargin('#')
 /* o/p:
Four score and
seven years ago
*/

val speech = """Four score and
|seven years ago
|our fathers""".stripMargin.replaceAll("\n", " ")

//o/p: Four score and seven years ago our fathers

//not escape quotes:
val s = """This is known as a
|"multiline" string
|or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")

//o/p:This is known as a "multiline" string or 'heredoc' syntax.


   
}
