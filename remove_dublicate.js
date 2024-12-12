var temp = [];
var arr = [19 ,19 ,11 ,17 ,15 ,,15, 20, 11, 10, 17, 17, 15, 18, 16, 17, 13 ,17 ,19]
var result = arr.sort();

for(var i = 0; i<arr.length; i++){
     if (result[i] != result[i+1]){
        temp.push(result[i]);
    }
}

console.log(temp);

/*


Given an array arr of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements.

Examples:

Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurence.
Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.

*/