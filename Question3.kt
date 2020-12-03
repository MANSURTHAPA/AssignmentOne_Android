//function to check whether the num is postive or negative

fun main(){
    print("Enter your number:")
    var num:Int = readLine()!!.toInt()
    checktheNumber(num)

}
fun checktheNumber(num: Int){
    if (num<0)
        print("It is negative number")
    else if (num==0)
        print("It is zero")
    else if (num>0)
        print("It is positive number")
    else
        print("Invalid number")
}