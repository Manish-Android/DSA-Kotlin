/**
 * Day 15
 * Longest Substring with At Most K Distinct Characters
 *
 * Sliding Window + HashMap
 * Time: O(n)
 * Space: O(k)
 */

fun main() {

    val s = "eceba"
    val k = 2

    var start = 0
    var maxLength = 0
    val freqMap = HashMap<Char, Int>()

    for (end in s.indices) {
        val ch = s[end]
        freqMap[ch] = freqMap.getOrDefault(ch, 0) + 1

        while (freqMap.size > k) {
            val leftChar = s[start]
            freqMap[leftChar] = freqMap[leftChar]!! - 1

            if (freqMap[leftChar] == 0) {
                freqMap.remove(leftChar)
            }
            start++
        }

        maxLength = maxOf(maxLength, end - start + 1)
    }

    println("Longest substring length (at most $k distinct) : $maxLength")
}
