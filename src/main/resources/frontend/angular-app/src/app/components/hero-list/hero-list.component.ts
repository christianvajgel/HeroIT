import { Component, OnInit } from '@angular/core';
import {HEROES} from "../../mock-heroes";
import {HeroService} from "../../hero.service";

@Component({
  selector: 'app-hero-list',
  templateUrl: './hero-list.component.html',
  styleUrls: ['./hero-list.component.css']
})
export class HeroListComponent implements OnInit {

  heroes = HEROES;


  constructor(heroService: HeroService) {
    this.heroes = heroService.getHeroes();
  }

  ngOnInit() {
    document.title = "HeroIT </> LIST";
  }

}
