import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {
  constructor(private router: Router) { }

  doSearch(value: string) {
    console.log(value)
    this.router.navigateByUrl('/homepage/' + value)

  }

}
