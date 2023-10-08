# First Non-Repeating Character in a Character Stream

This is a Java program that efficiently finds the first non-repeating character in a character stream and has a time complexity of O(1) for both `add` and `getFirstNonRepeating` operations.

## How to Use

1. Clone this repository to your local machine.
2. Compile the Java program using your preferred Java development environment or the command line.
3. Run the program using the `Main` class.

### Running the Program

To run the program, execute the following steps:

1. Enter characters one by one. Press Enter after each character.
2. To exit the input loop and find the first non-repeating character, enter `-1`.
3. The program will display the first non-repeating character found in the input stream.

Example:

Enter characters (press -1 to exit):
a
b
a
b
-1
First non-repeating character: b


## Implementation Details

- The program uses a custom `FirstNonRepeatingStream` class to efficiently manage the character stream.
- It utilizes an array to keep track of the characters' status as they are added to the stream.
- The `add` method updates the status of characters according to the specified logic.
- The `getFirstNonRepeating` method returns the first non-repeating character found in the stream.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
