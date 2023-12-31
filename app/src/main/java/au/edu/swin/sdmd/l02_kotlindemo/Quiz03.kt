package au.edu.swin.sdmd.l02_kotlindemo

fun main() {
    // correct-ish but obvious data class example
    class Score(val name: String, val grade: Int = 0)
    val student = Score("Bob")
    println("Name: ${student.name}, Grade: ${student.grade}")

    // as a data class
    data class Score1(var name: String, var grade: Int = 42)
    val s = Score1("Student")
    s.grade = 34

}