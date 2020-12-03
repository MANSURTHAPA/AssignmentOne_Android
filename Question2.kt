//function to display what day is today

fun main(){
    print("Enter the day:")
    var day = readLine()!!
    checktheDay(day)

}
fun checktheDay(day: String){
    when(day){
        "sunday","monday","tuesday","wednesday","thursday","friday" -> print("Weekday")
        "saturday"-> print("It is a happy holiday")
        else -> print("It is not a day")
    }

}