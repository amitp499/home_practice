class Car {

    engine:string;


    constructor(engine:string){
        this.engine=engine;
    } 


    disp():void{

        console.log("Function display value of engine "+this.engine);
    }

}

var obj = new Car("red");

console.log(obj.engine);

obj.disp();