//function to checksalary

fun main(){
    print("Enter your Salary:")
    var sal:Int = readLine()!!.toInt()
    checkSalary(sal)

}
fun checkSalary(sal: Int){
    if (sal>200000)
        print("You have to pay tax")
    else
        print("You don't have to pay tax")
}