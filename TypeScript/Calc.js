function Calculator(val1, val2) {
    if ((val1 != undefined) || (val2 != undefined)) {
        return (val1 + val2);
    }
    else {
        return 0;
    }
}
//var a = Calculator(1,2);
var a = Calculator();
console.log(a);
