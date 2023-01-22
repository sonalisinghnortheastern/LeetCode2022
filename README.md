# LeetCode2022
Solved Leetcode Questions
## Goldman Question
Question) Find the starting indices of the substrings in string (S) which is made by concatenating all words from a list(L)

          Input : S: "barfoothefoobarman" 
          L: ["foo", "bar"]  
          Output : 0 9
          Explanation : 
          // at index 0 : barfoo
          // at index 9 : foobar
          
Question) String to Integer (atoi) 
          https://leetcode.com/problems/string-to-integer-atoi/description/
          
Question) First Unique Character in a String
          https://leetcode.com/problems/first-unique-character-in-a-string/
          
Question) Median of Two Sorted Arrays
          https://leetcode.com/problems/median-of-two-sorted-arrays/
          
Question) Given a list of logs with IP addresses in the following format. lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]           Return the most frequent IP address from the logs. The retuned IP address value must be in a string format. If multiple IP addresses have the count equal to             max count, then return the address as a comma-separated string with IP addresses in sorted order.

Question) Group Anagrams 
          https://leetcode.com/problems/group-anagrams/
          
Question) https://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/

Question) https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/

Question) Longest Word in Dictionary through Deleting
          https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
          
Question) 443. String Compression
          https://leetcode.com/problems/string-compression/description/
          
Question) 724. Find Pivot Index
          https://leetcode.com/problems/find-pivot-index/description/
          
Question) Alternative Sorting
          https://practice.geeksforgeeks.org/problems/alternative-sorting1311/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

Question) Height Checker
          https://leetcode.com/problems/height-checker/submissions/639550303/
          
Question) Design HashMap
          https://leetcode.com/problems/design-hashmap/description/
          
Question) 1041. Robot Bounded In Circle
          https://leetcode.com/problems/robot-bounded-in-circle/description/
          
Question) 209. Minimum Size Subarray Sum
          https://leetcode.com/problems/minimum-size-subarray-sum/description/
          
Question) Lexicographical Maximum substring of string
          https://www.geeksforgeeks.org/lexicographical-maximum-substring-string/
          
Question) 208. Implement Trie (Prefix Tree)
          https://leetcode.com/problems/implement-trie-prefix-tree/description/
          
Question) 141. Linked List Cycle
          https://leetcode.com/problems/linked-list-cycle/description/
          
Question) 547. Number of Provinces (DFS)
          https://leetcode.com/problems/number-of-provinces/description/

Question) Find maximum occurring character in a string
          https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/
          
Question) Condensed List
          Given list of integers (linkedlist), remove any nodes that have values that have previously occurred in the list and return a reference to head of list.
          
Question) Given a 2-D String array of student-marks find the student with the highest average and output his average score. 
          If the average is in decimals, floor it down to the nearest integer. Example: Input: [{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike",                "55"}, {"Jessica", "99"}] 
          Output: 99 Explanation: Since Jessica's average is greater than Bob's, Mike's and Jason's average.
          
Question) Power of 3
          https://leetcode.com/problems/power-of-three/description/
          
Question) Problem #19 : Find number of distinct palindromic substrings
          Description: Given a string return the number of unique substrings which are distinct
          
Question) Longest Uniform Substring
          Description: Given a string identify the location of the longest uniform substring within the input string. e.g. for the input: "abbbccda" the longest uniform substring is "bbb" 
          (which starts at index 1 and is 3 characters long).
          
Question) Longest Common Substring without Repeating Characters
          Description: Find the longest substring without repeated characters
          Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
          
Question) Find first non repeating character in String
          Description: Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”, then the output should be ‘f’ and if the input string is “GeeksQuiz”, then the output should be ‘G’
          Link : https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/

Question) Rotate string left and right i and k times respectively
          Description:Rotate string left and right i and k times respectively
          Link : https://leetcode.com/problems/rotate-array/

Question) Valid Sudoku
          Description:Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the standard Sudoku rules
          Link : https://leetcode.com/problems/valid-sudoku/
          
Question) Longest Palindromic Substring
          Description:Given a string s, return the longest palindromic substring in s.
          Link : https://leetcode.com/problems/longest-palindromic-substring/
          Solve in  O(n^2) learn this solution
          Brute force O(n^3)
          
Question) Trapping Rain Water
          Description:Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
          Link : https://leetcode.com/problems/trapping-rain-water/
          
Question) Problem #40 : Prime Factorization
          Description
          Given a number n, write an efficient function to print all prime factors of n. For example, if the input number is 12, then output should be “2 2 3”. 
          And if the input number is 315, then output should be “3 3 5 7”
          Link : https://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/
          
          O(n) time first approach
          O(sqrt(n)) second approach
          
Question) Problem #43 : Efficient Harvest
          Description
          Efficient Harvest: A farmer uses pivot irrigation to water a circular field of crops. 
          Due to varying conditions, the field does not produce consistently. The farmer wants to achieve maximum profit using limited resources for harvest. 
          The field is segmented into a number of equal segments, and a profit is calculated for each segment. This profit is the cost to harvest versus the sale price           a the produce. The farmer will harvest a number of contiguous segments along with those opposite. Determine the maximum profit the farmer can achieve. 
          For example, the field is divided into n = 6 sections and will select k = 2 contiguous sections and those opposite for harvest. 
          The profit estimates are profit = [1, 5, 1, 3, 7.-3) respectively. The diagrams below show the possible choices with profits(0) at the 9 o'clock position and 
          filling counterclockwise. -3 The profit levels, from left to right, are 1 + 5+7 + 3 - 16,5+1 +7 +-3-10, and 1 + 3+3+1 -2. The maximum profit is 16. 
          Function Description Complete the function maxProfit in the editor below. The function must return the maximum profit achievable. 
          maxProfit has the following parameters: k an integer denoting the half of the needed amount of pieces of the field. profit[profit[0],..profit[n-1].
          Link : https://leetcode.com/discuss/interview-question/1321204/efficient-harvest-faang-oa-question-2021
          
          Test Cases:
          I/p
          6
          1 -2 -3 4 -5 6 -7 8 9 10 -11 12 -13 14 15 16 -17 18 -19 20
          O/p: 54
          
          I/P
          3
          1 2 3 4 5 6 7 8 9 10
          O/p: 39
          
          I/p
          1
          -3 6 3 -6
          O/p:0
          
Question) Reaching Points
          Description
          A move consists of taking a point (x, y) and transforming it to either (x, x+y) or (x+y, y). Given a starting point (sx, sy) and a target point (tx, ty),
          return True if and only if a sequence of moves exists to transform the point (sx, sy) to (tx, ty). Otherwise, return False.
          Link : https://leetcode.com/problems/reaching-points/
          
Question)  Friend circle
          Description
          There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends. Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students. 
          Input: [[1,1,0], [1,1,0], [0,0,1]] Output: 2 Explanation:The 0th and 1st students are direct friends, so they are in a friend circle. The 2nd student himself is in a friend circle. So return 2.
          
          Link : https://leetcode.com/problems/friend-circles/
          
          Similar to finding number of paths in undirected graph
          
Question) Inversions
          Description
          Count Inversions of size three in a given array.
          Link : https://www.geeksforgeeks.org/count-inversions-of-size-three-in-a-give-array/
          
Question) Variation of High Five
          Description
          Given a list of the scores of different students, items, where items[i] = [IDi, scorei] represents one score from a student with IDi, calculate each student's 
          top five average. 
          Return the answer as an array of pairs result, where result[j] = [IDj, topFiveAveragej] represents the student with IDj and their top five average. 
          Sort result by IDj in increasing order. A student's top five average is calculated by taking the sum of their top five scores and dividing it by 5 using integer 
          division.
          Link : https://leetcode.com/problems/high-five/
          
Question) Find Minimum in Rotated Sorted Array
          Description
          Given the sorted rotated array nums of unique elements, return the minimum element of this array.
          Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
Question) Problem #72 : Move all zeroes to end of array
          Description
          Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
          Link : https://www.geeksforgeeks.org/move-zeroes-end-array/
          
Question) Problem #73 : Depth  First Search
          Description
          BFS
          Link : https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
          
Question) Problem #81 : Do they belong?
          Description
          Math, Geometry
          Link : https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/
          
Question) Problem #80 : Minimum Value to Get Positive Step by Step Sum(Stay Positive)
          Description
          Given an array of integers nums, you start with an initial positive value startValue. 
          In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
          Return the minimum positive value of startValue such that the step by step sum is never less than 1.
          Link : https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
          
Question) Problem #78 : Check is sentence is pangram and return missing characters
          Description
          Check if the given sentence is Pangram, if not then return the missing characters in ascending order
          Link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
          
Question) Problem #75 : Queue using Stacks
          Description
          Implement a first in first out (FIFO) queue using only two stacks. 
          The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty). 
          Implement the MyQueue class: void push(int x) Pushes element x to the back of the queue. int pop() Removes the element from the front of the queue and returns it.
          int peek() Returns the element at the front of the queue. boolean empty() Returns true if the queue is empty, false otherwise. 
          Notes: You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid. 
          Depending on your language, the stack may not be supported natively. 
          You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
          Link : https://leetcode.com/problems/implement-queue-using-stacks/
          
Question) Problem #70 : Balanced Binary Tree
          Description
          Same as Leetcode problem number 110 Balanced Binary Tree
          Link : https://leetcode.com/problems/balanced-binary-tree/
          
Question) Problem #69 : Palindrome Linked List
          Description
          Same as Leetcode problem number 234 Palindrome Linked List
          Link : https://leetcode.com/problems/palindrome-linked-list/
