var replaceDigits = function(s) {
    let str = 'abcdefghijklmnopqrstuvwxyz';
    let arr = s.split('');
    for (let i=0;i<arr.length;i++) {
        if(str.indexOf(arr[i]) === -1) {
            let idx = str.indexOf(arr[i-1]);
            let char = str[idx + +arr[i]];
            console.log(idx + +arr[i])
            arr[i] = char;
        }
    }
    
    return arr.join('')
};

console.log(replaceDigits("v0g6s4d"))