package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoons = 3;
		int numberOfRaccoonsLeaving = 2;
				int numberOfRaccoonsLeft = numberOfRaccoons - numberOfRaccoonsLeaving;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfLessBees = numberOfFlowers - numberOfBees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfPigeons = 1;
		int numberOfPigeonsArriving = 1;
		int numberOfPigeonsTotal = numberOfPigeons + numberOfPigeonsArriving;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwls = 3;
		int numberOfOwlsJoining = 2;
		int numberOfOwlsTotal = numberOfOwls + numberOfOwlsJoining;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeavers = 2;
		int numberOfBeaversSwimming = 1;
		int numberOfBeaversLeft = numberOfBeavers - numberOfBeaversSwimming;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numbersOfToucans = 2;
		int numberOfToucansJoining = 1;
		int numberOfToucansLeft = numbersOfToucans + numberOfToucansJoining;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int numberOfSquirrelsMoreThanNuts = numberOfSquirrels - numberOfNuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double oneQuarter = 0.25;
		double oneDime = 0.10;
		double twoNickels = 0.10;
		double valueOfMoney = oneQuarter + oneDime + twoNickels;


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfBriersMuffins = 18;
		int numberOfMacAdamsMuffins = 20;
		int numberOfFlanneryMuffins = 17;
		int totalNumberOfMuffins = numberOfBriersMuffins + numberOfMacAdamsMuffins + numberOfFlanneryMuffins;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double valueOfWhistle = 0.24;
		double valueOfYoYo = 0.14;
		double moneySpent = valueOfWhistle + valueOfYoYo;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int numberOfLargeMarshmallows = 8;
		int numberOfSmallMarshmallows = 10;
		int totalNumberOfMarshmallows = numberOfLargeMarshmallows + numberOfSmallMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowAtHiltsHouse = 29;
		int inchesOfSnowAtBrecknocksHouse = 17;
		int inchesOfSnowMoreThanHiltsHouse = inchesOfSnowAtHiltsHouse - inchesOfSnowAtBrecknocksHouse;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double valueOfHiltsMoney = 10;
		double valueOfToyTruck = 3;
		double valueOfPencil = 2;
		double valueOfMoneyLeft = valueOfHiltsMoney - valueOfToyTruck - valueOfPencil;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int numberOfMarblesOnJosh = 16;
		int numberOfMarblesLost = 7;
		int numberOfMarblesLeft = numberOfMarblesOnJosh - numberOfMarblesLost;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int numberOfMegansSeashells = 19;
		int totalOfSeashellsNeeded = 25;
		int numberOfSeashellsNeeded = totalOfSeashellsNeeded - numberOfMegansSeashells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int numberOfBradsBalloons = 17;
		int numberOfRedBalloons = 8;
		int numberOfGreenBallons = numberOfBradsBalloons - numberOfRedBalloons;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int initialNumberOfBooks = 38;
		int numberOfBooksAdded = 10;
		int totalNumberOfBooks = initialNumberOfBooks + numberOfBooksAdded;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfBeesLegs = 6;
		int numberOfBeesTotal = 8;
		int totalNumberOfLegs = numberOfBeesLegs * numberOfBeesTotal;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double priceOfIceCream = 0.99;
		double numberOfIceCream = 2;
		double totalCost = priceOfIceCream * numberOfIceCream;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalNumberOfRocksNeeded = 125;
		int numberOfRocks = 64;
		int numberOfRocksNeeded = totalNumberOfRocksNeeded - numberOfRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int numberOfHiltsMarbles = 38;
		int marblesLost = 15;
		int totalAmountLeft = numberOfHiltsMarbles - marblesLost;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesToConcert = 78;
		int milesAlreadyDriven = 32;
		int milesLeft = totalMilesToConcert - milesAlreadyDriven;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int minutesSpentOnMorning = 90;
		int minutesSpentOnAfternoon = 45;
		int totalMinutesShoveling = minutesSpentOnMorning + minutesSpentOnAfternoon;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double numberOfHotDogs = 6;
		double priceOfHotDog = 0.50;
		double totalPayed = numberOfHotDogs * priceOfHotDog;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltsMoney = 0.50;
		double priceOfPencil = 0.07;
		int numberOfPencilsCanBuy= (int) (hiltsMoney / priceOfPencil);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numberOfButterflies = 33;
		int numberOfOrangeButterflies = 20;
		int numberOfRedButterflies = numberOfButterflies - numberOfOrangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGivenToClerk = 1.00;
		double costOfCandy = 0.54;
		double changeGivenBack = moneyGivenToClerk - costOfCandy;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int numberOfTrees = 13;
		int numberOfTreesAdded = 12;
		int totalNumberOfTrees = numberOfTrees + numberOfTreesAdded;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numberOfDays = 2;
		int hoursInDay = 24;
		int totalHours = numberOfDays * hoursInDay;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int numberOfGums = 5;
		int gumRequired = numberOfCousins * numberOfGums;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansFund = 3.00;
		double valueOfCandy = 1.00;
		double moneyLeft = dansFund - valueOfCandy;



        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberBoats = 5;
		int numberPeople = 3;
		int totalNumberPeople = numberBoats * numberPeople;



        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int legosLost = 57;
		int legosLeft = ellensLegos - legosLost;



        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthurMuffins = 35;
		int totalMuffins = 83;
		int muffinsNeeded = totalMuffins - arthurMuffins;



        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int differenceOfCrayons = willyCrayons - lucyCrayons;



        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numbersOfStickers = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = numbersOfStickers * numberOfPages;



        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double numberOfCupcakes = 100;
		double numberOfKids = 8;
		double cupcakesGivenEqually = numberOfCupcakes /  numberOfKids;



        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadTotal = 47;
		int cookiesInEachJar = 6;
		int cookiesNotInJar = gingerbreadTotal % cookiesInEachJar;






        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int numberOfCroissants = 59;
		int numberOfNeighbors = 8;
		int croissantsLeft = numberOfCroissants % numberOfNeighbors;




        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTray = 12;
		int totalCookies = 276;
		int totalTrays = totalCookies / cookiesOnTray;



        /* Exercise 43
        43. Marian???s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int numberPretzels = 480;
		int oneServing = 12;
		int totalServings = numberPretzels / oneServing;



        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalCupcakes = 53;
		int leftAtHome = 2;
		int boxesOfThree= 3;
		int cupcakesGivenAway = (totalCupcakes - leftAtHome) / boxesOfThree;



        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrots = 74;
		int perServing = 12;
		int carrotsLeft = totalCarrots % perServing;



        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddy = 98;
		int spaceForShelf = 7;
		int shelvesFilled = totalTeddy / spaceForShelf;



        /* Exercise 47
        47. Susie???s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumsContains = 20;
		int totalPictures = 480;
		int albumsTotal = totalPictures / albumsContains;



        /* Exercise 48
        48. Joe, Susie???s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalCards = 94;
		int boxMaxOfCards = 8;
		int filledBoxes = (totalCards % boxMaxOfCards);



        /* Exercise 49
        49. Susie???s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBooks = 210;
		int spaceShelves = 10;
		int booksOnEachShelve = totalBooks / spaceShelves;



        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double totalCroissants = 17;
		double numberGuests = 7;
		double eachGiven = totalCroissants / numberGuests;



	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double numberOfRooms = 5;
		double billHours = 1 / 2.15;
		double jillHours = 1 / 1.90;
		double numberOfHours = numberOfRooms / (billHours+ jillHours);



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" ???> "Smith, John D."
	    */
		String firstName = "Grace B.";
		String lastName = "Hopper";
		String fullName = "Hopper," + " Grace B.";



	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		Float distanceOfTwoCities = 800f;
		Float trainTraveled = 537f;
		int percentageTraveled = (int)(trainTraveled / distanceOfTwoCities * 100);


	}

}
