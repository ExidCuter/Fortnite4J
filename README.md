# Fortnite4J
A Java wrapper for [fortnitetracker.com](https://fortnitetracker.com/)


### Prerequisites

What things you need to run the software

```
Java
```

Please learn the basics of Java and Object Oriented Programming before you email me with your problems.

For serious questions email me at domen.jesenovec@student.um.si and I will try to answer them.


### Usage

#### Gradle include

```
compile 'com.github.ExidCuter:Fortnite4J:master-SNAPSHOT'
```

#### Code

```
Fortnite fortnite = new Fortnite("YOUR-API-KEY");
FortniteData data = fortnite.getPlayerInfo("platform", "Username");

if (data.getResult().isOk()) {
    System.out.println(data.getId());
    System.out.println(data.getPlayer());
    System.out.println(data.getLeagues());
    System.out.println(data.getLeague(League.Mode.life_time));
} else {
    System.out.println(data.getResult());
}
```


### WARNING

This library was developed for my bot and it's not in active development. If TRN changes anything I will try to fix it.

If you want to improve the lib, go ahead be my guest!
