package au.edu.swin.sdmd.l02_kotlindemo


fun main() {
    print(passFail1(54))

}

// traditional function, but using return if statement
fun passFail(num: Int): String {
    return if (num >= 50) "pass" else "fail"
}

// compact function -- most Kotlin-y answer
fun passFail1(num: Int): String = if (num >= 50) "pass" else "fail"