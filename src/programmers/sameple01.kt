package programmers

fun main() {
    nullCheck();
}

fun helloWorld() {
    println("HelloWorld")
}

fun add(a : Int, b : Int) : Int {
    return a+b;
}

fun maxBy2(a: Int, b: Int) = if(a>b) a else b;

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        2 -> println("this is 2")
        else -> println("I dont know")
    }

    var b = when(score){
        1-> 2
        2-> 3
        else -> 5;
    }
}

// Expression vs Statement
// Array List,

fun array() {
    val students = arrayListOf<Int>(1,2,3,4);
}

fun nullCheck() {

    var name = "Patrick";

    var nullName : String? = null; // nullable

    var nameInUpperCase = name.toUpperCase();

    var nullNameUpperCase = nullName?.toUpperCase();  // nullName 이 null 이면 nullpointer 를 내지않음

    println(nullNameUpperCase);

    val lastName : String? = null;

    val fullName = "$name " +(lastName?: when(lastName){
        "lala" -> "hoho"
        else -> "haha";
    })

    //!! -> null 일 수 없다 라고 명시하는것.
}


