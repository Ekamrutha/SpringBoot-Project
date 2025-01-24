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

In the second phase, used H2 (In memory) DB for data storage.
The enhancement made in the second phase is that, the customers data is linked with their accounts, in more simpler words, the customer and account tables are joined based on customer id.

<img width="1343" alt="Screenshot 2025-01-24 at 9 50 20 PM" src="https://github.com/user-attachments/assets/700555f3-bc11-40f6-99b8-1515108d8ae7" />


The services available in this phase 2 BANKING SERVICE APPLICATION are as follows:

1. GET-http://localhost:8090/accounts -- get all the accounts
2. GET-http://localhost:8090/accounts/1 (Here 1 is an example of account number) -- get the details of single account based on accnt no.
3. POST-http://localhost:8090/customers -- create a new customer by passing customer id, firstname, lastname, customerEmail, accounts list as a json object in request body.
4. POST-http://localhost:8090/customers/10/accounts (Here 10 is an example of customer id) -- add account details i.e acctno, acnttype, bal (by passing as a json object in request body) for customer whose id is 10.
5. PUT-http://localhost:8090/customers/10 -- update customer information with id 10 (by passing customer id, first name, last name, email and accnt list as a json object in request body).
6. GET-http://localhost:8090/customers/10/accounts -- Get customer and his/her linked account info for customer id 10.
7. GET-http://localhost:8090/customers/accounts -- Get data of all the customers along with the details of accounts linked to them.
8. PUT-http://localhost:8090/accounts/FundTransfer -- (fund transfer from one acc to another) updating the balance based on given details i.e request body json obj inclueds, fromaccno, toaccntno and amt. accordingly the balance gets updated in the customer accounts.
