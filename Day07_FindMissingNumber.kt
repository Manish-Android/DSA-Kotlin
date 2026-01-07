/**
 * Day 07 – DSA Practice
 * Problem: Find the missing number from range 0..N
 *
 * Constraints:
 * - Array contains N distinct numbers
 * - Numbers are in range 0 to N
 *
 * Approaches:
 * 1) Sum Formula (use Long to avoid overflow)
 * 2) XOR (no overflow risk)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

fun main() {

    val numbers = intArrayOf(0, 1, 2, 3, 5)

    // -----------------------------
    // Approach 1: SUM FORMULA
    // -----------------------------
    val n = numbers.size

    val expectedSum: Long = n.toLong() * (n + 1) / 2
    var actualSum: Long = 0

    for (num in numbers) {
        actualSum += num
    }

    val missingBySum = expectedSum - actualSum
    println("Missing number using SUM approach :: $missingBySum")

    // -----------------------------
    // Approach 2: XOR
    // -----------------------------
    var xorResult = 0

    for (i in numbers.indices) {
        xorResult = xorResult xor i xor numbers[i]
    }

    xorResult = xorResult xor numbers.size

    println("Missing number using XOR approach :: $xorResult")
}
