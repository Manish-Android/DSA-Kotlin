/**
 * Day 12 – Two Sum
 *
 * Problem:
 * Given an array of integers and a target,
 * return indices of the two numbers such that they add up to the target.
 *
 * Assumption:
 * - Exactly one solution exists
 * - Same element cannot be used twice
 */

/* -------------------------------
   Approach 1: Brute Force
   Time: O(n^2)
   Space: O(1)
-------------------------------- */
fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

/* -------------------------------
   Approach 2: HashMap (Optimal)
   Time: O(n)
   Space: O(n)
-------------------------------- */
fun twoSumHashMap(nums: IntArray, target: Int): IntArray {

    val map = HashMap<Int, Int>() // number -> index

    for (i in nums.indices) {
        val required = target - nums[i]

        if (map.containsKey(required)) {
            return intArrayOf(map[required]!!, i)
        }

        map[nums[i]] = i
    }
    return intArrayOf()
}

/* -------------------------------
   Main Function
-------------------------------- */
fun main() {

    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val bruteResult = twoSumBruteForce(nums, target)
    println("Brute Force Result : ${bruteResult.joinToString()}")

    val hashMapResult = twoSumHashMap(nums, target)
    println("HashMap Result     : ${hashMapResult.joinToString()}")
}
