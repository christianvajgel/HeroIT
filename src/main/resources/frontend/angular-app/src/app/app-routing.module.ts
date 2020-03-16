import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from "./components/home/home.component";
import { CreateHeroFormComponent } from "./components/create-hero-form/create-hero-form.component";
import { HeroListComponent } from "./components/hero-list/hero-list.component";


const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'create',
    component: CreateHeroFormComponent,
  },
  {
    path: 'list',
    component: HeroListComponent,
  },
  {
    path: '**',
    component: HomeComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
