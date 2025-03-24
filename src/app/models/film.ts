// src/app/models/film.ts
export interface Film {
    titolo: string;
    regista: string;
    anno: number;
    genere: string;
    descrizione: string;
    rating?: number; // opzionale
  }
  