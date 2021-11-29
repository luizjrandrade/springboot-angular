import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../funcionario'

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html',
  styleUrls: ['./funcionario-list.component.css']
})
export class FuncionarioListComponent implements OnInit {

  funcionario?: Funcionario[];

  constructor() { }

  ngOnInit(): void {
    this.funcionario = [{
      "id": 1,
      "nome":"Luiz",
      "sobrenome":"Andrade",
      "emailId": "luiz@email.com"
    },
    {
      "id": 2,
      "nome":"Marly",
      "sobrenome":"Andrade",
      "emailId": "marly@email.com"
    }];
  }
}
