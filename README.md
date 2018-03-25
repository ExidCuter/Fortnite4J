# Fortnite4J
A Java wrapper for [fortnitetracker.com](https://fortnitetracker.com/)


### Prerequisites

What things you need to run the software

```
Java
```

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

`.jar` file is located in `/out/artifacts` folder.
