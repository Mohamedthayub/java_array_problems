function binarySearchFirst(arr, target) {
    let start = 0;
    let end = arr.length - 1;
    let result = -1; // To track the first occurrence

    while (start <= end) {
        let mid = Math.floor((start + end) / 2);

        if (arr[mid] === target) {
            result = mid; // Record the position of the match
            end = mid - 1; // Continue searching in the left half for the first occurrence
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return result;
}
/*
Explanation of the Fix:
Tracking the First Occurrence:

When arr[mid] === target, store mid in a result variable.
Instead of exiting, continue searching in the left half (end = mid - 1) to find the first occurrence.
Returning the Result:

After the loop ends, result will hold the index of the first occurrence of the target (or -1 if the target isn't found).
Test Cases:
javascript
Copy code
console.log(binarySearchFirst([1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3], 3)); // Output: 5
console.log(binarySearchFirst([1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3], 1)); // Output: 0
console.log(binarySearchFirst([1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3], 4)); // Output: -1
Finding the Last Occurrence (Optional):
If you need the last occurrence, the logic is similar, but you search the right half instead:

javascript
Copy code
function binarySearchLast(arr, target) {
    let start = 0;
    let end = arr.length - 1;
    let result = -1;

    while (start <= end) {
        let mid = Math.floor((start + end) / 2);

        if (arr[mid] === target) {
            result = mid; // Record the position of the match
            start = mid + 1; // Continue searching in the right half for the last occurrence
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return result;
}
Key Takeaway:
Your original binary search works for unique values, but when dealing with duplicates, you need additional logic to find the first or last occurrence of the target. Let me know if you need more clarification! 😊
*/