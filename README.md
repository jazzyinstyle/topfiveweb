topfiveweb - Status of Assignment
=================================

Technologies used:
- Java with Spring framework.
- Tomcat6 Web Server
- Maven Build Automation Tool

Compiled WAR file name: TopFiveWebApp.war

Steps to access/Brief description of the Web Application:
> Deploy the WAR file to Tomcat6 web server.
> Start tomcat web service.
> Access the Application using the path - http://localhost:8080/topfiveweb/topfivewebvisit
> The Application will attempt to re-populate the MySQL database table (topfivewebdb.TOPFIVEWEB) with all the Data found in the data.csv.
> The Application will then display a list of Top 5 websites ranking based on ALL the websites found in the MySQL database table (topfivewebdb.TOPFIVEWEB).


You are given a data (data.csv file) that consists of total visits for each websites based on a weekly dates. 
Your assignment is to create a web application to render 'Top 5 Websites Rankings' report where:
(1) The report should clearly shows the top 5 websites based on the selected date.
> The Report will generate the (distinct) Top 5 websites based on All the records in the CSV.
> No date selection functionality is available (due to time-constraint)

(2) User should be able to change the date and the report will be updated based on the selected date.
> No date selection functionality is available (due to time-constraint)


Improvements for add-on:

> Integrate current JSP implementation with HTML/CSS and AngularJS

> Complete Date selection search implementation

> Implement script to deploy and setup MySQL DB with required tables for ease of deployment

> Deploy web application over to the Cloud using applications like Heroku or AWS.

> Replace the current MySQL with NoSQL DB app (e.g. MongoDB) for scalability and performance when managing Big Data.



