package au.edu.swin.sdmd.l02_kotlindemo

fun main() {

    // for loop, checking for mod 7
    for (i in 1..100) {
        if (i % 7 == 0) {
            println(i)
        }
    }

    //while loop, counting by 7
    var x = 7
    while (x < 100) {
        println(x)
        x += 7
    }

    // step 7 means count by 7s
    for (i in 7..100 step 7) { println(i) }

    // very functional approach, filter list then print
    (1..100).filter { it % 7 == 0}.map {println(it)}

}