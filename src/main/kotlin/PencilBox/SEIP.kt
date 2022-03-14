package PencilBox

class SEIP(
    name: String,
    val stipend: Double,
    courseDuration: String): Course(name,courseDuration) {
    override fun getInfo(): String = "Student name: $name \nDuration of enrolled course: $courseDuration \nReceived stipend amount: $stipend"

}