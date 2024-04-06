import { Component } from '@angular/core';
import { PokemonService } from '../../services/pokemon.service';
import { PokemonNames } from '../../interfaces/pokemon-names';

@Component({
  selector: 'app-pokemon-names',
  templateUrl: './pokemon-names.component.html',
  styleUrl: './pokemon-names.component.css'
})
export class PokemonNamesComponent {

  pokemon_names : PokemonNames[] = []
  constructor(private pokemon_service : PokemonService) { }

  getPokemonList( ) {
    this.pokemon_service.getPokemonNames().subscribe( r => {

      r.results.forEach(element => {
        console.log(element.name)
      });
      
    })
  }

  ngOnInit(): void {
    this.getPokemonList()
  }
}
