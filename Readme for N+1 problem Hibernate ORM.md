# How to reproduce:
1. Currently, my dataset for product and category entity has multiple records in it (as shown below). Both are related to each other using One to Many relation, and have both mappedBy and JoinColumn fields enabled.
2. Fetch mode for the Category entity is Lazy, whereas other tables and their attributes are as it is.

![image](https://github.com/abhayjohri23/Scaler_Assignment_JPA/assets/124622368/00ed04bf-9147-43f1-afa1-9cd965fbd159)

![image](https://github.com/abhayjohri23/Scaler_Assignment_JPA/assets/124622368/543eb10e-4aea-41d0-a0db-7118e52fde0d)

3. Let's say we want to fetch all products from Product_Entity table. Starting from the controller, we would want to call http://localhost:8080/products/all URL (via Postman) which will invoke repository finally.
4. On doing so, below queries were generated in the hibernate logs.

Postman input screen
![image](https://github.com/abhayjohri23/Scaler_Assignment_JPA/assets/124622368/a4430846-e9cc-4a34-9a54-ffabe6ca8e5e)

Postman Output screen
![image](https://github.com/abhayjohri23/Scaler_Assignment_JPA/assets/124622368/4beb0155-c5ad-46ee-8fea-6936dfae468f)

Hibernate logs:
![image](https://github.com/abhayjohri23/Scaler_Assignment_JPA/assets/124622368/de938d97-99fd-45ce-9a93-a8bed75d788f)

**Resource to understand (Stackoverflow Community)**: https://stackoverflow.com/questions/97197/what-is-the-n1-selects-problem-in-orm-object-relational-mapping

5. The above scenario is of N+1 problem of ORMs or data access frameworks, wherein we may want to have data in 1-2 calls, but the total calls take N (n entities in category table) + 1 (main query call for products).
6. One of the ways to optimise it by Fetch Mode = SUBSELECT and JOINS inplace of SELECT. Otherwise, we can also create custom (and mroe optimised) queries.
