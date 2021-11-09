
## About The Project
This is a java console application that analyzes the work schedule of your employees to determine the emloyees that have been at the office in the same time frame and how many times.

## Built With
  * [Java 1.8](https://www.java.com/es/download/ie_manual.jsp)
  * [JUnit 5](https://junit.org/junit5/)

## Getting Started

### Prerequisites
To execute the project you need to have both Java 1.8 and JUnit installed in your local machine, the link to both of these tools are in the previous section.

### Installation
To clone the project you need to use the command
`git clone <repo url>`. There is no need for adicional packages or modules.

## Usage
When executing the project a message will appear in the console asking for the path to the schedule file. This file must be in txt format and follow the specified sintax:
* Each line will represent an employee.
* Each line will begin with the name of the employee, followed by the days the employee was at the office.
* Each day will be separated by a coma and will have the next format: <First two letters of Day><Start_hour>-<End_hour> without any spaces.
* The name and the days will be separated by an equals(=) sign. 
* The hour consists of hour and minutes in the format hh:mm,
  
An example can be seen in the next image:
  
  ![image](https://user-images.githubusercontent.com/33677423/140981715-efd20948-1a7e-4161-ae55-5fee4b322d70.png)


In the console you must write the path to the file like in th picture:
  
  ![image](https://user-images.githubusercontent.com/33677423/140981825-9960e57e-6b5e-4220-9f7d-c7154037246e.png)

The output should be a table with the first column being the pair of employees that overlapped and the second column being the amount of times.
  
  ![image](https://user-images.githubusercontent.com/33677423/140981990-c437f896-ccd0-48eb-b1e8-d5e5fb5f5b06.png)

## Tests
 Inside the project there are two example files that can be use to test the application:
 * Schedule.txt: inside the Main package
 * Example2.txt: inside the Tests package
 
 The automatic testing is executed using the JUnit library. The script that contains all the tests is called EmployeeOverlap.java and is inside the Tests Package.
 It checks these aspects of the result:
 * The amount of employees from the file.
 * The amount of employee pairs from the overlap.
 * The counter of times the employee pairs where in the same time frame.
 
 These tests use both of the file that were previously mentioned.
 
## Strategy

 My approach was to first analyze the data that the example files contained to find out two things: the different types of data that I would have to work with and if I could group them into entities or objects. This way I conluded that I could work with two objects: Schedule and Employee. The schedule consists of the name of the day, the start hour and end hour. The Employee consists of a name and a collection of related Schedules. The clases for these objects can be found in the Entities package.
 
 The next thing to do was to divide the flow of the project into steps:
 * First: recieve the input of the user in the console
 * Second: open and read the file line by line. The result should be a list of employees.
 * Third: use the text line to create the Employee and the Schedule. 
 * Fourth: from the list of employees, compare everyone to get the table.
 * Fifth: print the table to the console.
 
 Then I organized the logic in scripts following an MVC arquitecture. The main script works as the interface/view managing the console, receiving the input from the user and presenting the messages. The script called EmployeeFile works as the controller having all the business logic of reading the file, creating the objects and making the comparisons between employees. Finally, the models would be the clases inside the Entities package that describe the Employee and Schedule.
 
 
