import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { PokemonNamesComponent } from './components/pokemon-names/pokemon-names.component';

const routes: Routes = [
  {path : "pokemon/:name", component: PokemonComponent},
  {path: "", component: PokemonNamesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
