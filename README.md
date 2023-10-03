# Programming Patterns - Exam 1 - Fall 2023

This template repository is the starter project for Programming Patterns Exam 1 Fall 2023. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Q1. Given a string **input** consisting of lowercase characters, the task is to find the total number of unique substrings with non-repeating characters.

Example 1:

Input: `input = "abba"`  
Output: `4`  
Explanation: There are 4 unique substrings. They are: `“a”`, `“ab”`, `“b”`, `“ba”`.

Example 2:

Input: `input = “acbacbacaa” `
Output: `10`

Q2. Given an array `nums` of **distinct** positive integers, return the number of tuples `(a, b, c, d)` such that `a * b = c * d` where `a`, `b`, `c`, and `d` are elements of `nums`, and `a != b != c != d`.

Example 1:

Input: `nums = [2,3,4,6]`  
Output: `8`  
Explanation: There are 8 valid tuples:  
`(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)`
`(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)`

Example 2:

Input: `nums = [1,2,4,5,10]`  
Output: `16`  
Explanation: There are 16 valid tuples:  
`(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)`  
`(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)`  
`(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)`  
`(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)`

**Constraints:**

- `1 <= nums.length <= 1000`
- `1 <= nums[i] <= 104`
- All elements in `nums` are **distinct**.

Q3. Given the `head` of a linked list and a value `x`, partition it such that all nodes **less than** `x` come before nodes **greater than or equal** to `x`.

You should **preserve** the original relative order of the nodes in each of the two partitions.

Example 1:

![](Q3.jpg)

Input: `head = [1,4,3,2,5,2], x = 3`  
Output: `[1,2,2,4,3,5]`

Example 2:

Input: `head = [2,1], x = 2`  
Output: `[1,2]`

**Constraints:**

- The number of nodes in the list is in the range `[0, 200]`.
- `-100 <= Node.val <= 100`
- `-200 <= x <= 200`

### Setup Command

`gradle clean`

### Run Command

`gradle test`
