/**
 * Day 14
 * Longest Subarray with Sum <= K (Positive Numbers)
 *
 * Sliding Window
 * Time: O(n)
 * Space: O(1)
 */

fun main() {

    val nums = intArrayOf(2, 1, 5, 1, 3, 2)
    val k = 7

    var start = 0
    var currentSum = 0
    var maxLength = 0

    for (end in nums.indices) {
        currentSum += nums[end]

        while (currentSum > k) {
            currentSum -= nums[start]
            start++
        }

        maxLength = maxOf(maxLength, end - start + 1)
    }

    println("Longest subarray length (sum <= $k) : $maxLength")
}
