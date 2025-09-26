

# Hibernate Demo Programs

This project demonstrates the usage of **Hibernate ORM** with Java for basic CRUD operations and relationship mappings. It includes examples of HQL queries, and different entity relationships like One-to-One, One-to-Many, and Many-to-Many.

---

## 📁 Project Structure


---

## 📝 Features

1. **HQL Queries**
   - Insert, fetch, update, and delete records using Hibernate Query Language.
   
2. **Entity Mappings**
   - Demonstrates `studentRecord` entity mapping.
   
3. **Relationship Mapping**
   - One-to-One, One-to-Many, and Many-to-Many relationship examples.

4. **Hibernate Configuration**
   - Configuration via `hibernate.cfg.xml` for MySQL database connection.

---

## ⚙️ Setup & Run

1. Clone the project.
2. Add required **Hibernate** and **MySQL** dependencies in your project.
3. Update `hibernate.cfg.xml` with your database credentials.
4. Run the Java classes inside `hibernate_query_language` or `mapping` folder to see CRUD and relationship operations in action.

---

## 🔗 Dependencies

- Hibernate ORM 5.x+
- MySQL Connector/J
- Lombok (optional, for getter/setter/constructor annotations)
- JDK 1.8+  

---

## 💡 Notes

- Make sure your database is running and tables are created before running the CRUD operations.
- Transactions are required for `insert`, `update`, and `delete` operations.
- `mapping` folder demonstrates advanced Hibernate relationships.

---

