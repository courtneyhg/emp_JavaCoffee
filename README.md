# emp_JavaCoffee
Java Coffee: Yuki Feng, Jason Yang, Courtney Huang
### Tests Performed
   1. 4 `Comparable` arrays of varying sizes (100, 10000, 1000000, 100000000) are created as the test cases.
   2. For each test case, the current time is recorded and assigned to a variable. Then, both `linearSearch` and `binarySearch` are used
   to find a target number in the array. After the number if found, the time is recorded again. 
   3. The before time is subtracted from the after time in order to find out the total time elapsed.

### Results
- Binary: 0ms for size 100, 0ms for size 10000, 2ms for size 1000000, 0ms for size 100000000, 0ms for size 100000000, 7ms for size 100000000
- Linear: 0ms for size 100, 0ms for size 10000, 2ms for size 1000000, 13ms for size 100000000, 31ms for size 100000000, 26ms for size 100000000
   

### Conclusions
- BinarySearch takes less time than LinearSearch. However, this is only evident after the array length increases to a certain point.
