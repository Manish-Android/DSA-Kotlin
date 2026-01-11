/**
 * Day 11 - Longest Subarray With Sum = K
 *
 * Problem:
 * Given an array of positive integers and an integer K,
 * find the length of the longest contiguous subarray
 * whose sum is exactly K.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Sliding Window (Standard Approach)
 */

fun main() {

    val nums = intArrayOf(4, 1, 1, 1, 2, 3, 5)
    val k = 5

    var start = 0
    var currentSum = 0
    var maxLength = 0

    for (end in nums.indices) {

        // Expand window
        currentSum += nums[end]

        // Shrink window if sum exceeds k
        while (currentSum > k) {
            currentSum -= nums[start]
            start++
        }

        // Check valid window
        if (currentSum == k) {
            maxLength = maxOf(maxLength, end - start + 1)
        }
    }

    println("Maximum length is : $maxLength")
}
