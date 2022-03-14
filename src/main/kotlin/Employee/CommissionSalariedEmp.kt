package Employee

class CommissionSalariedEmp(
    name: String,
    val salary: Double,
    val totalSale: Double,
    val commissionRate: Double

): Employee(name){
    override fun calculateSalary(): Double = salary+((totalSale*commissionRate)/100);
}