export class Task{

    public id: number;
    public name: string;
    public completed: boolean;
    public dueDate: string;





    constructor( name: string, completed: boolean, duedate: string) {
        this.name = name;
        this.completed = completed;
        this.dueDate = duedate;
    }
}
