var Student = /** @class */ (function () {
    function Student(sname, srollNo) {
        this.sname = sname;
        this.srollNo = srollNo;
    }
    Object.defineProperty(Student.prototype, "sName", {
        get: function () {
            return this.sname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "sRollNo", {
        get: function () {
            return this.srollNo;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "setsName", {
        set: function (name1) {
            this.sname = name1;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "setsNo", {
        set: function (no1) {
            this.srollNo = no1;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
var st = new Student("amit", 95);
//st.setsName="amit";
//st.setsNo=45;
console.log(st.sName);
//console.log(st.srollNo);
