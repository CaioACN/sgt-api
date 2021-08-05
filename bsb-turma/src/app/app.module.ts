import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {InputTextModule} from 'primeng/inputtext';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ButtonModule} from 'primeng/button';
import { TarefaCrudComponent } from './tarefa-crud/tarefa-crud.component';
import { ComentarioCrudComponent } from './comentario-crud/comentario-crud.component';


import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {ResponsavelCrudComponent} from './responsavel-crud/responsavel-crud.component';
import {TipoTarefaCrudComponent} from './tipoTarefa-crud/tipoTarefa-crud.component';

@NgModule({
  declarations: [
    AppComponent,
    ComentarioCrudComponent,
    TarefaCrudComponent,
    ResponsavelCrudComponent,
    TipoTarefaCrudComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ButtonModule,
    InputTextModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }