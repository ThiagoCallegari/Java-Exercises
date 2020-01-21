import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { TituloComponent } from './componentes/titulo/titulo.component';
import { RodapeComponent } from './componentes/rodape/rodape.component';
import { ListagemComponent } from './componentes/listagem/listagem.component';
import { LoginComponent } from './componentes/login/login.component';
import { LogoutComponent } from './componentes/logout/logout.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    TituloComponent,
    RodapeComponent,
    ListagemComponent,
    LoginComponent,
    LogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
