import { Component, OnInit } from '@angular/core';
import { Hero } from "../../hero";

@Component({
  selector: 'app-create-hero-form',
  templateUrl: './create-hero-form.component.html',
  styleUrls: ['./create-hero-form.component.css'],
})
export class CreateHeroFormComponent {

  powers = ['Code completion', 'Coffee deploy', 'Double braces',
            'Find lost flash drive', 'Locate open functions', 'Quick printer fix'];

  universes = ['EY Comics', 'Trainee Comics', 'Others'];

  model = new Hero( 1,' ',this.powers[0],this.universes[0],' ');

  submitted = false;

  onSubmit() {
    this.submitted = true;
    alert("Shazaaam! Your superhero was successfully submitted to our database!");
    window.location.href='/';
  }

  constructor() { }

  ngOnInit() {
    document.title = "HeroIT </> CREATE";

    let maxDate = document.getElementById("creationDate");
    maxDate.setAttribute("max", new Date(new Date().getTime() - new Date().getTimezoneOffset() * 60000).toISOString().split("T")[0]);
  }

  newHero() {
    this.model = new Hero(42,'','','','');
  }
}
