# [268. Count primes in range L to R](https://takeuforward.org/practice/dsa/count-primes-in-range-l-to-r)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given an 2D array **queries** of dimension **n** *2.

The **queries[i]** represents a range from queries[i][0] to queries[i][1] (include the end points).

Return the count of prime numbers present in between each range in queries array.

### Example 1:

**Input:** queries = [ [2, 5], [4, 7] ]

**Output:** [3, 2]

**Explanation:** The range 2 to 5 contains three prime numbers 2, 3, 5.

The range 4 to 7 contains two prime numbers 5, 7.

### Example 2:

**Input:** queries = [ [1, 7], [3, 7] ]

**Output:** [4, 3]

**Explanation:** The range 1 to 7 contains four prime numbers 2, 3, 5, 7.

The range 3 to 7 contains three prime numbers 3, 5, 7.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 10^5
- 1 <= queries[i][0] <= queries[i][1] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
