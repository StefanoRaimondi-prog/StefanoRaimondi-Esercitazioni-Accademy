import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Film } from '../models/film';

@Component({
  selector: 'app-film-list',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './film-list.component.html',
  styleUrls: ['./film-list.component.css'] // corretto qui
})
export class FilmListComponent {
  nuovoFilm: Film = {
    titolo: '',
    regista: '',
    anno: new Date().getFullYear(),
    genere: '',
    descrizione: '',
    rating: 0,
  };

  catalogoFilm: Film[] = [];

  aggiungiFilm() {
    this.catalogoFilm.push({ ...this.nuovoFilm });
    this.nuovoFilm = {
      titolo: '',
      regista: '',
      anno: new Date().getFullYear(),
      genere: '',
      descrizione: '',
      rating: 0,
    };
  }

  rimuoviFilm(index: number) {
    this.catalogoFilm.splice(index, 1);
  }
}
