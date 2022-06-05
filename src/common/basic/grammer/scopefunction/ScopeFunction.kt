package common.basic.grammer.scopefunction

fun main() {

    var price = 50000;

    var a = Book("Java 의 정석", 8000).apply {
        name = "[초특가]" + name
        discount()
    }

    // 객체를 생성하는 목적으로 사용할 수도있다
    val book = run {
        val i = price - 5000;
        Book("james",i);
    }


    book.run {
        println(this.name)
        println("${price}")
    }

    // let 함수는 객체의 상태를 변경할 수 있다.
    a.let {
        it.price = 6000
        it
    }
}

class Book(var name : String, var price : Int) {

    fun discount() {
        price -= 2000;
    }
}