/*
Day 04 - Check if Array is Sorted (Ascending)

Approach:
- Compare each element with the next one
- If any element is greater than the next, array is not sorted

Time Complexity: O(n)
Space Complexity: O(1)
*/

fun main() {

    val arr = intArrayOf(1, 3, 2, 4, 5)
    var isSorted = true

    for (i in 0 until arr.size - 1) {
        if (arr[i] > arr[i + 1]) {
            isSorted = false
            break
        }
    }

    println(isSorted)
}
