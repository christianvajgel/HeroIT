import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { CreateHeroFormComponent } from './components/create-hero-form/create-hero-form.component';
import { HeroListComponent } from './components/hero-list/hero-list.component';
import { HomeComponent } from './components/home/home.component';
import { FormsModule } from "@angular/forms";
import { NgxTrimDirectiveModule } from "ngx-trim-directive";
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CreateHeroFormComponent,
    HeroListComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NgxTrimDirectiveModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
