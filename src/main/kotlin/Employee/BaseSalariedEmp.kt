package Employee

class BaseSalariedEmp(
    name: String,
    var salary: Double
    ) : Employee(name) {
    override fun calculateSalary(): Double = salary

}