class Student{

    private sname :string;
    private srollNo: number;

     get sName():string{
        return this.sname;
    }

    get sRollNo():number{
        return this.srollNo
    }

    set  setsName(name1:string){
        this.sname=name1;
    }

    set setsNo(no1:number){
        this.srollNo=no1;
    }

    constructor(sname :string, srollNo: number){

        this.sname = sname;
        this.srollNo = srollNo;
    }




}

var st = new Student("amit", 95);

//st.setsName="amit";

//st.setsNo=45;

console.log(st.sName);

//console.log(st.srollNo);