> 스코프 함수 즉 범위 지정함수는 다른 말로 수신객체 지정 함수 라고도 부른다. 

```kotlin
public inline fun <T> T.also(block : (T) -> Unit) : T
```
- 위 코드에서 수신함수인 T 가 직접적인 block 람다의 파라미터로 전달이 되었다. 이 경우 내부 람다식에서 it 을 사용할 수 있다 
```kotlin
something.also {
    it.a
        ...
}
```

## Apply
apply 는 수신객체 내부 프로퍼티를 변경한 다음 수신객체 자체를 반환하기 위해 사용되는 함수이다


```kotlin
// apply 사용하지 않은 경우
val person = Person();
person.name = "Patrick";
person.age = 29;
...

// apply 사용했을 경우
val person = Person().apply{
    name = "Patrick"
    age = 29
        ...
}
```

## Run
run 은 apply 와 똑같이 동작하지만 수신 객체를 return 하지 않고 run 블록의 마지막 라인을 return 한다.
수신객체에 대해 특정한 동작을 수행한 결과값을 리턴할 경우 사용한다.

```kotlin
data class Person (
    var name : String = "",
    var age : Int = 0;
    var temperature : Float = 36.5
        ) {
    fun isSick() : Boolean = temperature > 37.5
}

fun main() {
    val person = Person(name = "Patrick", age = 29, temperature = 36.5)
    val isSickPerson = person.run { 
        temperature = 40f
        isSick(); // return value
    }
}
```
- run 은 수신객체 없이도 동작이 가능하지만 run 을 사용했을경우 수신객체를 명시해줘야하 한다

```kotlin

fun main() {
    val person = Person(name = "Patrick", age = 29, temperature = 36.5)
    val isSickPerson = run {
        person.temperature = 40f
        isSick(person); // return value
    }
}

```

## with 
> with 는 수신객체에 대한 작업 후 마지막 라인일 리턴한다는 점에서 run 과 완전히 똑같이 동작하지만 run 은 확장함수로 사용되지만 with는 수신객체를 파라미터로 받아 사용한다. it 사용 불가.

```kotlin

fun main() {
    val person = Person(name = "Patrick", age = 29, temperature = 36.5)
    val isSickPerson = with(person){
        temperature = 40f
        isSick(); // return value
    }
}

```

## let 
> let 은 null check 이후 코드를 실행 해야하는 경우와 nullable 한 수신객체를 다른 타입의 변수로 변환 해야하는 경우 사용된다
- ***nullable***한 객체를 처리해야할때는 반드시 let 을 사용해야한다

```kotlin
fun main() {
    var person : Person? = null
    val isReserved = person?.let { it : Person -> 
        reserveMovie(it)
    }
}
```
- person 은 nullable 한 객체 였지만 ?.let 을 사용하면 let block 내부에서 더이상 nullable 하지 않은 it:Person 이 된것을 확인할 수 있다.


## also
> also 는 apply 와 마찬가지로 수신객체 자신을 반환한다. 객체에 대한 추가적인 작업을 한 후 객체를 반환할 때 사용된다. 내부 it 을 사용해야 한다.

***객체를 사용할때는 객체의 주소값을 return 하지 때문에 객체의 프로퍼티가 바뀌면 also 에서 return 하는 객체의 프로퍼티 또한 바뀐다.***

```kotlin
val person = Person(name = "Patrick", age = 29, temperature = 36.5)

person.also {
    it.age + 1;
}

```

- 위와같은 코드 실행시 person 의 나이는 29 -> 30 으로 변환된다. 이러한 문제 떄문에 also 는 현업에서 잘 쓰이지 않고있다고 한다.

reference : [Scope함수 한번에 정리하기](https://kotlinworld.com/255)