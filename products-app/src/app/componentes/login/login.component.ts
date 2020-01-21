import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/model/Usuario';
import { UsuarioService } from 'src/app/servicos/usuario.service';
import { Router } from '@angular/router';
import { Token } from 'src/app/model/Token';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private mensagem:number;
  private usuario: Usuario = new Usuario();

  constructor(private srv: UsuarioService, private router:Router) {

    this.mensagem=0;

   }

  ngOnInit() {

    if (localStorage.getItem("thiToken")){
      this.router.navigate(['/lista']);
    }

  }

  enviarDados(){
    this.srv.autenticar(this.usuario).subscribe(
      (res: Token)=>{
        // se deu certo        
        // armazeno o token no LocalStorage
        localStorage.setItem("thiToken",res.strToken);

        // indico mensagem = 0 para não exibir a mensagem de erro
        this.mensagem = 0;
        // navego para a página LISTAGEM
        this.router.navigate(['/lista']);

      },
      (err)=>{
        // aqui indico mensagem = 1 para exibir a mensagem de erro
        this.mensagem = 1;
      }
    );
  }

}
