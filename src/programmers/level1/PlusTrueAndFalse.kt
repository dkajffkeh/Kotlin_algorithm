package programmers.level1

import common.trigger.TestCaseInjectionTrigger

class PlusTrueAndFalse : TestCaseInjectionTrigger {

    override fun trigger() {
        val absolutes : IntArray = intArrayOf(4,7,12)
        val signs : BooleanArray = booleanArrayOf(true,false,true)

        solution(absolutes,signs)
    }

    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        return answer
    }
}