class Cat(val name: String, var weight: Int, val breed: String) {
    fun meow() {
        println("${name} породы ${breed} сказал мяу!")
    }
}