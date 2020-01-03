# Minesweeper For Testing

The purpose of this exercise is to understand how to build the core of a system without any IO.

### Requirements

- A new game should start by specifying the size of the board (all boards are squares)
- Mines should be placed at coordinates initially
- The board should have two modes of display
    1. Only squares selected by the player are shown
    2. The whole board is shown
- A player should be able to select the next square to reveal
- If the chosen square is a mine, the game is over and the player loses
  - When the player loses, the whole board is revealed
- If the chosen square is not a mine, that square is revealed with the number of mines that surround it (hints)
- If all of the squares besdies the mines are revealed, the player wins
- Mines should be placed randomly. The number of mines to be placed is dependent on the "difficulty" level selected.
    - e.g. if the board size chosed is 4 (a 4x4 board) then there will be 4 mines to be places
- A game should be able to take user input of a square to hit
- A game should be able to produce an output after taking the users input (the board)

### Game Flow Example

A new game started with specified size and mine coordinates (initially)

**Input**:

`Size: 4`    
`Mine: 2,2`  
`Mine: 2,0`  
`Mine: 1,0`

**Output**:

Hidden

`....`  
`....`  
`....`
`....`

Revealed

`1100`  
`*311`  
`*3*1`
`1211`
