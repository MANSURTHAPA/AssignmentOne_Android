fun main() {
    val arr: Array<Int> = arrayOf(6, 3, 2, 5, 10)

    val greatest = arr.indices.map { i: Int -> arr[i] }.max()
    val lowest = arr.indices.map { i: Int -> arr[i] }.min()

    println("Largest num is: $greatest")
    println("Smallest num is: $lowest")
}