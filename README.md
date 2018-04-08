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

```
Fortnite fortnite = new Frortnite("YOUR-API-KEY");
FortniteData data = fortnite.getPlayerInfo("pc", "ExidCuter"); // this is me
if (data.getResult().isOk()) {
    System.out.println(data.getId());
    System.out.println(data.getPlayer());
    System.out.println(data.getLeagues());
    System.out.println(data.getLeague(League.Mode.life_time));
}
else {
    System.out.println(data.getResult());
}
```
### Jar file

`.jar` file is located in `/out/artifacts` folder and at the root of the project.


### WARNING

This library was developed for my bot and it's not in active development. If TRN changes anything I will try to fix it.

If you want to improve the lib, go ahead be my guest!