function odd_even(arr){
    var obj = {};
    for(var i = 0; i<arr.length; i++){
        if(arr[i] % 2 == 0){
            obj["even"] = (obj["even"] || 0 ) + 1;
        }
        else{
            obj["odd"] = (obj["odd"] || 0 ) + 1;
        }
    }
    return obj;
}
console.log(odd_even([1,2,3,4,5,6]));