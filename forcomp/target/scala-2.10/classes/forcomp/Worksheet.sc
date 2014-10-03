package forcomp

import Anagrams._

object Worksheet {
  combinations(List(('a', 2), ('b', 2)))          //> res0: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1)), List((a,
                                                  //| 2)), List((a,1), (b,1)), List((a,1), (b,2)), List((a,2), (b,1)), List((a,2), 
                                                  //| (b,2)), List((b,1)), List((b,2)))

  sentenceAnagrams(List("yes", "man"))            //> res1: List[forcomp.Anagrams.Sentence] = List(List(sane, my), List(Sean, my),
                                                  //|  List(man, yes), List(as, en, my), List(as, my, en), List(say, men), List(me
                                                  //| n, say), List(en, as, my), List(en, my, as), List(yes, man), List(my, sane),
                                                  //|  List(my, Sean), List(my, as, en), List(my, en, as))
}