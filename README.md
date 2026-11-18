# Pokemon Stat Battle

A Java program that uses [PokeAPI](https://pokeapi.co/docs/v2) to battle two Pokemon by their stats.

The user picks a Pokemon, the computer picks a random one, and the program pulls both of their base stats from the API. Then it compares the stats round by round (HP, Attack, Defense, Sp. Atk, Sp. Def, Speed) and whoever wins more rounds wins the battle.

## How to run
```
javac PokemonBattle.java
java PokemonBattle
```
Needs Java 11 or newer.

## Status
Checkpoint (3A): skeleton that sends a request to the API and prints the response if the code is 200.
