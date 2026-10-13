# Wreckage and Whispers

Wreckage and Whispers is a choice-based survival adventure played in the console. You are the sole survivor of the ship *The Wanderer*, stranded on the island of Kaimere. Your decisions shape how you search for supplies, find shelter, and try to survive.

## Features

- Branching story across up to three chapters, with different outcomes determined by earlier choices.
- Health points track your survival; reaching zero ends the run.
- Random negative events can affect health during the story.
- Four difficulty settings: Easy, Normal, Hard, and Impossible. Higher settings increase the chance and impact of hazards.
- Three text speeds and three interface/story languages: English, Russian, and Ukrainian.

## How to play

At the main menu, enter the number for the action you want:

1. Start the game
2. Set text speed
3. Set difficulty
4. Set language
5. Exit

During story scenes, enter **A** or **B** to make a choice. Choices can change the story route and your health. Some later outcomes are randomized, so a route may play differently on another run.

## How it works

`ChoiceAdventure` runs the menu, reads input, prints the story with a typewriter effect, and follows the branching paths. It also applies health changes and checks for game over. Story, menu, and event text is stored in `WreckageAndWhispers` as language-indexed arrays. Difficulty selects the random-event tables and their probability; text speed controls the delay between printed characters.

## Requirements

- Java Development Kit (JDK) 24, matching the Eclipse project configuration
- A terminal that supports UTF-8 text for the multilingual text and title art

There are no external libraries.

## Run from a terminal

From the project root, compile the source files and start the game:

```sh
javac -d bin src/griffith/*.java
java -cp bin griffith.ChoiceAdventure
```

The project can also be imported into Eclipse as an existing Java project.

## Project structure

```text
src/griffith/
├── ChoiceAdventure.java       # Menu, input, game flow, health, and random events
└── WreckageAndWhispers.java    # Story content, interface text, and event tables
```
