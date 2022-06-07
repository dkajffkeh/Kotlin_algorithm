package common.basic.grammer.objectidentity

/*fun main () {

    var a = Product("콜라",5000);
    var b = Product("콜라",5000);
    var c = a ;
    var d = Pro
    duct("사이다",1000)

 *//*   println(a == b); // a,b 는 equals 함수를 통해 객체 비교가 가능하도록 되어 true;
    println(a === b); // a 와 b 는 내용은 같지만 객체는 서로 별개이다

    println(a == c); // 내용이 같다
    println(a === c); // c -> a 타입또한 같다

    println(a == d); // 무조건 false
    println(a === d); // 이것도 무조건 false*//*

    val nestedInner : OuterClass.Inner = OuterClass.Inner();
    val inner : OuterClass.NestedInner = OuterClass().NestedInner();

    val innerValueOne : List<String> = arrayListOf("Patrick","Claire","Mandy");
    val innerValueTwo : List<String> = arrayListOf("Jackson","ET","Stark");

    val flatMapInner = FlatMapInner(innerValueOne);
    val flatMapInnerTwo = FlatMapInner(innerValueTwo);

    val flatMapOuter = FlatMapOuter(arrayListOf(flatMapInner,flatMapInnerTwo));

    val outerList : List<String> = flatMapOuter.strings.flatMap { string -> string.innerStrings }
    println(outerList.toString());
}*/
/*

class Product (val name : String, val price : Int) {
    override fun equals(other: Any?): Boolean {

        if (other is Product) {
            return other.name == name && other.price == price
        }

        return false;
    }
}

infix fun Int.multiply(x : Int) : Int = this * x;

class Person(val age : Int) {

    companion object {
        infix fun doubleAge(age : Int) : Int = 2 * age;
    }
}

class OuterClass {

    class Inner {
        fun innerFun() {
            println("inner")
        }
    }

    inner class NestedInner {
        fun innerFun() {
            println("NestedInner")
        }
    }
}

class FlatMapOuter(val strings: List<FlatMapInner>) {

    class FlatMapInner (val innerStrings : List<String>) {


    }
}
*/

