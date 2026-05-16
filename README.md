# InterviewIQ

InterviewIQ is an enterprise-grade, full-stack Mock Interview SaaS platform designed to simulate real-world technical and managerial interview environments. It features an adaptive questioning engine, heuristic scoring system, and performance analytics dashboard to help users systematically improve their interview readiness.

---

## 🌐 Live Demo

- **Live Application**: https://interviewiq-production-9a46.up.railway.app

> The application is fully functional and includes authentication, adaptive interview flow, scoring system, and analytics dashboard.

## 🚀 Key Features

### 🧠 Adaptive Interview Engine
Questions dynamically adjust in difficulty (Easy ➜ Intermediate ➜ Hard) based on user performance signals such as response time, word count, and skipped questions.

### 📊 Skill Heatmap Dashboard
Visual performance analytics using Chart.js Radar Graph, highlighting strengths and weaknesses across domains like:
- Data Structures & Algorithms
- Object-Oriented Programming
- System Design
- Frontend & Backend Development
- DevOps & Cloud Concepts

### 📚 Extensive Question Bank
- 225+ structured questions
- 15+ categories including Java, Python, React, Backend, DevOps, AI/ML, QA, HR, and Managerial rounds
- Pre-seeded database for instant usage

### 🎯 Simulation Mode
Realistic interview environment with strict full-screen enforcement. Tab switching detection adds pressure simulation similar to real interview scenarios.

### 🏆 Global Leaderboard
Users are ranked based on a heuristic confidence scoring algorithm, enabling competitive benchmarking.

### 🔐 Secure Authentication
JWT-based authentication system ensuring secure login, session handling, and protected routes.

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot 3.x
- Spring Data JPA

### Database
- SQLite (lightweight, file-based, portable)

### Security
- JWT (JSON Web Token)
- Custom authentication filter

### Frontend
- HTML5
- CSS3
- JavaScript (ES6+)
- Chart.js (for analytics visualization)

### Architecture
- Layered MVC Architecture  
  Controller ➜ Service ➜ Repository ➜ Database  
- DTO-based data transfer design

---

## ⚙️ Running Locally

### Prerequisites
- Java 17 or higher installed
- Maven installed (or use included Maven wrapper)

