🧠 DSA Practice in Java

This repository contains my solutions to Data Structures & Algorithms problems using **Java**.  
I practice daily on platforms like **GeeksforGeeks**, **LeetCode**, and **Coding Ninjas** to strengthen my problem-solving skills and prepare for backend development interviews.

---

## 📂 Folder Structure
src/
├── arrays/ # Array-based problems
├── strings/ # String manipulation questions
├── hashmap/ # Hashing / frequency map problems
├── linkedlist/ # Linked List problems
├── recursion/ # Recursion & backtracking
├── dp/ # Dynamic Programming
└── searching_sorting/ # Binary Search / Sorting algorithms


Each folder contains multiple Java solutions.  
Every file includes:
- Problem name  
- Platform link  
- Approach explanation  
- Time & Space complexity  
- Clean Java implementation  

---

## 🧩 Example Problem Format

```java
// Problem: 1752. Check if Array Is Sorted and Rotated
// Platform: LeetCode
// Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Approach: Count number of drops (nums[i] > nums[i+1])
// Time Complexity: O(n), Space Complexity: O(1)

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) count++;
            if (count > 1) return false;
        }
        return true;
    }
}
```
🎯 Goals of This Repository

- Build strong problem-solving fundamentals

- Prepare for technical interviews (Java Backend / Software Engineer roles)

- Improve coding speed, clarity, and accuracy

- Maintain clean, well-structured Java code

- Track my learning publicly

📈 Progress

I update this repository regularly with new problems, topic-wise practice, and improved solutions.

🤝 Connect With Me

If you're also learning Java or DSA, feel free to reach out!

LinkedIn: https://www.linkedin.com/in/gaurav-sinha-a21315354/

GitHub: https://github.com/gaurav-s-gif

⭐ If this repository helped you, consider giving it a star!
  

