## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

This is a Java program that calculates the grade of a student based on their average marks obtained in multiple subjects. Here is a description of the code:

🔶Grade class: This class represents a student's grade based on their average marks. It has a private field studentName to store the name of the student. The constructor of this class takes the student's name as a parameter and initializes the studentName field. The grade method takes the average marks as a parameter and returns the corresponding grade as a string. The getStudentName method returns the name of the student.

🔶Main class: This class contains the main method, which is the entry point of the program. It prompts the user to enter the student's name and the number of subjects. It then calculates the total marks obtained by the student by prompting the user to enter the marks obtained in each subject. The program calculates the average marks by dividing the total marks by the number of subjects. It then creates an object of the Grade class and passes the student's name to its constructor. The program then calls the grade method of the Grade object to get the corresponding grade. Finally, the program displays the student's name, total marks obtained, average marks, and the corresponding grade.

🔶The program uses the Scanner class to read input from the user. It uses the switch statement to map the average marks to the corresponding grade. The String.format method is used to format the average marks to two decimal places. The % symbol is used to represent the percentage symbol in the output. The close method of the Scanner class is called to release any system resources associated with the scanner.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
