/**
 * Day 08 - DSA Practice
 * Problem: Find the single number in an array
 *
 * Given an integer array where:
 * - Every element appears exactly twice
 * - Only one element appears once
 *
 * Approach:
 * - Use XOR (^)
 * - Properties:
 *   a ^ a = 0
 *   a ^ 0 = a
 *   XOR is commutative
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

fun main() {

    val numbers = intArrayOf(4, 1, 2, 1, 2)

    var result = 0

    for (num in numbers) {
        result = result xor num
    }

    println("Single number is :: $result")
}
