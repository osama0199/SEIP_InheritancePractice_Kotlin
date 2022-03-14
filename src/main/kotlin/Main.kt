import Employee.BaseSalariedEmp
import Employee.CommissionSalariedEmp
import Employee.Employee
import Employee.HourlySalariedEmp
import PencilBox.PaidCourse
import PencilBox.SEIP

//Inheritance

fun main() {
    val bse = BaseSalariedEmp("Rishad",500000.0)
    val hse = HourlySalariedEmp("Siam",60.0)
    val cse = CommissionSalariedEmp("Pulok",20000.0,50000.0,5.0)

    val employees: List<Employee> = listOf(bse,hse,cse) //example of runtime polymorphism. Pre-condition of polymorphism -> child classes must override parent class component
    for(employee in employees){
        println("Salary of ${employee.name}: ${employee.calculateSalary()}")
    }

    /*println("Salary of Base salaried employee: ${bse.calculateSalary()}")
    println("Salary of Hourly salaried employee: ${hse.calculateSalary()}")
    println("Salary of Commission salaried employee: ${cse.calculateSalary()}")*/

    val seip = SEIP("Mobile Application Development",9000.0,"3 months")
    val paid = PaidCourse("Flutter",5000.0,"3 months")
    println(seip.getInfo())
    println(paid.getInfo())
}