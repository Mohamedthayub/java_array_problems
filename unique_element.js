function test(arr,k){
    var count = 0;
    for(var i = 0; i<arr.length; i++){
        for(var j = 0; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        
        if(count != k){
            return arr[i];
        }   
        else{
            count = 0;
        }
    }
    
}
console.log(test([6,2,5,5,2,2,6,6],3))

