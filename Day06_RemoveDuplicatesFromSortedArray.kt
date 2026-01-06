/**
 * Day 06 – DSA Practice
 * Problem: Remove duplicates from a sorted array in-place
 *
 * Approach:
 * - Since the array is sorted, duplicates are adjacent
 * - Maintain a pointer for the position of the next unique element
 * - Overwrite duplicates in-place
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

fun main() {

    val numbers = intArrayOf(1, 1, 2, 2, 3, 4, 4)

    // First element is always unique
    var insertPos = 1

    for (i in 1 until numbers.size) {
        if (numbers[i] != numbers[insertPos - 1]) {
            numbers[insertPos] = numbers[i]
            insertPos++
        }
    }

    println("New length = $insertPos")
    print("Array after removing duplicates: ")

    for (i in 0 until insertPos) {
        print("${numbers[i]} ")
    }
}
