/**
 * Day 10 - Maximum Sum Subarray of Size K
 *
 * Problem:
 * Given an array of integers and a number k,
 * find the maximum sum of any contiguous subarray of size k.
 *
 * This file contains:
 * 1) Manish's optimized approach (learning-based solution)
 * 2) Standard interview-grade sliding window solution
 */

fun main() {

    println("---- Manish's Optimized Approach ----")
    manishApproach()

    println("\n---- Standard Sliding Window Approach ----")
    standardApproach()
}

/* ---------------------------------------------------
   1️⃣ Manish's Approach (Optimized after learning)
   --------------------------------------------------- */
fun manishApproach() {

    val nums = intArrayOf(2, 1, 5, 1, 3, 2)
    val k = 3

    var startPoint = 0
    var endPoint = k - 1
    var maxSum = 0
    var currentSum = 0

    // Initial window sum
    for (i in startPoint..endPoint) {
        currentSum += nums[i]
    }

    while (endPoint < nums.size) {

        if (currentSum > maxSum) {
            maxSum = currentSum
        }

        endPoint++
        if (endPoint == nums.size) break

        // Sliding the window
        currentSum = currentSum + nums[endPoint] - nums[startPoint]
        startPoint++
    }

    println("Maximum Sum (Manish) = $maxSum")
}

/* ---------------------------------------------------
   2️⃣ Standard Sliding Window (Interview Preferred)
   --------------------------------------------------- */
fun standardApproach() {

    val nums = intArrayOf(2, 1, 5, 1, 3, 2)
    val k = 3

    var windowSum = 0
    var maxSum = 0

    // First window
    for (i in 0 until k) {
        windowSum += nums[i]
    }

    maxSum = windowSum

    // Slide the window
    for (i in k until nums.size) {
        windowSum += nums[i]      // add right element
        windowSum -= nums[i - k]  // remove left element
        maxSum = maxOf(maxSum, windowSum)
    }

    println("Maximum Sum (Standard) = $maxSum")
}
