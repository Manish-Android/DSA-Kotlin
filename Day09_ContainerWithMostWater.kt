/**
 * Day 09 - DSA Practice
 * Problem: Container With Most Water
 *
 * Given an array of heights, find two lines that together with the x-axis
 * form a container that holds the maximum amount of water.
 *
 * Formula:
 * area = min(height[left], height[right]) * (right - left)
 *
 * Approach:
 * - Two Pointers
 * - Move the pointer with the smaller height
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

fun main() {

    val heights = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    var left = 0
    var right = heights.size - 1
    var maxWater = 0

    while (left < right) {

        val minHeight = min(heights[left], heights[right])
        val currentWater = minHeight * (right - left)

        if (currentWater > maxWater) {
            maxWater = currentWater
        }

        // Move the pointer with smaller height
        if (heights[left] < heights[right]) {
            left++
        } else {
            right--
        }
    }

    println("Maximum water :: $maxWater")
}

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}
