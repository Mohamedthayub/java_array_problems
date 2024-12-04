function findUnique(k, arr) {
    // Create a frequency map
    let frequencyMap = {};

    // Count the frequency of each element
    for (let num of arr) {
        frequencyMap[num] = (frequencyMap[num] || 0) + 1;
    }

    // Find the element whose frequency is not equal to k
    for (let num of arr) {
        if (frequencyMap[num] !== k) {
            return num;
        }
    }

    // Return -1 if no such element is found
    return -1;
}
