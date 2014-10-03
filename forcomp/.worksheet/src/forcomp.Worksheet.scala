package forcomp

import Anagrams._

object Worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); val res$0 = 
  combinations(List(('a', 2), ('b', 2)));System.out.println("""res0: List[forcomp.Anagrams.Occurrences] = """ + $show(res$0));$skip(41); val res$1 = 

  sentenceAnagrams(List("yes", "man"));System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
}
