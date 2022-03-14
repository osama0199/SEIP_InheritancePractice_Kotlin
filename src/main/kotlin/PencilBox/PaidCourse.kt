package PencilBox

class PaidCourse(
    name: String,
    val courseFee: Double,
    courseDuration: String
): Course(name,courseDuration) {
    override fun getInfo(): String = "Student name: $name \nDuration of enrolled course: $courseDuration \nPaid course Fee: $courseFee"

}