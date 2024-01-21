# This is present the evidence and steps to reporduce the lazy loading effect in iterables (by default, fetch type is Lazy):
**1. Steps to reproduce the Lazy Loading effect:**
a. As in our case, we have CategoryEntity that represents category of a product. It has list of products which are "mappedBy" product's categoryId column.
b. Provide fetchType.LAZY in @OneToMany annotation, next to mappedBy value. And then, gear up to see the fetching strategy followed by Spring JPA for iterables (or any other field , annotated with Lazy fetch type).
c. Run Spring Application in Debug mode, with breakpoint set at Controller's getByID method. (as we need to start watching the flow of program from the point execution hits Controller's method)
d. Step Over to go to Service Class, observe the below Snapshot to see "PersistentBag" class object - being a PROXY object mapped to List<Product> listOfProducts field.

**2. Evidences to Observe the PROXY OBJECT**
![image](https://github.com/abhayjohri23/Scaler_Assignment_JPA/assets/124622368/aa16fdf7-7e12-4e4f-ac19-7487b59ee38b)
