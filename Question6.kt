//fun for day of week

fun main(){
    print("Input number(1-7):")
    var day:Int = readLine()!!.toInt()
    dayofWeek(day)

}
fun dayofWeek(day: Int){
    when(day){
         1 ->
            print("Sunday")
         2 ->
            print("Monday")
         3 ->
            print("Tuesday")
        4 ->
            print("Wednesday")
        5 ->
            print("Thursday")
        6 ->
            print("Friday")
        7 ->
            print("Saturday")
        else ->
            print("Invalid input")
    }
}