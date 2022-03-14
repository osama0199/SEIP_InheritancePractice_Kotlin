/*SEIP ->  stripread
Paid-> Coursefee
Course-> name 
Duration
Getinfo();*/

package PencilBox

abstract class Course(val name: String, val courseDuration: String) {
    abstract fun getInfo(): String
}
