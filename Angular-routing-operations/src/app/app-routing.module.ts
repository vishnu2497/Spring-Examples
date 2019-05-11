import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IndiaComponent } from './cricket/india/india.component';
import { PakistanComponent } from './cricket/pakistan/pakistan.component';

const routes: Routes = [
  { path: 'india', component: IndiaComponent },
  { path: 'pakistan', component: PakistanComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
