import Employee.BaseSalariedEmp
import Employee.CommissionSalariedEmp
import Employee.Employee
import Employee.HourlySalariedEmp
import PencilBox.Course
import PencilBox.PaidCourse
import PencilBox.SEIP

//Inheritance

fun main() {
    val bse = BaseSalariedEmp("Rishad",500000.0)
    val hse = HourlySalariedEmp("Siam",60.0)
    val cse = CommissionSalariedEmp("Pulok",20000.0,50000.0,5.0)


    //For Employee package
    /*val manager = salaryManager(bse)
    println("Salary: ${manager.pay()}")
    val employees: List<Employee> = listOf(bse,hse,cse) //example of runtime polymorphism. Pre-condition of polymorphism -> child classes must override parent class component
    for(employee in employees){
        println("Salary of ${employee.name}: ${employee.calculateSalary()}")
    }
    println("Salary of Base salaried employee: ${bse.calculateSalary()}")
    println("Salary of Hourly salaried employee: ${hse.calculateSalary()}")
    println("Salary of Commission salaried employee: ${cse.calculateSalary()}")*/

    //For Pencilbox package
    /*val seip = SEIP("Mobile Application Development",9000.0,"3 months")
    val paid = PaidCourse("Flutter",5000.0,"3 months")
    println(seip.getInfo())
    println(paid.getInfo())
    val information = InfoManager(seip)
    println(information.info())*/

    val employees: List<Employee> = listOf(bse,hse,cse)
    for(employee in employees){
        if(employee is Foodallowance){
            employee.payFoodAllowance()
        }
    }

}

class salaryManager(val employee: Employee){
    fun pay() = employee.calculateSalary()

}

class InfoManager(val course: Course){
    fun info() = course.getInfo()
}

interface Foodallowance{                 //Interface can't have constructor. normally interfaces includes abstract method
    fun payFoodAllowance()                  //inside interface, methods are abstract by default. object can't be created of interfaces
}

interface Medicalallowance{                 //Interface can't have constructor. normally interfaces includes abstract method
    fun payMedicalAllowance()                  //inside interface, methods are abstract by default. object can't be created of interfaces
}