package programmers

fun main(){
    val classPractice = ClassPractice();
}

class ClassPractice (private val name: String = "a"){

    fun testName(){
        println(name)
    }
}