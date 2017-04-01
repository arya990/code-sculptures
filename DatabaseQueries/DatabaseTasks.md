

## **EMPLOYEE DATABASE:** ##  
  
### **March 22nd:** ###  
  
#### **1) Write a query to get a list of employee who have a one part name?** ####

```mysql
	SELECT * 
	FROM (SELECT SUBSTRING_INDEX(Name,' ',1) AS fName,
	SUBSTRING_INDEX(SUBSTRING_INDEX(Name,' ',2),' ',-1) AS mName,
	SUBSTRING_INDEX(Name,' ',-1) AS lName FROM tblemployees) as Name_Ram
	WHERE (mName=' ' AND lName=' ');
```

#### **2) Write a query to get a list of employee who have a three part name?** ####  

```mysql
	SELECT Name 
	FROM tblemployees
	WHERE Name regexp '^[^ ]+[ ]+[^ ]+[ ]+[^ ]+$';
```

#### **3) Write a query to get a list of employee who have a first, middle or last name as Ram and not anything else?** ####  
 
	By Creating a Seperate Table:  
  
```mysql
	CREATE TABLE NAMES
	SELECT SUBSTRING_INDEX(Name,' ',1) AS fName,
	SUBSTRING_INDEX(SUBSTRING_INDEX(Name,' ',2),' ',-1) AS mName,
	SUBSTRING_INDEX(NAME,' ',-1) AS lName FROM tblemployees;

	SELECT * FROM Names
	WHERE (fName='RAM' OR mName='RAM' OR lName='RAM');
```
  
	Without Creating a Seperate Table:  
  
```mysql
	SELECT * 
	FROM (SELECT SUBSTRING_INDEX(Name,' ',1) AS fName,
	SUBSTRING_INDEX(SUBSTRING_INDEX(Name,' ',-1) AS mName,
	SUBSTRING_INDEX(Name,' ',-1 AS lName FROM tblemployees) AS Name_Ram
	WHERE (fName='RAM' OR mName='RAM' OR lName='RAM');
```

#### **4) Write a query to get all employees where reminder of EmployeeNumber by 10 is a power of 2?** ####  
 
```mysql
	SELECT Name,EmployeeNumber 
	FROM tblemployees 
	WHERE mod(EmployeeNumber,10)=1 OR 
	mod(EmployeeNumber,10)=2 OR 
	mod(EmployeeNumber,10)=4 OR
	mod(EmployeeNumber,10)=8;
```
  
#### **5) Write a query which gives employee types in the organisation?** ####  
  
	solution 1:  
  
```mysql
	SELECT Name,Description
	FROM tblemployees as t1, tblservicetypes as t2
	WHERE t1.ServiceType=t2.ServiceType;
```
  
	solution 2:  
  
```mysql
	SELECT t1.Name,t2.Description 
	FROM tblemployees as t1 JOIN tblservicetypes as t2 ON t1.ServiceType=t2.ServiceType;
```
  
#### **6) Write a query to get all employees sorted by ServiceType and Name within a given Centre?** ####  
  
	Prints Sorted Format Ordered by Name and ServiceType:  
  
```mysql
	SELECT Name,Description,CentreName
	FROM ((tblemployees as t1 JOIN tblservicetypes as t2 USING(ServiceType) 
	JOIN tblcentremaster AS t3 USING(CentreCode))
	ORDER BY Description,Name;
```
  
	Prints Any Value on Group by CentreName:  
  
```mysql
	SELECT ANY_VALUE(Name),ANY_VALUE(Description),CentreName 
	FROM ((tblemployees AS t1 JOIN tblservicetypes AS t2 USING(ServiceType)) 
	JOIN tblcentremaster AS t3 USING(CentreCode)) GROUP BY CentreName;
```  
	
### **March 23rd:** ###  
  
#### **7) Write a query to find the all the Names which contain the word or a part of a word Suresh, sort the result in the order of similarity?** ####  
  
```mysql
	SELECT Name FROM tblemployees WHERE (Name LIKE '%suresh%') 
	UNION
	SELECT Name FROM tblemployees WHERE (Name LIKE '%sures%') 
	UNION 
	SELECT Name FROM tblemployees WHERE (Name LIKE '%sure%') 
	UNION 
	SELECT Name FROM tblemployees WHERE  (Name LIKE '%sur%') 
	UNION 
	SELECT Name FROM tblemployees WHERE (Name LIKE '%su%') 
	UNION 
	SELECT Name FROM tblemployees WHERE (Name LIKE  '%s%');
```
  
#### **8) Display all Names from tblEmployees by appending it with INDIAN at the end if the name starts from A-M, for names starting from N-Z append AMERICAN at the end?** ####
  
```mysql
	SELECT CONCAT (Name,'INDIAN') FROM tblemployees WHERE Name BETWEEN 'a%' and 'm%' 
	UNION
	SELECT CONCAT(Name,'AMERICAN') FROM tblemployees WHERE Name BETWEEN 'n%' and 'z%';
```
  
	OR  
  
```mysql
	SELECT CONCAT(Name,'INDIAN') FROM tblemployees WHERE Name REGEXP '^[A-M]' 
	UNION 
	SELECT CONCAT(Name,'AMERICAN') FROM tblemployees WHERE Name REGEXP '^[N-Z]';
```
  
#### **9) Write a query to find the Name(s) having the largest number of characters in it?** ####  
  
```mysql 
	SELECT Name,CHAR_LENGTH(Name) 
	FROM tblemployees 
	WHERE CHAR_LENGTH(Name) = (SELECT  MAX(CHAR_LENGTH(Name)) FROM tblemployees);
```
  
#### **10) Write a query to list all the employees whose name starts and ends with same character?** ####
  
```mysql
	SELECT Name 
	FROM tblemployees 
	WHERE LEFT(Name,1)=RIGHT(Name,1);
```
  
	OR  
  
```mysql
	SELECT Name 
	FROM tblemployees 
	WHERE SUBSTRING(Name,1,1)=SUBSTRING(Name,-1,1);
```
  
#### **11) Write a query to list all employees whose first and second character in their names are similar?** ####  
  
```mysql
	SELECT Name 
	FROM tblemployees 
	WHERE LEFT(Name,1)=SUBSTRING(Name,2,1);
```
  
#### **12) Write a query to get Max salary and Min salary of all the employees?** ####  
  
```mysql
	SELECT MAX(GrossPay), MIN(GrossPay) 
	FROM tblpayemployees;
```
  
### **March 24th:** ###  
  
#### **13) Write a Query to List out all Employees where the present basic is perfectly rounded of to 100. Ex: If Basic of A is 2011, Basic of B is 2100 , Basic of C is 2101 and Basic of D is 2200 . Then Only B and D should be displayed?** ####  
  
```mysql
	SELECT Name,PresentBasic 
	FROM tblemployees 
	WHERE MOD(PresentBasic,100)=0 and PresentBasic != 0.00;
```
  
#### **14) Write a query to find out employees whose names have Leading or Trailing spaces?** ####  
  
```mysql
	 SELECT Name 
	 FROM tblemployees 
	 WHERE ((SUBSTRING(Name,1,1)=' ') AND (SUBSTRING(Name,-1,1)=' '));
```
  
#### **15) Write a update query to remove trailing spaces from the employee names. Ex: If the employee name is Naseeruddin Shah	, then after running the update query the name should be Naseeruddin Shah.(without any spaces at the end)?** ####  
  
```mysql
	UPDATE tblemployees 
	SET Name = LTRIM(RTRIM(Name));
```
  
#### **16) Write a similar update query to remove the leading spaces from the employee names?** ####  
  
```mysql
	UPDATE tblemployees 
	SET Name = LTRIM(RTRIM(Name));
```

#### **17) Write a query to find list of employees and payments where the employee is paid VDA but not PF?** ####  
  
```mysql
	SELECT DISTINCT(t1.EmployeeNumber),t1.ParamCode 
	FROM tblpayemployeeparamdetails AS t1 LEFT JOIN tblpayemployeeparamdetails AS t2 ON 
	t1.EmployeeNumber=t2.EmployeeNumber AND t2.ParamCode='pf' 
	WHERE t1.ParamCode='vda' and t2.EmployeeNumber is null;
```
  
#### **18) Write a query to find list of employees and payments where the employee is paid VDA and PF?** ####  
  
```mysql
	SELECT DISTINCT(t1.EmployeeNumber) 
	FROM tblpayemployeeparamdetails AS t1 LEFT JOIN tblpayemployeeparamdetails AS t2 ON 
	t1.EmployeeNumber=t2.EmployeeNumber AND t2.ParamCode='pf' 
	WHERE t1.ParamCode='vda';
```
  
#### **19) Write a query to list all the employees whose name starts and ends with same character (case-sensitive)?** ####  
  
```mysql
	SELECT Name 
	FROM tblemployees 
	WHERE LOWER(SUBSTRING(Name,1,1))=LOWER(SUBSTRING(Name,-1,1));
```
  
	OR  
  
```mysql
	SELECT Name 
	FROM tblemployees 
	WHERE LOWER(LEFT(Name,1))=LOWER(RIGHT(Name,1));
```
  
### **March 29th:** ###  

#### **20) Write a query which returns Name, FatherName, DOB of employees whose PresentBasic is?** ####  
#### **a)Greater than 30000?** ####  
  
```mysql
	SELECT Name,FatherName,DOB 
	FROM tblemployees 
	WHERE PresentBasic > '3000';
```
  
#### **b) Less than 3000?** ####  
  
```mysql
	SELECT Name,FatherName,DOB 
	FROM tblemployees 
	WHERE PresentBasic < '3000';
```

#### **c) Between 3000 and 5000?** ####  
  	
```mysql
	SELECT Name,FatherName,DOB 
	FROM tblemployees 
	WHERE (PresentBasic >'3000' AND PresentBasic < '5000');
```
  
#### **21) Write a query which returns All the details of employees whose Name ?** ####  
#### **a) Ends with 'KHAN'?** ####  

```mysql
	SELECT * 
	FROM tblemployees 
	WHERE SUBSTRING_INDEX(Name,' ',-1)='KHAN';
```
  
#### **b) Starts with 'CHANDRA'?** ####  
	  
```mysql
	SELECT * 
	FROM tblemployees 
	WHERE SUBSTRING(Name,1,7)='CHANDRA';
```
    
	OR  
  
```mysql
	SELECT * 
	FROM tblemployees 
	WHERE Name LIKE 'chandra%';
```
  
#### **c) Is 'RAMESH' and their initial will be in the range of alphabets a-t?** ####  
  	
```mysql
	SELECT * 
	FROM tblemployees 
	WHERE Name REGEXP '^[a-t]+[.]' AND Name LIKE '%Ramesh%';
```

#### **22) Select all the centers where max Length of the employee name is twice the min length of the employee name?** ####  
  	
```mysql
	SELECT Name,CHAR_LENGTH(Name), CentreName 
	FROM tblemployees AS t1 JOIN tblcentremaster AS t2 USING(CentreCode)
	WHERE CHAR_LENGTH(Name) = 2*(SELECT MIN(CHAR_LENGTH(Name)) FROM tblemployees);
```
  
#### **23) Write a query to find out all the departments where no employee has the Present Basic rounded of to 100?** ####  
  	
```mysql
	SELECT Name, PresentBasic,DepartmentCode 
	FROM tblemployees 
	WHERE MOD(PresentBasic,100)!=0;
```
  
#### **24) Write a query to find out all the departments where all employee have their Present Basic rounded of to 100?** ####  
  
```mysql
	SELECT DISTINCT(DepartmentCode),PresentBasic 
	FROM tblemployees 
	WHERE MOD(PresentBasic,100)=0;
```
  
#### **25) Write a Query to find a list of employees and Payments where the employee is Paid VDA , NHF and LWW but not PF (Employee Number , From Date, to Date, Name , Designation Description, Service Type Description and ServiceStatus Description for the time period, VDA amount ,NHF amount, LWW amount)?** ####  
  	
```mysql

```
  
#### **26)Write a query to list top n employees from tblEmployees table based on present basic. Use rank functions (n can take any positive value like 1,2,3, so on...)?** ####  
  
```mysql

```



