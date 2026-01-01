/*
Day 01 - Find Maximum Element in Array

Approach:
- Initialize max with first element
- Traverse array and update max

Time Complexity: O(n)
Space Complexity: O(1)
*/

fun main() {
    val numbers = intArrayOf(3, 5, 1, 9, 2)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Maximum number is: $max")
}
