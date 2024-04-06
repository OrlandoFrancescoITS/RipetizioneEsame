import { Component } from '@angular/core';
import { Pokemon } from '../../interfaces/pokemon';
import { PokemonService } from '../../services/pokemon.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrl: './pokemon.component.css'
})
export class PokemonComponent {

  pokemon : Pokemon | undefined
  constructor(private service: PokemonService, private route : ActivatedRoute) {}

  getPokemon() {
    let name = String(this.route.snapshot.paramMap.get("name"))

    this.service.getPokemon(name).subscribe(r => {
      this.pokemon = r
    })
  }

  ngOnInit(): void {
    this.getPokemon()
  }
}
