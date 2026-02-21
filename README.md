BannerApp OOPS Printing in Java

This project demonstrates multiple ways to print the word "OOPS" as a banner pattern using Java.
Instead of solving the problem in just one way, this project explores different programming techniques and concepts to achieve the same output — helping build a deeper understanding of Java.

🎯 Objective

Learn how to solve a single problem using multiple approaches
Strengthen core Java concepts
Improve code structuring and readability
Explore real-world usage of Java utilities

Implementations (8 Approaches):

🔹 1. Basic Print Statement

Directly printed "OOPS" using System.out.print()
Starting point of the project

🔹 2. Pattern Using Print Statements

Printed full banner using multiple println() statements
Focus on understanding pattern design

🔹 3. Using String.join()

Used String.join() to structure pattern lines
Cleaner and more readable than manual concatenation

🔹 4. Optimized String.join() Usage

Reduced redundancy in pattern creation
Improved formatting and maintainability

🔹 5. Using Arrays

Stored each line of banner in an array
Printed using loop
Improved scalability

for(String str : arr){
    System.out.println(str);
}

🔹 6. Inline Array Initialization

Directly initialized array with String.join() values
Reduced boilerplate code

🔹 7. Using Methods (Modular Approach)

Created separate methods:
getOPattern()
getPPattern()
getSPattern()

Promotes reusability and clean design

🔹 8. Using HashMap (Advanced Approach ⭐)

Created a mapping:

Key → Character (O, P, S, space)
Value → Pattern array
Dynamically constructed banner using mapping

Demonstrates:

Data structures
Scalable design
