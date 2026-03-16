# PalindromeCheckerApp

## Use Case 1 – Welcome Page
- Displays a welcome message to the user
- Entry point of the application
## Use Case 2 – Hard Code Palindrome
- Hard coded string is checked for palindrome
- Uses StringBuilder reverse() method
## Use Case 3 – User Input Palindrome Validation
- Allows the user to enter a string
- Uses StringBuilder reverse() method
- Checks whether it is a palindrome
## Use Case 4 – Character Array Based Palindrome Check
- Converts string to char[]
- Uses two-pointer technique (start & end)
- Compares characters efficiently
- Data Structure: char[]
## Use Case 5 – Stack Based Palindrome Check
- Goal: Use stack to reverse characters and validate palindrome
- Push Operation – inserts characters into the stack
- Pop Operation – removes characters in reverse order
- Reversal Logic – stack naturally reverses elements
- Data Structure: Stack
## Use Case 6 – Queue + Stack Based Palindrome Check
- Goal: Demonstrate FIFO vs LIFO using Queue and Stack
- Queue follows FIFO – First In First Out
- Stack follows LIFO – Last In First Out
- Enqueue and Dequeue – insert and remove from queue
- Compare dequeue vs pop to validate palindrome
- Data Structures: Queue, Stack
## Use Case 7 – Deque Based Optimized Palindrome Checker
- Goal: Use Deque to compare front and rear elements
- Deque – Double Ended Queue, allows insertion and deletion from both ends
- Front and Rear Access – direct comparison of first and last characters
- Optimized – no need for separate reversal data structures
- Data Structure: Deque
## Use Case 8 – Linked List Based Palindrome Checker
- Goal: Check palindrome using singly linked list
- Singly Linked List – elements connected using node references
- Fast and Slow Pointer – finds middle of linked list efficiently
- In-Place Reversal – reverses second half without extra memory
- Compare both halves to validate palindrome
- Data Structure: Singly Linked List
## Use Case 9 – Recursive Palindrome Checker
- Goal: Check palindrome using recursion
- Recursion – method calls itself to solve smaller subproblems
- Base Condition – prevents infinite recursion and terminates calls
- Call Stack – manages method calls during recursion
- Compares start and end characters recursively
- Data Structure: Call Stack
## Use Case 10 – Case-Insensitive and Space-Ignored Palindrome
- Goal: Ignore spaces and case while checking palindrome
- String Preprocessing – normalize string before checking
- replaceAll() – removes all spaces using regular expression
- toLowerCase() – converts string to lowercase for case-insensitive check
- Regular Expressions – used to clean the input string
- Data Structure: String / Array