This is a Simple BANKING SERVICE APPLICATION developed based on Spring Boot in two phases.
In the first phase, account and customer CRUD API's were created using DAO and POJO without using any DB or DB Connection.

<img width="1343" alt="Screenshot 2025-01-24 at 7 56 21 PM" src="https://github.com/user-attachments/assets/306049f9-6dae-49bd-940c-8f0fc27d8718" />

Account API's:

1. GET-http://localhost:8090/accounts -- get all the accounts
2. GET-http://localhost:8090/accounts/1 (Here 1 is an example of account number) -- get the details of single account based on accnt no.
3. POST-http://localhost:8090/accounts -- create a new account by passing account no, type and balance as a json object in request body.
4. PUT-http://localhost:8090/accounts/1 (Here 1 is an example of account number) -- update existing account by passing account no, type and balance as a json object in request body.
5. DELETE-http://localhost:8090/accounts/1 (Here 1 is an example of account number) -- delete the account with the specific account number given in the path.

<img width="1348" alt="Screenshot 2025-01-24 at 7 56 36 PM" src="https://github.com/user-attachments/assets/7f36d92d-0a7b-482b-a6d4-4c3537b1515e" />

Customer API's:
1. GET-http://localhost:8090/customers -- get all the customers
2. GET-http://localhost:8090/customers/1 (Here 1 is an example of customer id) -- get the details of single customer based on customerID.
3. POST-http://localhost:8090/customers -- create a new customer by passing customer id, firstname, lastname, customerEmail as a json object in request body.
4. PUT-http://localhost:8090/customers/1 (Here 1 is an example of customer number) -- update existing customer by passing customer id, firstname, lastname, customerEmail as a json object in request body.
5. DELETE-http://localhost:8090/customers/1 (Here 1 is an example of customer number) -- delete the customer with the specific customer id given in the path.
