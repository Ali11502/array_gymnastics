# README

## Overview

The `ArrayUtility` class provides basic operations for one-dimensional arrays and two implementations of the Maxsort algorithm. This README explains the purpose and functionality of each method in the class and outlines the performance comparison between the two Maxsort implementations.

## Methods

### Basic Operations

1. `swap(int[] A, int i, int j)`

   - This method swaps the elements at positions `i` and `j` in the array `A`.

2. `shiftRight(int[] A, int i, int j)`

   - This method shifts all elements in the array `A` to the right, starting from position `i` and ending at position `j`. The element at position `j` will be overridden.

### Maxsort Algorithm

The Maxsort algorithm sorts an array in descending order by repeatedly finding the maximum element and placing it at the beginning of the array. This is done according to two different strategies:

1. **Using shiftRight**

   - This method uses `shiftRight` to move the maximum element to its correct position.

2. **Using swap**

   - This method uses `swap` to exchange the maximum element with the element at its correct position.

## Performance Comparison

To determine which Maxsort implementation is faster, we perform tests by sorting random arrays of various sizes and measuring the running time of each implementation. The running times are measured using `System.nanoTime()`.

### Testing Procedure

1. **Create Random Arrays**

   - Generate random arrays of sizes `n = 10, 100, 1000`, etc.

2. **Measure Running Times**

   - For each array, sort it using both Maxsort implementations and measure the running times.

3. **Determine Cross-over Point**

   - Identify if there is an array size `N` where the running times of the two implementations cross over. For inputs of size less than `N`, one implementation may be faster, while for inputs of size greater than `N`, the other implementation may be faster.

## Example Workflow

1. **Implement Basic Operations**

   - Implement `swap` to exchange elements in the array.
   - Implement `shiftRight` to shift elements to the right within a specified range.

2. **Implement Maxsort Algorithms**

   - Implement the Maxsort algorithm using `shiftRight`.
   - Implement the Maxsort algorithm using `swap`.

3. **Measure and Compare Performance**

   - Generate random arrays of varying sizes.
   - Measure the sorting time for both Maxsort implementations.
   - Identify the cross-over point in performance between the two implementations.

