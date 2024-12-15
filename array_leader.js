function array_leader(arr){
    var temp = [];
    var max = -Infinity;
    for(var i = arr.length - 1; i>=0; i--){
        if(arr[i] > max){
            temp.push(arr[i]);
            max = arr[i];
        }
    }
    return temp.reverse();
}
console.log(array_leader([5,10,20,40]));