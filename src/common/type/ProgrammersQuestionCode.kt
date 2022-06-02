package common.type

import common.trigger.TestCaseInjectionTrigger
import common.type.YnType.N
import programmers.level1.PlusTrueAndFalse

enum class ProgrammersQuestionCode(val questionName : String,
                                   val questionURI : String,
                                   val completeYn : YnType,
                                   val caseInjectionTrigger: TestCaseInjectionTrigger
                                   ) {

    LEVEL1_QUESTION_76501( "[음양 더하기]"
        ,"https://programmers.co.kr/learn/courses/30/lessons/76501?language=kotlin"
        , N
        ,PlusTrueAndFalse())
    ;

}

