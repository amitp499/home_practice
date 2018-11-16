var lname;
var global_num = 12;
var Employee = /** @class */ (function () {
    function Employee() {
        this.num_val = 13;
    }
    Employee.prototype.storeNum = function () {
        var local_num = 14;
    };
    Employee.sval = 10;
    return Employee;
}());
console.log("Global num: " + global_num);
console.log(Employee.sval);
var obj = new Employee();
console.log("Global Num: " + obj.num_val);
