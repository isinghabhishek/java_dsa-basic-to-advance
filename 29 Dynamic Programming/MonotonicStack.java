import java.util.*;

public class MonotonicStack {
    // Example 1: Next Greater Element
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Initialize result array with -1
        Arrays.fill(result, -1);
        
        // Process elements from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack while they are smaller than current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            
            // If stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            
            // Push current element to stack
            stack.push(nums[i]);
        }
        return result;
    }
    
    // Example 2: Next Smaller Element
    public static int[] nextSmallerElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Initialize result array with -1
        Arrays.fill(result, -1);
        
        // Process elements from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack while they are larger than current element
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }
            
            // If stack is not empty, the top element is the next smaller element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            
            // Push current element to stack
            stack.push(nums[i]);
        }
        return result;
    }
    
    // Example 3: Stock Span Problem
    public static int[] stockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // First day span is always 1
        span[0] = 1;
        stack.push(0);
        
        // Calculate span for remaining days
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while price at stack top is less than current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            
            // Calculate span
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            
            // Push current index to stack
            stack.push(i);
        }
        return span;
    }
    
    public static void main(String[] args) {
        // Test Next Greater Element
        int[] nums1 = {4, 5, 2, 10, 8};
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreaterElement(nums1)));
        
        // Test Next Smaller Element
        int[] nums2 = {4, 5, 2, 10, 8};
        System.out.println("Next Smaller Elements: " + Arrays.toString(nextSmallerElement(nums2)));
        
        // Test Stock Span
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Stock Spans: " + Arrays.toString(stockSpan(prices)));
    }
} 