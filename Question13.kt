fun main(){
    val row: Int= 7
    for (i: Int in 1..row) {
        for (j: Int in 1..i)
            print("* ")
        println("")
    }

}