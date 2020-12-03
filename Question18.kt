fun main(){
    val words=arrayOf("data","confidential","eligible","elite","pretentious")
    val meanings=arrayOf("facts and statistics collected together for reference or analysis.","intended to be kept secret.",
            "having the right to do or obtain something; satisfying the appropriate conditions.",
            "a group or class of people seen as having the most power and influence in a society, especially on account of their wealth or privilege.",
            "attempting to impress by affecting greater importance or merit than is actually possessed.")
    val dictionaryMap= mapOf<String,String>("data" to "facts and statistics collected together for reference or analysis.",
            "confidential" to "intended to be kept secret.", "eligible" to "having the right to do or obtain something; satisfying the appropriate conditions.",
            "elite" to "a group or class of people seen as having the most power and influence in a society, especially on account of their wealth or privilege.",
            "pretentious" to "attempting to impress by affecting greater importance or merit than is actually possessed.")

    print("Enter a word: ")
    val wrd= readLine()!!
    println("$wrd meaning is : ${dictionaryMap[wrd]}")
}