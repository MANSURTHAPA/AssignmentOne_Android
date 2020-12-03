

fun main(){
    print("Enter your Age:")
    var age:Int = readLine()!!.toInt()
    checkAge(age)

}
fun checkAge(age: Int){
    when(age){
        in 0..16 ->
            print("You are a child")
        in 17..50 ->
            print("You are young")
        in 51..100 ->
            print("You are old")
        else ->
            print("Invalid input")
    }
}