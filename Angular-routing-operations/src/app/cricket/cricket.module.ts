import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IndiaComponent } from './india/india.component';
import { PakistanComponent } from './pakistan/pakistan.component';

@NgModule({
  declarations: [IndiaComponent, PakistanComponent],
  imports: [
    CommonModule
  ]
})
export class CricketModule { }
