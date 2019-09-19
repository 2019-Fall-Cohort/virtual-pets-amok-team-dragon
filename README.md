Instructions:

You will need to first add pets to the shelter before interacting with each pet or multiple pets.
Follow on screen prompts to feed, rest, play or breath fire with your dragon pet.  
Hit 5 to exit the application. 

# Dragon Virtual Pets

## Module 1 Team Project

### Team Members

- Brian Boss
- Brendin Headlee
- Diana McIntosh
- Robby Remmmega
- Jake Savage


### Dragon Types


**Dragon Virtual Pets has the following model:**

`Dragon` is an abstract class that all other dragons inherit from.  This super class contains attributes for `name`, `boredom`, and `magic`.  It also holds values for the attributes' minimum, maximum, and default values.  `feedDragon()` and `restDragon()` are abstract methods that are defined slightly differently based on whether the dragon is organic or robotic.

`OrganicDragon` inherits from `Dragon` and adds attributes for `hunger` and `fatigue`.  Organic dragon attributes tick up.  Performing actions, such as feeding or playing, brings the attribute values back down.

`RoboticDragon` inherits from `Dragon` and adds attributes for `oil` and `battery`.  These two attributes tick down, and performing the feed and rest actions will bring their values back up.  Robotic dragons still have boredom and magic that tick up the same as organic dragons.

`BreathesFire`

