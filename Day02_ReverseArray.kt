/*
Day 02 - Reverse an Array

Approach:
- Use two pointers (start & end)
- Swap elements while start < end

Time Complexity: O(n)
Space Complexity: O(1)
*/

fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5)

    var start = 0
    var end = numbers.size - 1

    while (start < end) {
        val temp = numbers[start]
        numbers[start] = numbers[end]
        numbers[end] = temp

        start++
        end--
    }

    for (num in numbers) {
        print("$num ")
    }
}
