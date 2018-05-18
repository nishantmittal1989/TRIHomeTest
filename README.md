# TRIHomeTest

A Standalone Java Application named TRIHomeTest developed using:  
* Apache Maven
* StringUtils Library for Standard String operations
* JDK 1.8 Library
* Junit 4.11 Library for Unit Test Cases

#### Refer to [Wiki](https://github.com/nishantmittal1989/TRIHomeTest/wiki/) pages for application details.

## How to run the application  
There are two ways to run this application, through the pre-built [jar](https://github.com/nishantmittal1989/TRIHomeTest/tree/master/Deliverables/TRIHomeTest-1.0.1-SNAPSHOT.jar) or by importing the project in your choice of IDE.  

### Pre-requisites
* JRE 1.8
* Maven Version 3.0 or higher  
* File(Data File) on your local drive location. Download the Sample file or have your file and place it in any of the directory structure on your local system. The Sample file is present [here](https://github.com/nishantmittal1989/TRIHomeTest/tree/master/src/main/resources/Toyota.txt)

Note: If you are using your own Data file, please make sure to have the same template/format as that of the Sample Toyota.txt file.

### Through Jar  
1. Download the Jar file [TRIHomeTest-1.0.1-SNAPSHOT.jar](https://github.com/nishantmittal1989/TRIHomeTest/tree/master/Deliverables/TRIHomeTest-1.0.1-SNAPSHOT.jar)
2. Run the jar file using below command:
```
java -jar TRIHomeTest-1.0.1-SNAPSHOT.jar "fileLocation/fileName" "X"
```
* pass fileLocation as the location of the Data file(stored on your local system drive) and fileName as the name of the file as argument to java jar statement.
* pass the valid value of 'X'. 'X' is a number/numeric value

Example: (Run the command on cmd for Windows and on Terminal for Mac OS)
java -jar TRIHomeTest-1.0.1-SNAPSHOT.jar "user/testuser/data/Toyota.txt" "4"

Here fileLocation = user/testuser/data and fileName = Toyota.txt and X = 4
***  

### By Importing in IDE  
Below steps are for Eclipse IDE  
1. Download the project and unzip in local system.
2. Open eclipse.
3. Click File > Import.
4. Type Maven in the search box under Select an import source.
5. Select Existing Maven Projects.
6. Click Next.
7. Click Browse and select the folder that was unzipped in step 1 (contains the pom.xml file)
8. Click Next.
9. Click Finish.  
10. Modify the config.properties file(present in /TRIHomeTest/src/main/resources/) to include the location of the file against the key 'FileLocation' and numeric value against the key 'X'
* The config.properties file should look like this below:
```
FileLocation=/TRIHomeTest/src/main/resources/Toyota.txt
X=3
```

* /TRIHomeTest/src/main/resources/Toyota.txt is the Sample value(location of the file on local system drive) against the key FileLocation. Please don't consider this value as the real file location. Please make sure NOT TO CHANGE THE KEY and to CHANGE ONLY THE VALUE as per the location of the file on your local system. You can also download the Sample file from [here](https://github.com/nishantmittal1989/TRIHomeTest/tree/master/src/main/resources/Toyota.txt)

11. Run Application.java present under com.toyota.main package as Java Application.
12. Results will be printed on Console.
***  

## Future work / ToDo 
- [ ] Scale the soultion to include parallel thread processing to parse huge files    
- [ ] Add more JUnit testing for io and logic packages
- [ ] Build UI to show results