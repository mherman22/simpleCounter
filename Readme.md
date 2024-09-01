# Counter Demo Project

This project is a simple Java application that demonstrates various types of counters. The counters include an integer counter, an ASCII counter, a date counter, a sequence counter, and a hexadecimal counter. Each counter has methods to increment, decrement, reset, and display its value.

## Table of Contents

- [Counters](#counters)
    - [IntCounter](#intcounter)
    - [AsciiCounter](#asciicounter)
    - [DateCounter](#datecounter)
    - [SequenceCounter](#sequencecounter)
    - [HexCounter](#hexcounter)
- [How to Run the Project](#how-to-run-the-project)
- [License](#license)

## Counters

### IntCounter

The `IntCounter` is a basic counter that uses integers. It counts up and down using regular numbers (0, 1, 2, ...). This is the simplest type of counter, commonly used for general counting purposes.

**Methods:**
- `increment()`: Increases the value by 1.
- `decrement()`: Decreases the value by 1.
- `reset()`: Resets the value to 0.
- `valueAsString()`: Returns the current value as a string.

### AsciiCounter

The `AsciiCounter` increments through ASCII characters. Each time the counter increments, it moves to the next ASCII character in the sequence (e.g., 'A' to 'B', 'B' to 'C', ...).

**Methods:**
- `increment()`: Moves to the next ASCII character.
- `decrement()`: Moves to the previous ASCII character.
- `reset()`: Resets to the starting character.
- `valueAsString()`: Returns the current character as a string.

### DateCounter

The `DateCounter` is designed to count dates. When incremented, it moves to the next date in the sequence. It's useful for applications where you need to keep track of a sequence of dates.

**Methods:**
- `increment()`: Advances to the next date.
- `decrement()`: Moves to the previous date.
- `reset()`: Resets to the initial date.
- `valueAsString()`: Returns the current date as a string.

### SequenceCounter

The `SequenceCounter` works with a predefined sequence of strings. You initialize it with an array of strings, and it cycles through them. It’s useful when you have a specific set of values you want to iterate through, such as steps in a process or a list of words.

**Methods:**
- `increment()`: Moves to the next item in the sequence.
- `decrement()`: Moves to the previous item in the sequence.
- `reset()`: Resets to the first item in the sequence.
- `valueAsString()`: Returns the current item as a string.

### HexCounter

The `HexCounter` is a counter that counts in hexadecimal (base 16). Instead of just using the digits 0-9, it also uses the letters A-F. This counter is useful in computing, where hexadecimal values are often used to represent binary data more compactly.

**Methods:**
- `increment()`: Increases the value by 1 in hexadecimal.
- `decrement()`: Decreases the value by 1 in hexadecimal.
- `reset()`: Resets the value to 0.
- `valueAsString()`: Returns the current value as a hexadecimal string.

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor and command line

### Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/counter-demo.git
   cd counter-demo
2. **Compile the Code: If you're using the command line, navigate to the directory containing the CounterDemo.java file and run:**
    ```bash
    javac CounterDemo.java
   ```
3. **un the Application:**
   ```bash
    java CounterDemo
   ```
4. Interact with the Program: The application will present you with a menu to choose which counter you want to test. Enter the corresponding number (1-5) and follow the on-screen instructions to see the counter in action


Here’s a sample README.md file for the project:

markdown
Copy code
# Counter Demo Project

This project is a simple Java application that demonstrates various types of counters. The counters include an integer counter, an ASCII counter, a date counter, a sequence counter, and a hexadecimal counter. Each counter has methods to increment, decrement, reset, and display its value.

## Table of Contents

- [Counters](#counters)
    - [IntCounter](#intcounter)
    - [AsciiCounter](#asciicounter)
    - [DateCounter](#datecounter)
    - [SequenceCounter](#sequencecounter)
    - [HexCounter](#hexcounter)
- [How to Run the Project](#how-to-run-the-project)
- [License](#license)

## Counters

### IntCounter

The `IntCounter` is a basic counter that uses integers. It counts up and down using regular numbers (0, 1, 2, ...). This is the simplest type of counter, commonly used for general counting purposes.

**Methods:**
- `increment()`: Increases the value by 1.
- `decrement()`: Decreases the value by 1.
- `reset()`: Resets the value to 0.
- `valueAsString()`: Returns the current value as a string.

### AsciiCounter

The `AsciiCounter` increments through ASCII characters. Each time the counter increments, it moves to the next ASCII character in the sequence (e.g., 'A' to 'B', 'B' to 'C', ...).

**Methods:**
- `increment()`: Moves to the next ASCII character.
- `decrement()`: Moves to the previous ASCII character.
- `reset()`: Resets to the starting character.
- `valueAsString()`: Returns the current character as a string.

### DateCounter

The `DateCounter` is designed to count dates. When incremented, it moves to the next date in the sequence. It's useful for applications where you need to keep track of a sequence of dates.

**Methods:**
- `increment()`: Advances to the next date.
- `decrement()`: Moves to the previous date.
- `reset()`: Resets to the initial date.
- `valueAsString()`: Returns the current date as a string.

### SequenceCounter

The `SequenceCounter` works with a predefined sequence of strings. You initialize it with an array of strings, and it cycles through them. It’s useful when you have a specific set of values you want to iterate through, such as steps in a process or a list of words.

**Methods:**
- `increment()`: Moves to the next item in the sequence.
- `decrement()`: Moves to the previous item in the sequence.
- `reset()`: Resets to the first item in the sequence.
- `valueAsString()`: Returns the current item as a string.

### HexCounter

The `HexCounter` is a counter that counts in hexadecimal (base 16). Instead of just using the digits 0-9, it also uses the letters A-F. This counter is useful in computing, where hexadecimal values are often used to represent binary data more compactly.

**Methods:**
- `increment()`: Increases the value by 1 in hexadecimal.
- `decrement()`: Decreases the value by 1 in hexadecimal.
- `reset()`: Resets the value to 0.
- `valueAsString()`: Returns the current value as a hexadecimal string.

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor and command line

### Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/counter-demo.git
   cd counter-demo
Compile the Code: If you're using the command line, navigate to the directory containing the CounterDemo.java file and run:

bash
Copy code
javac CounterDemo.java
Run the Application:

bash
Copy code
java CounterDemo
Interact with the Program: The application will present you with a menu to choose which counter you want to test. Enter the corresponding number (1-5) and follow the on-screen instructions to see the counter in action.

## License
This project is licensed under the terms outlined in the source code comments. It was developed as part of a course on Object Oriented Techniques by E.J. Dijkstra and R. Smedinga. The code can be used, modified, and distributed for non-commercial purposes, provided that the original copyright notice is retained.


### Summary:

- **Introduction:** Briefly introduces the project and lists the types of counters implemented.
- **Counters Section:** Explains each counter type with its purpose and methods.
- **How to Run:** Provides instructions on setting up the project, compiling the code, and running the application.
- **License:** Mentions the licensing terms as provided in the original source code comments.

You can customize the `README.md` file further based on your specific requirements or add more sections if needed!
