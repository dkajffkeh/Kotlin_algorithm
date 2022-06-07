package programmers.level1

import common.trigger.TestCaseInjectionTrigger

class MinimumSizeRectangle : TestCaseInjectionTrigger{

    override fun trigger() {

        println(solution(arrayOf(intArrayOf(60,50), intArrayOf(30,70), intArrayOf(60,30), intArrayOf(80,40))))


    }

    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var wMax : Int = 0;
        var hMax : Int = 0;

        println(sizes.size);

        for (i : Int in sizes.indices) {
            val maxTemp = sizes[i].maxOf { index -> index };
            val minTemp = sizes[i].minOf { index -> index };

            if (maxTemp > wMax) wMax = maxTemp;
            if (minTemp > hMax) hMax = minTemp;
        }

        return wMax * hMax;
    }

}