/*
Day 03 - Find Second Largest Element in Array

Approach:
- Track largest and second largest
- Update second largest when needed

Time Complexity: O(n)
Space Complexity: O(1)

*/

fun main() {

    val numbers = intArrayOf(50, 60, 70, 80)

    var max = numbers[0]
    var secondMax = Int.MIN_VALUE

    for (i in 1 until numbers.size) {

        if (numbers[i] > max) {
            secondMax = max
            max = numbers[i]
        } else if (numbers[i] < max && numbers[i] > secondMax) {
            secondMax = numbers[i]
        }
    }

    if (secondMax == Int.MIN_VALUE) {
        println("Second largest element does not exist")
    } else {
        println("Second largest element is: $secondMax")
    }
}
