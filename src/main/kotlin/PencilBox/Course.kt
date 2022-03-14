package PencilBox

abstract class Course(val name: String, val courseDuration: String) {
    abstract fun getInfo(): String
}