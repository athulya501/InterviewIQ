# InterviewIQ

InterviewIQ is an enterprise-grade, full-stack Mock Interview SaaS platform. It features an adaptive questioning engine, heuristic scoring algorithms, and comprehensive performance analytics to prepare users for high-tier tech and managerial roles.

## 🚀 Key Features

- **Adaptive Interview Engine**: Questions dynamically scale in difficulty (Easy ➔ Intermediate ➔ Hard) based on your real-time response speed, word count, and skipped question metrics.
- **Skill Heatmap Dashboard**: Analyzes your performance and maps it into a beautiful Chart.js Radar graph, pointing out your exact strengths and weak areas (e.g., OOP, React, System Design, CI/CD).
- **Extensive Question Bank**: Seeded with **225 uniquely structured questions** spanning **15 different tracks** including Java, Frontend, Backend, Python, DevOps, DSA, Cloud, QA, AI/ML, and even HR/Managerial rounds.
- **Simulation Mode & Anti-Cheat**: Enforces a strict full-screen environment. Tab-switching triggers immediate visibility warnings to simulate a high-pressure interview scenario.
- **Global Leaderboard**: Compete against other users globally. Your heuristic confidence score determines your rank!
- **JWT Authentication**: Secure login and registration flows backed by lightweight JSON Web Tokens (JJWT).

## 🛠️ Tech Stack

- **Backend**: Java 17, Spring Boot 3.x, Spring Data JPA
- **Database**: SQLite (Highly portable, file-based database)
- **Security**: Custom JWT Web Filter Implementation
- **Frontend**: Vanilla HTML5, CSS3, JavaScript (ES6+), Chart.js
- **Architecture**: Layered MVC (Controller ➔ Service ➔ Repository) with DTO mapping

## ⚙️ Running Locally

1. **Prerequisites**: Ensure you have Java 17+ installed on your system.
2. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/interviewiq.git
   cd interviewiq
   ```
3. **Run the Application** (Maven wrapper is included):
   ```bash
   # On Windows
   .\mvnw.cmd clean spring-boot:run

   # On macOS/Linux
   ./mvnw clean spring-boot:run
   ```
4. **Access the Application**: Open your browser and navigate to:
   ```
   http://localhost:8080
   ```
   *(Note: The database is automatically seeded with all 225 questions on the first startup.)*

## 🎨 UI/UX Highlights
- **Corporate Enterprise Design**: Clean spacing, micro-animations, and modern variable-driven CSS.
- **Dark Mode**: Instantly toggleable dark mode for late-night practice sessions.
- **Responsive Layout**: Works seamlessly across desktops, tablets, and modern browsers.

## 🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

## 📝 License
This project is open-source and available under the [MIT License](LICENSE).
