/**
 * Day 12
 * Problem: Longest Substring Without Repeating Characters
 *
 * Approach:
 * Sliding Window + HashSet
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

fun main() {

    val s = "abcabcbb"
    val uniqueSet = mutableSetOf<Char>()

    var start = 0
    var maxLength = 0

    for (end in s.indices) {

        val currentChar = s[end]

        // shrink window until duplicate is removed
        while (uniqueSet.contains(currentChar)) {
            uniqueSet.remove(s[start])
            start++
        }

        // add current character
        uniqueSet.add(currentChar)

        // update max length
        maxLength = maxOf(maxLength, end - start + 1)
    }

    println("Longest substring length: $maxLength")
}
