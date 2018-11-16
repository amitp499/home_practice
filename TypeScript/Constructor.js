var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("Function display value of engine " + this.engine);
    };
    return Car;
}());
var obj = new Car("red");
console.log(obj.engine);
obj.disp();
