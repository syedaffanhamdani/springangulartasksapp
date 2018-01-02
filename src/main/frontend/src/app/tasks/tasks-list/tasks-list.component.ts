import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";
import {TaskService} from "../task.service";
import {Http} from "@angular/http";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']})

export class TasksListComponent implements OnInit {

    //tasks{id: number, name: string, completed: boolean}[]=[];

    tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  ngOnInit() {
       this.taskService.getTasks()
          .subscribe(
              (tasks: any[])=>{
                  this.tasks = tasks
              },
              (error) => console.log(error)
          );
      this.taskService.onTaskAdded.subscribe(
          (task: Task) => this.tasks.push(task)
      );
  }

  getDueDateLabel(task: Task){
      return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task){
      console.log("task changed");
      this.taskService.saveTask(task,event.target.checked).subscribe();
  }

}
