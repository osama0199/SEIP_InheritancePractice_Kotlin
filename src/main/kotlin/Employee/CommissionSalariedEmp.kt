package Employee

import Foodallowance
import Medicalallowance

class CommissionSalariedEmp(
    name: String,
    val salary: Double,
    val totalSale: Double,
    val commissionRate: Double

): Employee(name), Foodallowance, Medicalallowance{
    override fun calculateSalary(): Double = salary+((totalSale*commissionRate)/100);
    override fun payFoodAllowance() {
        println("Paying food allowance to $name")
    }

    override fun payMedicalAllowance() {
        println("Paying medical allowance to $name")
    }

}