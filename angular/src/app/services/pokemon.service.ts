import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PokemonNames } from '../interfaces/pokemon-names';
import { Pokemon } from '../interfaces/pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {  

  url = "https://pokeapi.co/api/v2/pokemon/"
  constructor(private http : HttpClient) { }

  getPokemonNames() : Observable<PokemonNames> {
    return this.http.get<PokemonNames>(this.url + "?limit=100000&offset=0")
  }

  getPokemon(name: string) : Observable<Pokemon>{
    return this.http.get<Pokemon>(this.url + name)
  }
}
