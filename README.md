
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
