import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { PokemonNamesComponent } from './components/pokemon-names/pokemon-names.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';

@NgModule({
    declarations: [
        AppComponent,
        PokemonNamesComponent,
        PokemonComponent
    ],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule
    ]
})
export class AppModule { }
