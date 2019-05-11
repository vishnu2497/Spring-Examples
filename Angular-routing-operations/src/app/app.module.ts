import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IndiaComponent } from './cricket/india/india.component';
import { PakistanComponent } from './cricket/pakistan/pakistan.component';

@NgModule({
  declarations: [
    AppComponent,
    IndiaComponent,
    PakistanComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
