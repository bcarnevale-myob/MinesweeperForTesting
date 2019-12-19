# Minesweeper For Testing

The purpose of this exercise is to understand how to build the core of a system without any IO.

### Requirements

- A new game should start by specifying the height and the width of the board
- Mines should be placed at coordinates initially
- The board should have two modes of display
    1. Only squares selected by the player are shown
    2. The whole board is shown
- A player should be able to select the next square to reveal
- If the chosen square is a mine, the game is over and the player loses
  - When the player loses, the whole board is revealed
- If the chosen square is not a mine, that square is revealed with the number of mines that surround it (hints)
- If all of the squares besdies the mines are revealed, the player wins
- A new game should be able to be started with the option of mines being placed randomly
- A game should be able to take user input of a square to hit
- A game should be able to produce an output (the board)

### Game Flow Example

A new game started with specified height, width and mine coordinates

**Input**:

`Height: 3`  
`Width: 4`  
`Mine: 2,2`  
`Mine: 2,0`  
`Mine: 1,0`

**Output**:

Hidden

`....`  
`....`  
`....` 

Revealed

`1100`  
`*311`  
`*3*1`