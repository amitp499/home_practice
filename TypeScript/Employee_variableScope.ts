var lname;

var global_num =12;

class Employee{

    num_val =13;
    static sval =10;

    storeNum():void {

        var local_num=14;
    }
}

console.log("Global num: "+global_num);
console.log(Employee.sval);

var obj = new Employee();
console.log("Global Num: "+obj.num_val);