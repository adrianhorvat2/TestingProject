# Automated Web Testing Project

This project is designed to automate the testing of various functionalities on the HGSpot website (https://www.hgspot.hr/). The tests are written using Selenium WebDriver with Java and TestNG for test management and reporting. The project includes multiple test cases covering different aspects of the website, such as cart functionality, login validation, category navigation, search functionality, sorting, and discount validation.

---

## **Project Overview**

### **What is being tested?**
The following functionalities are tested in this project:
1. **Cart Amount Test**: Verifies the ability to add items to the cart and update the quantity.

2. **Login Test**: Validates the login functionality, including email and password input fields, and checks for invalid login attempts.
3. **Category Validation Test**: Ensures that the mouse category navigation works correctly and validates products under specific brands.
4. **Search Bar Test**: Tests the search functionality by searching for a specific product and verifying the results.
5. **Sort By Price Test**: Validates the sorting functionality for processors by price in descending order.
6. **Valid Discount Test**: Checks if the discounted price of a product is lower than its original price.

---

## **Tools and Technologies Used**

| **Tool/Technology**       | **Purpose**                                      |
|---------------------------|-------------------------------------------------|
| **Development Kit**       | Java JDK (Java Development Kit)                 |
| **IDE**                   | IntelliJ Community Edition                      |
| **Browser Automation**    | Selenium WebDriver                              |
| **Browser**               | Chrome (using ChromeDriver)                     |
| **Test Framework**        | TestNG                                          |
| **Build Tool**            | Maven (for dependency management and test execution) |

---

## **Prerequisites**
Before running the tests, ensure the following tools and configurations are set up:
1. **Java JDK**: Install the latest version of Java JDK and set up the environment variables.

2. **IntelliJ IDEA**: Install IntelliJ Community Edition or any preferred IDE.
3. **ChromeDriver**: Download the ChromeDriver executable compatible with your Chrome browser version and place it in the specified path .
4. **Maven**: Install Maven and configure it to manage dependencies and run tests.

---

## **How to Run the Tests**

### **1. Cloning the Repository**  
Before running the tests, you need to clone the Git repository.  

1. Open a terminal or command prompt.  

2. Navigate to the directory where you want to clone the project.  
3. Run the following commands:  
   ```bash
   git clone https://github.com/adrianhorvat2/TestingProject.git
   ```
   ```bash
   cd TestingProject
### **2. Opening the Project in IntelliJ IDEA**

1. Open IntelliJ IDEA.

2. Click on File > Open.
3. Locate and select the TestingProject directory, then click OK.
4. IntelliJ IDEA should automatically detect the Maven project. If not, do the following:
5. Go to File > Invalidate Caches / Restart > Invalidate and Restart.
Wait for IntelliJ to reindex the project.
6. Ensure that all dependencies are loaded by opening the Maven tab (on the right side) and clicking Reload All Maven Projects.

### **3. Running Tests from IntelliJ IDEA**
1. Open the project in IntelliJ IDEA.

2. Navigate to the `testng.xml` file located in the project root directory.
3. Right-click on the file and select **Run**.
4. All the tests will execute parallel, and the results will be displayed in the TestNG tab.

### **4. Running Tests from Command Line**
1. Open a terminal or command prompt.

2. Navigate to the project root directory.
3. Run the following command to execute all tests:
  ```bash
  mvn test
  ```

**Maven Setup (If Not in System Path)**

If Apache Maven is not in the system path, follow these steps:

1. Download the Binary zip archive (e.g., apache-maven-3.8.8-bin.zip) from the official [Maven website](https://maven.apache.org/download.cgi)


2. Extract the downloaded archive locally.

3. Move the extracted directory to a preferred location (e.g.`E:\maven\apache-maven-3.8.8`)

4. Run the tests in terminal using the full Maven path:
```bash
E:\maven\apache-maven-3.8.8\bin\mvn test
```
**Note: Ensure you execute this command inside the project folder.**

## **Test Reports**

When running the tests with Maven, the test results will be generated automatically in an HTML format, providing detailed information on test execution. By default, these reports are saved in the `target/surefire-reports` directory.

1. After running the tests with the following command:
```bash
E:\maven\apache-maven-3.8.8\bin\mvn test
```
2. You can view the generated test reports by navigating to the `target/surefire-reports` folder. Open the **index.html** file in your web browser for a detailed view of the test results.

**Regenerating the Test Reports:**

If you want to regenerate the reports (for example, after making changes to the tests or environment), follow these steps:


```bash
E:\maven\apache-maven-3.8.8\bin\mvn clean test
```
Then run tests again:
```bash
E:\maven\apache-maven-3.8.8\bin\mvn test
```

This will clean the previous reports and generate new ones in the `target/surefire-reports` directory.

**Note: Ensure to execute these commands from within your project folder to properly generate the reports.**