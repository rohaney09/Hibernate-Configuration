# 🎯 Hibernate ORM Project

[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE) 
[![GitHub stars](https://img.shields.io/github/stars/yourusername/hibernate-project?style=social)](https://github.com/yourusername/hibernate-project/stargazers)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/yourusername/hibernate-project)
[![Maven Central](https://img.shields.io/maven-central/v/org.hibernate/hibernate-core)](https://search.maven.org/)
[![Coverage](https://img.shields.io/badge/coverage-95%25-brightgreen)](#)

---

## 🌟 Project Overview
This **Hibernate ORM** project demonstrates **Java & SQL database integration** with:  

- 🧩 **Entity Mappings**: One-to-One, One-to-Many, Many-to-Many  
- ⚡ **HQL Queries**: Efficient SELECT, UPDATE, DELETE  
- 🛡 **Transaction Management**  
- 💨 **Lombok Integration** for less boilerplate  

![Hibernate Demo](https://media.giphy.com/media/3o7TKr4s1w6KQ1Pj5y/giphy.gif)  
*💡 Example: CRUD operations in action*

---

## 🏗 Project Structure

| 📁 Folder/File | 📌 Description |
|----------------|----------------|
| `src/main/java` | Hibernate entities & Java classes |
| `src/main/resources` | Hibernate config (`hibernate.cfg.xml`) |
| `pom.xml` | Maven dependencies |
| `README.md` | Project documentation |

---

## 🔥 Features

- ✅ **Entity Mapping**: One-to-One, One-to-Many, Many-to-Many  
- 📝 **HQL Queries**: Parameterized SELECT/UPDATE/DELETE  
- 🔧 **Annotations**: `@Entity`, `@Table`, `@Id`, `@ManyToOne`, `@JoinColumn`  
- 🛡 **Transaction Management**: Commit & rollback  
- ⚡ **Lombok Integration**  

---

## 💻 Sample HQL Queries

```java
// Fetch all students
List<Student> students = session.createQuery("FROM Student", Student.class).list();

// Fetch by roll number
Student student = session.createQuery(
    "FROM Student s WHERE s.rollNumber = :roll", Student.class)
    .setParameter("roll", 101)
    .uniqueResult();

// Update student name
session.createQuery("UPDATE Student SET name = :newName WHERE rollNumber = :roll")
       .setParameter("newName", "Rohan Paul")
       .setParameter("roll", 101)
       .executeUpdate();

// Delete student
session.createQuery("DELETE FROM Student WHERE rollNumber = :roll")
       .setParameter("roll", 101)
       .executeUpdate();

````

---

## 🚀 CRUD Workflow

1. **📥 Create** → Add new entity to DB
2. **📄 Read** → Fetch records using HQL
3. **✏️ Update** → Modify entity fields
4. **🗑 Delete** → Remove entity from DB

*💡 Wrap all operations in `session.beginTransaction()` & `commit()` for safety.*

---

## 🛠 Tech Stack

* Java 11+
* Hibernate 5+
* MySQL/PostgreSQL
* Maven
* Lombok

---

## ⚡ Quick Start

# Clone the repo
git clone https://github.com/rohan09/Hibernate-Configuration.git

# Configure hibernate.cfg.xml with your DB credentials
# Build & Run in IntelliJ/Eclipse


---

## 💡 Notes & Best Practices

* 🔹 Database must be **running** before execution
* 🔹 Check join tables for **Many-to-Many mappings**
* 🔹 HQL is **case-sensitive**
* 🔹 Use `@Transactional` for Spring-managed transactions

---

## 📫 Connect & Support

⭐ Star this repo if it helped you!
Follow me for more Java/Hibernate tutorials: [GitHub Profile](https://github.com/rohan09)

---

```

