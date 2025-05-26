# Say***Something+***
A new interpretation of my old project [SaySomething](https://github.com/CommonPolarity/SaySomething).

```
 _____________
/             \
|Hello, World!|
\__________  /
           \/  
```
 *An example of an output given.*

## Differences
- **BTForm mode**: Short for **B**asic **T**ext **Form**atting, BTForm is a simple markup language made by me in order to be used with this program.<br /> It allows for formatting color and text formatting using ANSI. In order to go into BTForm mode, all you need to do is type `!btform` and you'll be prompted et voilà!
- **Expanded use of classes**: Because of the use of classes in order to branch out the program, that means that the main class is 7 lines shorter than SaySomething.java!

## Prerequisites
- Git/GitHub Desktop
  
- Something that can run JVM
  - ...along with that obviously JDK
 
- Some sort of terminal (or another environment like BlueJ)

## How to get this running
- First, clone the repository with Git or clone using GitHub Desktop.
```git clone https://github.com/CommonPolarity/SaySomethingPlus.git```

- Secondly, open your terminal of choice and CD into directory `SaySomethingPlus`.

- Next, run the command in order to compile everything. You only need to do this once unless you edit it.
```javac *.java```

- Finally, run SaySomething by typing:
```java SaySomethingPlus```

The program should now pop up!

## Information
- Although you can exit using `Ctrl+C`, it's miles easier to just use the built in command in the program, `!exit`!
- To use it, just type `!exit` whenever it asks for you to type something.
  - It will throw something that says:
    ```Are you sure you want to exit? (y/n)```
      - To exit, type Y (or y).
- JDK version 11 is required for this program due to the use of `.repeat()`. Sorry if any of yinz like Java 8 D-:>
- A (sort of) error exists when entering and exiting BTForm mode. It won't do anything bad, it just is something I haven't got to fixing yet because I am too tired to.
- A `.jar` version of the program will come out soon! Please stay tuned :3 
