# Learning-Java
Some Java newbie exercises from Udacity Java course, to open the mind and do some OOP code.

# [HelloWorld](https://github.com/JaledMC/Learning-Java/tree/master/HelloWorld):
This project doesn't need explanation.

# [Car](https://github.com/JaledMC/Learning-Java/tree/master/car): 

# [Books](https://github.com/JaledMC/Learning-Java/tree/master/Books):  

# [Notebook](https://github.com/JaledMC/Learning-Java/tree/master/notebook):  

# [Chess](https://github.com/JaledMC/Learning-Java/tree/master/Chess):  

# [DiceGame](https://github.com/JaledMC/Learning-Java/tree/master/DiceGame):  
In this example, we will get to use the input scanner to build a guessing game where the computer will generate a random number between 1-100, and the user gets 10 guesses to find out what that number is.

When the game first starts it prints a few sentences explaining what's going on:

Then asks the user to guess the number. Once the user types in a number and hits enter, the game will compare that guessed number with the random number it had generated and tell the user if it's smaller or larger, then they get to guess again.

If the user manages to guess the number before they run out of guesses they win. Otherwise they lose!

# [GuessMovie](https://github.com/JaledMC/Learning-Java/tree/master/GuessMovie): 
Ok, it's time to build your own project in Java, this time you'll be completing a game where the player gets to guess the movie name given the number of letters in it (pretty much like hangman but with movies)!

The rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of. Your goal is to try to figure out the movie by guessing one letter at a time.

If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. If you lose 10 points, game over!

BUT the more correct letters you guess the more obvious the movie becomes and at a certain point you should be able to figure it out.

The program will randomly pick a movie title from a text file that contains a large list of movies.

You can download a sample text file to play with from the resources tab or create your own list of movie titles.

Once the computer picks a random title, it will display underscores "_" in place of the real letters, thereby only giving away the number of letters in the movie title.

Then it will wait for the player to enter their first letter guess.

If the letter was indeed in the word, the underscores "_" that match that letter will be replaced with the correct letter revealing how many letters have matched their guess and where they are.

If their guess isn't in the movie title, then the output will display the same output as the previous step as well as any letters that have been previously guessed wrong.

Eventually, if the player manages to guess all the letters in the movie title correctly before they lost 10 points, they win

# [SpaceX](https://github.com/JaledMC/Learning-Java/tree/master/SpaceX):   
The mission is to send a list of items (Habitats, bunkers, food supplies, and rovers) to Mars, but we need to run some simulations first to pick the correct fleet of rockets.

We've already designed 2 rocket prototypes, but we need your help to design and run some simulations to help us decide which type to use.

U-1

The U-1 Rocket is light weight, agile and pretty safe, but can only carry a total of 18 tonnes of cargo. It costs $100 Million to build and weighs 10 tonnes. It has a slim chance of crashing while landing but a bigger chance of exploding when launching, both chances depend on the amount of cargo carried in the rocket.
U-2

The U2 Rocket heavier than the U-1 but much safer and can carry a lot more cargo; to a total of 29 tonnes. However, it costs $120 Million to build and weighs 18 tonnes. It has a greater chance of crashing while landing than while launching, but just like the U-1 both chances depend on the amount of cargo carried.
The Mission

The mission consists of 2 phases:
Phase-1:

This phase is meant to send building equipment and construction material to help build the colony. In the resources tab, you will find a text file that contains the list of all items that we need to send called 'Phase-1.txt`. Each line in the file contains the item name as well as its weight in Kgs.

The file is here.
Phase-2:

This phase is meant to send the colony of humans along with some food resources. In the resources tab, you will find a text file that contains the list of all items that we need to send called 'Phase-2.txt`. Each line in the file also contains the item name and its weight in Kgs.

The file is here.

Your job is to run some simulations and test both rocket types for each phase separately.
