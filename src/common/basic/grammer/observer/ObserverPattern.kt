package common.basic.grammer.observer
/*

fun main() {
    EventPrinter().start();
}

interface EventListener {

    fun onEvent(count : Int)

}

class Counter(val eventListener: EventListener) { // 이벤트 발생 객체

    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) {
                eventListener.onEvent(i);
            }
        }
    }
}

class EventPrinter { // 이벤트 수신

    fun start() {
        val counter = Counter(object: EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count();
    }
}

// 문제가 있는 옵저버 패턴
data class Article (val title : String , val content : String)

*/
