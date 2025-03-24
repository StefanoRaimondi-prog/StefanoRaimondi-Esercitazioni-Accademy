import { Component } from '@angular/core';
import { FilmListComponent } from './film-list/film-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FilmListComponent],
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'film-catalog';
}
