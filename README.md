# Project_NetworkManagementSystem

**Steps to execute application**

POST /api/devices: Creates a new device.

PUT /api/devices/{id}: Updates an existing device by ID.

DELETE /api/devices/{id}: Deletes a device by ID.

GET /api/devices: Retrieves a list of devices.

GET /api/count: Retrieves the count of devices.

GET /api/brand-distribution: Retrieves device distribution by brand.

Get Method

![image](https://github.com/vijaySadhuram/Project_NetworkManagementSystem/assets/98251620/ffb5510a-3c7b-4ba1-a1ac-81f0f258a4f4)


Post Method

![image](https://github.com/vijaySadhuram/Project_NetworkManagementSystem/assets/98251620/bc99fa3f-1136-453b-a9c5-58fa302d5194)


Put Method

![image](https://github.com/vijaySadhuram/Project_NetworkManagementSystem/assets/98251620/9d5937c9-3f1c-4117-b643-f2c5d5410345)


Get Method For get the list of devices

![image](https://github.com/vijaySadhuram/Project_NetworkManagementSystem/assets/98251620/6104954d-0d31-425f-97b3-996352055264)


Get Method for get count of devices

![image](https://github.com/vijaySadhuram/Project_NetworkManagementSystem/assets/98251620/5aa7dc0f-bbf6-4a08-8d2d-6292fc914afa)


**Database Configuration for emp DB  for Tables Name is device**

#database configuration for emp DB

spring.datasource.url=jdbc:mysql://localhost:3306/emp
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialecy=org.hibernate.dialect.MySQL8Dialect





