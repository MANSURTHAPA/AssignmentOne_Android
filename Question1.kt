//function to take whole number and finds grater or less than 100

fun main(){
    print("Enter your number:")
    var num:Int = readLine()!!.toInt()
    checkNumber(num)
}

fun checkNumber(num: Int){
    when(num){
        in 0..99 -> print("Less than 100")
        100 -> print("Equal")

        else -> print("Greater than 100")
    }

}