package programmers

import common.QuestionExecutor
import common.type.ProgrammersQuestionCode
import java.time.LocalDateTime

fun main(){
    QuestionExecutor.executor(ProgrammersQuestionCode.LEVEL1_QUESTION_81301);
    val testClass : TestClass = TestClass.testClassFactory();
}

class TestClass(private val a : String) {

    companion object {
        fun testClassFactory() : TestClass {

            return TestClass("Giga");
        }
    }
}