/**
 * Day 05 – DSA Practice
 * Problem: Move all zeros to the end of the array
 * Constraint: In-place, order of non-zero elements must be preserved
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

fun main() {

    val numbers = intArrayOf(0, 1, 0, 3, 12)
    var insertPos = 0

    // Step 1: Move non-zero elements to the front
    for (i in numbers.indices) {
        if (numbers[i] != 0) {
            numbers[insertPos] = numbers[i]
            insertPos++
        }
    }

    // Step 2: Fill remaining positions with zeros
    while (insertPos < numbers.size) {
        numbers[insertPos] = 0
        insertPos++
    }

    // Output result
    for (num in numbers) {
        print("$num ")
    }
}
