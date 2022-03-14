package Employee

import Foodallowance

class BaseSalariedEmp(
    name: String,
    var salary: Double
    ) : Employee(name),Foodallowance {
    override fun calculateSalary(): Double = salary
    override fun payFoodAllowance() {
        println("Paying food allowance to $name")
    }

}