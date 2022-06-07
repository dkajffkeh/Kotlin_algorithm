package programmers.level2

import common.trigger.TestCaseInjectionTrigger
import java.util.*

class FunctionDevelopment : TestCaseInjectionTrigger{

    override fun trigger() {
        solution(intArrayOf(93, 30, 55),intArrayOf(1,30,5))
        solution(intArrayOf(95, 90, 99, 99, 80, 99),intArrayOf(1,1,1,1,1))

    }

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val progressQueue : Queue<IntArray> = LinkedList();


        return answer
    }

}