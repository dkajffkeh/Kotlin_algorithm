package programmers.level1

import common.trigger.TestCaseInjectionTrigger

class PlusTrueAndFalse : TestCaseInjectionTrigger {

    override fun trigger() {
        val absolutes : IntArray = intArrayOf(4,7,12)
        val signs : BooleanArray = booleanArrayOf(true,false,true)
        println(solution(absolutes,signs));
    }

    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        for(i:Int in absolutes.indices){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer
    }
}