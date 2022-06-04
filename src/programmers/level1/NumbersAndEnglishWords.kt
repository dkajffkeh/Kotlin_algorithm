package programmers.level1

import common.trigger.TestCaseInjectionTrigger
import programmers.TestClass

class NumbersAndEnglishWords : TestCaseInjectionTrigger {

    override fun trigger() {
        val sampleOne = "one4seveneight"
        val sampleTwo = "23four5six7"
        val sampleThree = "2three45sixseven"
        val sampleFour = "123"

        println(solution(sampleOne))
        println(solution(sampleTwo))
        println(solution(sampleThree))
        println(solution(sampleFour))


    }

    fun solution(s: String): Int {
        var s = s;

        val numberArr  = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
        for(i:Int in 0..9) {
            s = s.replace(numberArr[i],i.toString());
        }

        return Integer.parseInt(s);
    }

    fun bestSolution(absolutes: IntArray, signs: BooleanArray) {
        absolutes.foldIndexed(0) { idx, acc, num -> acc + if (signs[idx]) num else -num }
    }

}
