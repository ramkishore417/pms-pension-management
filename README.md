# Pension Management System | Pension Management Portal
The Pension Management System allows members to login and access the Pensioner detail module. The ProcessPension microservice calculates the pension amount based on Aadhaar and salary data, then returns the pension detail to the UI. The system stores pensioner detail, pension amount, and bank transaction data in a database.

## Functional Requirements
The Pension Management System is a web-based solution that enables users to manage their pension plans. The ProcessPension microservice is a crucial component of the system and is responsible for processing pension details based on the member's Aadhar number. The member can log in to the portal and provide the pensioner detail, which is then validated by the microservice. If the pensioner detail is accurate, the pension amount is calculated and displayed on the UI. The processed pension detail is then stored in the database.

------------
### REQ_04 Pension Management 
A Web Portal that allows a member to Login and allows to do following operations: 
- Login 
- Load the pensioner detail through the Pensioner detail module 
- Post validation of the pensioner detail, pension amount should be displayed on the UI. This happens on invocation of ProcessPension module 
- Store the pensioner detail, pension amount and the bank transaction detail in database

------------


### Client Portal Requirements

- Pension Management Portal must allow a member to Login. Once successfully logged in, the member do the following operations:
- Provide the pensioner detail
- Invoke the ProcessPension microservice to get the pension detail
- UI should receive validation message if the pensioner detail provided as input has
- invalid data
- Display the processed pension detail on the UI
- The pensioner and pension detail should be saved to the database
- Each of the above operations should reach out to the middleware Microservices that are
- hosted in cloud.



