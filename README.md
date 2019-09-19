# Dragon Virtual Pets

## Module 1 Team Project

### Team Members

- Brian Bross
- Brendin Headlee
- Diana McIntosh
- Robby Remmega
- Jake Savage


### Four Different Dragon Types

**Dragon Virtual Pets has the following model:**

`Dragon` is an abstract class that all other dragons inherit from.  This super class contains attributes for `name`, `boredom`, and `magic`.  It also holds values for the attributes' minimum, maximum, and default values.  `feedDragon()` and `restDragon()` are abstract methods that are defined slightly differently based on whether the dragon is organic or robotic.

`OrganicDragon` inherits from `Dragon` and adds attributes for `hunger` and `fatigue`.  Organic dragon attributes tick up.  Performing actions, such as feeding or playing, brings the attribute values back down.

`RoboticDragon` inherits from `Dragon` and adds attributes for `oil` and `battery`.  These two attributes tick down, and performing the feed and rest actions will bring their values back up.  Robotic dragons still have boredom and magic that tick up the same as organic dragons.

Whether or not the dragon is organic or robotic, they will have either fire or ice magic.  `BreathesFire` is an interface for the `breathFire()` command, and `blowsBitterWind()` is an interface for the `blowBitterWind` command.

`DragonCave` holds a list of generated dragons.  The cave can print a list of all dragons with their attributes, and perform actions on all dragons at the same time, such as feeding them all at once.  The cave holds two attributes for `ashesBuildUp` and `iciclesBuildUp`.  Ashes and icicles tick up when fire and ice dragons are added to the cave and are also affected when magic is used.  When a fire dragon breaths fire, the ashes tick up but melt the icicles.  Likewise, when an ice dragon blows bitter wind, the ashes in the cave are reduced but the icicles are increased.


**Example list of dragons and their attributes:**

A list of attributes can be displayed individually, or display before each action is performed so the user can see the current values.  After every action that is performed is when the all of the dragon attributes tick.

```
Organic Dragons:
|Name      |Element   |Hunger    |Fatigue   |Boredom   |Magic     |
|-----------------------------------------------------------------|
|Max       |Fire      |10        |10        |10        |10        |
|Larry     |Ice       |10        |10        |10        |10        |

Robotic Dragons:`
|Name      |Element   |Oil       |Battery   |Boredom   |Magic     |
|-----------------------------------------------------------------|
|George    |Fire      |10        |10        |10        |10        |
|Buddy     |Ice       |10        |10        |10        |10        |

Shelter Attributes:
|Ash Build Up     |Icicle Build Up  |
|-----------------------------------|
|12               |12               |
```

**Playing Dragon Virtual Pets:**

When the console application first starts running, the first action the user must do is option "1" to add some dragons to the cave.  The dragon names are case sensitive and must be unique to be saved successfully to the cave.  All other menu input options are not case sensitive.
