# Java Test: Space Exploration Simulation

## Objective
Create a Java application that simulates a **Space Exploration Mission**. The system will allow users to:
1. Manage astronauts, spaceships, and space entities (planets, stars, asteroids).
2. Explore planets and asteroids, calculate danger levels, and simulate space travel.
3. Use collections, iterators, and streams to manipulate data.
4. Validate input using regex (Pattern & Matcher).
5. Demonstrate OOP principles (encapsulation, inheritance, polymorphism, and abstraction).

---

## Requirements

### 1. OOP Design
- **Abstract Class**:
  - `SpaceEntity`:
    - Attributes: `name` (String), `distanceFromEarth` (double), `discoveredBy` (String), `discoveryYear` (int).
    - Methods:
      - Abstract method: `String getDescription()`.
      - Concrete method: `String getDiscoveryInfo()` - returns discovery details.
- **Interfaces**:
  - `Explorable`:
    - Method: `String explore()`.
  - `Hazardous` (extends `Explorable`):
    - Method: `int getDangerLevel()`.
- **Child Classes**:
  - `Planet` (extends `SpaceEntity`, implements `Explorable`):
    - Attributes: `habitable` (boolean), `numMoons` (int).
    - Methods:
      - Implement `getDescription()`.
      - Implement `explore()`.
      - Method: `boolean canSupportLife()` - returns true if habitable and has at least 1 moon.
  - `Star` (extends `SpaceEntity`):
    - Attributes: `temperature` (double), `starType` (String) - e.g., "Red Giant", "White Dwarf".
    - Methods:
      - Implement `getDescription()`.
      - Method: `String getStarClassification()` - returns classification based on temperature.
  - `Asteroid` (extends `SpaceEntity`, implements `Hazardous`):
    - Attributes: `size` (double), `composition` (String) - e.g., "Metallic", "Rocky".
    - Methods:
      - Implement `getDescription()`.
      - Implement `explore()`.
      - Implement `getDangerLevel()`.
      - Method: `boolean isPotentiallyHazardous()` - returns true if size > 1 km.

### 2. Collections
- Use a `List<Astronaut>` to store all astronauts on the spaceship.
- Use a `Set<SpaceEntity>` to store unique space entities (planets, stars, asteroids).
- Use a `Queue<Mission>` to manage a list of upcoming missions.
- Use a `Map<String, Astronaut>` to store astronauts by their unique ID.

### 3. Iterator
- Implement a method to iterate through the `List<Astronaut>` using an `Iterator` and print all astronauts.

### 4. Method `contains`
- Implement a method to check if a specific astronaut is in the `List<Astronaut>` using the `contains` method.

### 5. Wildcard
- Create a method that accepts a `List<? extends Astronaut>` and prints the details of all astronauts. This should work for both `Astronaut` and `Commander` objects.

### 6. Streams
- Use Java Streams to:
  - Filter astronauts by nationality.
  - Sort astronauts by age.
  - Remove duplicate space entities from a list using `distinct()`.
  - Count the number of missions in the `Queue<Mission>`.
  - Find the average temperature of all stars in the `Set<SpaceEntity>`.

### 7. Regex (Pattern & Matcher)
- Validate the following using regex:
  - Astronaut ID format: Must start with "A" followed by 3 digits (e.g., "A001").
  - Mission code format: Must follow "MISSION-XXX" where XXX is a 3-digit number.

### 8. Pattern & Matcher
- Create a method to extract and print all mission codes from a string.

---

## Project Structure

### Classes and Interfaces
1. **Abstract Class**:
   - `SpaceEntity`
2. **Interfaces**:
   - `Explorable`
   - `Hazardous`
3. **Child Classes**:
   - `Planet`
   - `Star`
   - `Asteroid`
4. **Existing Classes**:
   - `Astronaut`:
     - Attributes: `name`, `age`, `nationality`, `rank`, `yearsOfExperience` (int).
     - Methods:
       - `boolean isEligibleForMission()` - returns true if yearsOfExperience >= 5.
   - `Commander` (extends `Astronaut`):
     - Attributes: `missionsCompleted` (int).
     - Methods:
       - `String issueCommand()` - returns a command based on missions completed.
   - `Mission`:
     - Attributes: `missionCode`, `destinationPlanet`, `crewList`, `missionDuration` (int) - in days.
     - Methods:
       - `boolean isLongTermMission()` - returns true if missionDuration > 365 days.

---

## Sample Output
=== Space Exploration Simulation ===

1.Add Astronaut

2.Add Space Entity (Planet/Star/Asteroid)

3.Schedule Mission

4.List Astronauts

5.List Space Entities

6.Filter Astronauts by Nationality

7.Sort Astronauts by Age

8.Explore Space Entity

9.Calculate Danger Level for Asteroid

10.Check if Planet Can Support Life

11.Get Star Classification

12.Validate Astronaut ID

13.Extract Mission Codes

0.Exit

Enter your choice: 2
Enter Space Entity Type (Planet/Star/Asteroid): Planet
Enter Name: Mars
Enter Distance from Earth (in light-years): 0.000024
Enter Discovered By: NASA
Enter Discovery Year: 1965
Is the planet habitable? (true/false): false
Enter Number of Moons: 2
Space Entity added successfully!

Enter your choice: 10
Enter Planet Name: Mars
Can Mars support life? false

Enter your choice: 11
Enter Star Name: Sun
Star Classification of Sun: Yellow Dwarf

Enter your choice: 13
Enter mission log: "Preparing for MISSION-001 to Mars. Next is MISSION-002 to Kepler-22b."
Extracted Mission Codes: MISSION-001, MISSION-002

Copy

---

## Notes
- Ensure all classes and methods are implemented as described.
- Test edge cases (e.g., empty collections, invalid inputs).
- Verify that the output matches the expected behavior.
