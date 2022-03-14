package Employee

class HourlySalariedEmp(
    name: String,
    val totalHour: Double,
    val hourlyRate: Double = 1000.0): Employee(name) {
    override fun calculateSalary(): Double = totalHour*hourlyRate //compact function
}