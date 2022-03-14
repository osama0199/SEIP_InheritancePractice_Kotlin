/*BaseSalariedEmployee -------
** double Salary
HourlySalariedEmployee --------
**double totalHour
** double hourlyRate
CommissionedSalariedEmployee ----------------
**double Salary
** double total Salary
** double commissionRate */
package Employee

abstract class Employee(val name: String) { //in kotlin, by default every class is declared as final which can't be accessed. use open keyword to make it accessible
    abstract fun calculateSalary(): Double
}
