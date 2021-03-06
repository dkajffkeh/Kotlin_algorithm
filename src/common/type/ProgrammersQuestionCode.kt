package common.type

import common.trigger.TestCaseInjectionTrigger
import common.type.YnType.Y
import programmers.level1.MinimumSizeRectangle
import programmers.level1.NumbersAndEnglishWords
import programmers.level1.PlusTrueAndFalse

enum class ProgrammersQuestionCode(val questionName : String,
                                   val questionURI : String,
                                   val completeYn : YnType,
                                   val caseInjectionTrigger: TestCaseInjectionTrigger
                                   ) {

    LEVEL1_QUESTION_76501( "[음양 더하기]"
        ,"https://programmers.co.kr/learn/courses/30/lessons/76501?language=kotlin"
        , Y
        ,PlusTrueAndFalse()),

    LEVEL1_QUESTION_81301( "[숫자 문자영과 영단어]"
        ,"https://programmers.co.kr/learn/courses/30/lessons/81301"
        , Y
        ,NumbersAndEnglishWords()),

    LEVEL1_QUESTION_86491( "[최소직사각형]"
        ,"https://programmers.co.kr/learn/courses/30/lessons/86491"
        , Y
        ,MinimumSizeRectangle())
        ;


}

