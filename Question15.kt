fun main(){
    val arr = IntArray(5)

    for (i in arr.indices){
        print("Enter an Element :")
        arr[i]= readLine()!!.toInt() //array declaration
    }

    OddNum(arr)
}

fun OddNum(arr: IntArray) {
    println("Odd numbers are :")
    for (i in arr.indices){
        if (arr[i]%2!==0)
            println(arr[i])
    }

}