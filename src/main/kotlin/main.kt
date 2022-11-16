fun f(){
    println("This is f function")
}
fun main(args: Array<String>)
{
    println(Drugoe(5.0))
    val b = MyClass()
    b.f(7)
    f()
    val a = A()
    a.aFun()
    val strelka = Cat("Стрелка", 6, "Шотландка")
    println(strelka.weight)
}

fun Drugoe(x :Double) = x*x