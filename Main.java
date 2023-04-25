import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.io.FileWriter;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        int selection = 0;
        while (selection != 5) {
            System.out.println();
            System.out.println("Welcome to the topic selector");
            System.out.println("Pick a topic to learn about and/or get information on");
            System.out.println("Type 1 to learn about Pokemon");
            System.out.println("Type 2 to go to the movies topic");
            System.out.println("Type 3 to go to Books topic");
            System.out.println("Type 4 to generate fun facts");
            System.out.println("Type 5 to exit program at anytime");
            Scanner input = new Scanner(System.in);
            selection = input.nextInt();
            switch (selection) {
                case 1 -> pokemonMethod();
                case 2 -> moviesMethod();
                case 3 -> booksMethod();
                case 4 -> funFactsMethod();
                case 5 -> System.out.println("thank you for playing, goodbye");
                default -> System.out.println("wrong input, follow instructions and try again");
            }
        }

    }
    public static void pokemonMethod(){
        System.out.println("Welcome to the world of Pokemon!");
        System.out.println("Now choose a pokemon topic");
        System.out.println("Type 1 to learn about the history of Pokemon");
        System.out.println("Type 2 to learn about the types of Pokemon");
        System.out.println("Type 3 to learn about ways to get involved in Pokemon");
        System.out.println("Type 5 or any other number to exit to the start of program");
        Scanner pInput = new Scanner(System.in);
        int pokemonSel = pInput.nextInt();
        switch (pokemonSel) {
            case 1 -> System.out.println("""
                    The history of the Pokémon media franchise spans over two decades from when work began officially
                     on the first game to now, and has roots even older. It started simply enough as a hobby of Satoshi Tajiri,
                     who as a child had a fondness for catching insects and tadpoles near his home in suburban Tokyo""");
            case 2 -> System.out.println("""
                    Types of Pokemon are:\040
                    Normal
                    Fire
                    Water
                    Grass
                    Electric
                    Ice
                    Fighting
                    Poison
                    Ground
                    Flying
                    Psychic
                    Bug
                    Rock
                    Ghost
                    Dark
                    Dragon
                    Steel
                    Fairy""");
            case 3 ->
                    System.out.println("There are many ways to get involved, first decide if you want to get into playing or collecting cards," +
                            " if you want to get involved in a digital game, on a console or PokemonGo for mobile devices. " +
                            " Then the world is your oyster to do whatever you want in the Pokemon World!");
            default -> System.out.println("Thanks for coming!");
        }


    }
    public  static void moviesMethod(){
        System.out.println("Welcome to the movies Section!");
        System.out.println("Next choose your topic for movies");
        System.out.println("Type 1 for a list of movie genres");
        System.out.println("Type 2 for recent best selling movies");
        System.out.println("Type 3 for a list of famous movie directors");
        System.out.println("Type 4 for a random generated movie recommendation");
        System.out.println("Type 5 or any other number to exit to start of program");
        Scanner mInput = new Scanner(System.in);
        int movieSel = mInput.nextInt();
        switch (movieSel) {
            case 1 -> {
                System.out.println("Movie Genres are as follows: ");
                System.out.println("Action. Adventure. Animation. Biography. Comedy. Crime. Documentary.\n " +
                        "Drama. Family. Fantasy. Film Noir. History. Horror.");
            }
            case 2 -> {
                System.out.println("Here's a list of recent best sellers and their IMBd ratings!");
                System.out.println("\tThe Super Mario Bros. Movie (2023)\n" +
                        "7.4\t\t\n" +
                        "John Wick: Chapter 4\tJohn Wick: Chapter 4 (2023)\n" +
                        "8.2\t\t\n" +
                        "Dungeons & Dragons: Honor Among Thieves\tDungeons & Dragons: Honor Among Thieves (2023)\n" +
                        "7.6\t\t\n" +
                        "Barbie\tBarbie (2023)\n" +
                        "Air\tAir (2023)\n" +
                        "7.7\t\t\n" +
                        "Shazam! Fury of the Gods\tShazam! Fury of the Gods (2023)\n" +
                        "6.1\t\t\n" +
                        "The Marvels\tThe Marvels (2023)\n" +
                        "65\t65 (2023)\n" +
                        "5.5\t\t\n" +
                        "Renfield\tRenfield (2023)\n" +
                        "6.7\t\t\n" +
                        "The Pope's Exorcist\tThe Pope's Exorcist (2023)\n" +
                        "6.2\t\t\n" +
                        "Evil Dead Rise\tEvil Dead Rise (2023)\n" +
                        "7.4\t\t\n" +
                        "Avatar: The Way of Water\tAvatar: The Way of Water (2022)\n" +
                        "7.7\t\t\n" +
                        "Tetris\tTetris (2023)\n" +
                        "7.4\t\t\n" +
                        "The Last Kingdom: Seven Kings Must Die\tThe Last Kingdom: Seven Kings Must Die (2023)\n" +
                        "7.1\t\t\n" +
                        "Indiana Jones and the Dial of Destiny\tIndiana Jones and the Dial of Destiny (2023)");
            }
            case 3 -> {
                System.out.println("Here's a list of famous movie directors: ");
                System.out.println("Steven Spielberg, Martin Scorsese, Alfred Hitchcock, Stanley Kubrick, Francis Ford Coppola,\n " +
                        "Quentin Tarantino, Woody Allen, Billy Wilder, John Huston, Peter Jackson, Milos Forman");
            }
            case 4 -> {
                System.out.println("Here's a suggested movie title for you to check out ");
                System.out.println("Pulp Fiction"); // will generate random movie in future
            }
            default -> System.out.println("Thanks for checking out our movie section");
        }


    }
    public static void booksMethod(){
        System.out.println("Welcome to the topic on books!");
        System.out.println("Type 1 for a list of book genres");
        System.out.println("Type 2 for a list of famous and recommended authors");
        System.out.println("Type 3 for a book recommendations");
        System.out.println("Type any other number to exit to start of program");
        Scanner bInput = new Scanner(System.in);
        int bookSel = bInput.nextInt();
        switch (bookSel) {
            case 1 -> {
                System.out.println("Book Genres are as follows: ");
                System.out.println("Fiction Genres are Fantasy, Science Fiction, Dystopian, Adventure, Romance, Horror,\n " +
                        "Thriller, Children's Fiction, Young Adult, Historical Fiction");
                System.out.println("Non-Fiction Genres are Memoir, Autobiography, Biography, Self Help, History,\n " +
                        "Business, Law, Education, Travel, True Crime ");
            }
            case 2 -> {
                System.out.println("Here's a list of recommended authors");
                System.out.println("These are the 10 greatest authors of all time, by points earned. 1. Leo Tolstoy – 327 \n " +
                        "2. William Shakespeare – 293 3. James Joyce – 194 4. Vladimir Nabokov – 190 5. Fyodor Dostoevsky – 177\n " +
                        " 6. William Faulkner – 173 7. Charles Dickens – 168 8. Anton Checkhov – 165 9. Gustave Flaubert – 163 10. Jane Austen – 161");
            }
            case 3 -> {
                System.out.println("Here's an expert book recommendation for you");
                System.out.println("Untethered Soul by Michael Singer (Spirituality Genre)"); //generates random book in future
            }
            default -> System.out.println("Thanks for checking out our book section!");
        }

    }
    public static void funFactsMethod(){
        System.out.println("this is the fun facts section");
        System.out.println("We will keep generating new fun facts for you until you choose to exit");//generates new fun facts each iteration by user
        System.out.println("Type 1 for next fun fact, type any other number to exit to start of program");
        Scanner fInput = new Scanner(System.in);
        int factSel = fInput.nextInt();
        while(factSel == 1){
            System.out.println("Type 1 for next fun fact, type any other number to exit to start of program");
            System.out.println();
            factSel = fInput.nextInt(); //generates new fun facts when completed
            System.out.println("Fun Fact: The first person convicted of speeding was going eight mph. \n" +
                    "According to Guinness World Records, the first person to be charged with speeding was \n " +
                    "Walter Arnold of the English village of Paddock Wood, Kent. On Jan. 28, 1896, Arnold \n" +
                    "was spotted going four times the speed limit in his 19th-century Benz—but since the \n " +
                    "speed limit at the time was just two miles per hour, that meant he was not going too fast by today's standards.");
        }
    }
}