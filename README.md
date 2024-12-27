
# Flappy Bird Game in Java

This is a simple implementation of the classic **Flappy Bird** game using **Java** and **Swing** for graphical user interfaces (GUIs). The game features a bird that the player controls by pressing the spacebar to make it jump, avoiding obstacles (pipes) that scroll across the screen.

## Project Overview

The **Flappy Bird** game involves the following main mechanics:
- The player controls a bird that continuously falls due to gravity.
- The bird can be made to "jump" by pressing the spacebar.
- Obstacles (pipes) continuously move from right to left.
- The player earns points by successfully navigating the bird through the gaps in the pipes.
- The game ends when the bird collides with a pipe or falls off the bottom of the screen.

This project was created with **Java**, and it uses the **Swing** library to render graphics and handle user input. The game logic involves managing gravity, user input for jumping, collision detection between the bird and the pipes, and score tracking.

### Key Features:
- **Bird Movement**: The bird is controlled using the spacebar. Gravity pulls the bird downwards, and the spacebar allows the bird to jump upwards.
- **Dynamic Pipe Generation**: Pipes are randomly placed at regular intervals, and the player needs to navigate through gaps between the pipes.
- **Collision Detection**: The game detects when the bird collides with a pipe or the ground, triggering a game-over scenario.
- **Scoring**: The player earns points by successfully passing through pipe gaps. The score is displayed at the top of the screen.
- **Restart Functionality**: After a game over, pressing the spacebar allows the player to restart the game.
- **Timers**: Timers control the rate of pipe spawning and frame updates for smooth animation.

## Requirements

To run this project, ensure you have the following:
- **Java 8** or higher.
- An IDE or text editor capable of compiling and running Java code (e.g., **IntelliJ IDEA**, **Eclipse**, or **NetBeans**).

### Optional:
- The game assets (images) should be in the correct directory relative to the source code.

## How to Play

1. **Start the Game**: Run the program in your IDE or compile it using `javac`.
2. **Control the Bird**: Press the **spacebar** to make the bird jump. The bird will fall due to gravity when not jumping.
3. **Avoid Collisions**: Try to pass through the gaps between the pipes. Colliding with a pipe or the ground will end the game.
4. **Score**: Each time the bird successfully navigates through a pipe gap, you earn points. The score is displayed at the top left of the screen.

## How to Run

1. Download the source code files.
2. Ensure that the images (`flappybirdbg.png`, `flappybird.png`, `toppipe.png`, and `bottompipe.png`) are located in the same directory as the source code or adjust the paths accordingly.
3. Compile and run the program using your preferred Java IDE or command line:
   ```
   javac FlappyBird.java
   java FlappyBird
   ```

## Technologies Used

- **Java**: The core programming language for the game logic.
- **Swing**: Java's built-in library for creating GUI-based applications.
- **Timers**: Used to control the frame rate and pipe spawn intervals.
- **Graphics**: Rendered using Java's `Graphics` class to draw the bird, pipes, and background images.

## Skills Demonstrated

Throughout this project, I demonstrated a variety of skills that are crucial for developing interactive applications:

1. **Object-Oriented Programming (OOP)**:
   - Utilized **classes** like `Bird` and `Pipe` to model game entities.
   - Applied **encapsulation** by keeping the game logic and data within relevant classes.
   
2. **Graphical User Interfaces (GUI) with Java Swing**:
   - Used Java's **Swing** library to handle window management and draw images to the screen.
   - Managed interactive game graphics, like rendering the bird and pipes and updating the screen with every frame.

3. **Event Handling**:
   - Implemented key event listeners to detect user input (spacebar for jumping).
   - Managed **action events** for timers that control pipe spawning and game updates.

4. **Game Logic & Physics**:
   - Developed the **gravity-based physics** for the bird’s movement.
   - Handled **collision detection** between the bird and pipes using bounding box checks.
   - Managed the **score system** and logic for detecting when the game is over.

5. **Timers & Animation**:
   - Used **Timers** to create smooth animations by updating the game state at regular intervals (e.g., moving pipes, updating the bird’s position).

6. **Problem-Solving**:
   - Designed and implemented the game’s core mechanics from scratch, ensuring smooth gameplay and intuitive user controls.
   - Implemented **dynamic obstacle generation** and logic for game-over scenarios.

7. **Code Optimization**:
   - Managed game objects (like pipes) efficiently by removing off-screen pipes to prevent memory issues.

## Future Improvements

- **Difficulty Scaling**: Increase the speed of pipes or reduce the gap between them as the player’s score increases to make the game more challenging over time.
- **Sound Effects**: Add background music and sound effects for jumping, scoring, and collisions.
- **High Score Tracking**: Implement a high score system to encourage players to beat their best score.
- **Mobile Version**: Adapt the game to be playable on mobile devices using JavaFX or another suitable library.

## License

This project is open source and free to use. You can modify it as you like, but please give credit if you use this code.

---

This README template should serve as a good overview of the Flappy Bird game project. You can tweak the content according to your specific needs or any future features you plan to implement!
