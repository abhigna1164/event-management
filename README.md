# 🏢 Office Event Management System – Backend (Spring Boot)

This project is a backend-only Office Event Management System built using Java, Spring Boot, and JPA (Hibernate).

It is designed for learning and demonstration purposes, focusing on:
- Clean REST API design
- Proper JPA entity relationships
- Business logic beyond basic CRUD
- Team-based backend development

✅ Only working backend APIs

---

--> 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- Maven
- H2 / MySQL (configurable)
- Bruno (API testing)

---

--> 📌 Project Overview

The system manages office events and allows employees to:
- View events
- Register for events
- Attend events
- Submit feedback after attending

Admins (logical, not role-based):
- Create and manage events
- View registrations
- View feedback and ratings

---

--> 🧱 Core Entities

--># 1. Employee
- id
- name
- email (unique)
- department

--># 2. Event
- id
- title
- description
- eventDate
- startTime
- endTime
- maxParticipants
- status (PLANNED, CANCELLED, COMPLETED)

--># 3. Registration
- id
- employee
- event
- registeredOn
- status (REGISTERED, CANCELLED, ATTENDED)

--># 4. Feedback
- id
- employee
- event
- rating (1–5)
- comments

---

--> 🔗 Entity Relationships
- Employee → Registration ← Event
- Employee → Feedback ← Event

All events are assumed to happen inside the office, so no venue entity is used.

---

--> 🌐 API Modules

--># Employee APIs
- Create employee
- Get all employees
- Get employee by ID
- Get employee event history

--># Event APIs
- Create event
- Update event
- Cancel event
- Get upcoming events
- Get past events
- Get event participants
- Get event statistics

--># Registration APIs
- Register employee for event
- Prevent duplicate registration
- Enforce event capacity
- Cancel registration
- Mark attendance

--># Feedback APIs
- Submit feedback (only if attended)
- Prevent duplicate feedback
- Get feedback for an event
- Get average rating of an event

---

--> ⚙️ Business Rules Implemented

- An employee cannot register twice for the same event
- Event capacity cannot be exceeded
- Only employees who attended an event can submit feedback
- An employee can submit feedback only once per event
- Average rating is calculated dynamically

---

--> 🧪 API Testing

All APIs are tested using Bruno.

Test flows include:
1. Create employee
2. Create event
3. Register employee
4. Mark attendance
5. Submit feedback
6. Fetch average rating
7. Validate failure cases (duplicate registration / feedback)

---

--> ▶️ How to Run the Project

--># Using IDE (VS Code / IntelliJ)
1. Clone the repository
2. Open the project folder
3. Let Maven download dependencies
4. Run `OfficeEventManagementApplication`

--># Using Terminal
```bash
mvn spring-boot:run


