package example

object Main extends App{
	println(Lists.sum(List()))
	println(Lists.sum(List(1)))
	println(Lists.sum(List(1, 2)))
	println(Lists.sum(List(1, 2, 3)))
	
	println(Lists.max(List(0)))
	println(Lists.max(List(0, 1)))
	println(Lists.max(List(0, 1, 5)))
	println(Lists.max(List()))
}