package common

import common.trigger.TestCaseInjectionTrigger
import common.type.ProgrammersQuestionCode

class QuestionExecutor {

    companion object {

        fun executor(questionCode : ProgrammersQuestionCode) {
            val caseInjectionTrigger : TestCaseInjectionTrigger = questionCode.caseInjectionTrigger
            println()
            println(questionCode.questionURI)
            println(questionCode.questionName)
            caseInjectionTrigger.javaClass.getMethod("trigger").invoke(caseInjectionTrigger)
            println()
        }
    }
}