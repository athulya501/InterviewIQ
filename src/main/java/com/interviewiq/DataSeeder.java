package com.interviewiq;

import com.interviewiq.models.Question;
import com.interviewiq.repositories.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(QuestionRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                List<Question> sq = new ArrayList<>();

                // ==========================================
                // TECH ROLES
                // ==========================================

                // 1. JAVA DEVELOPER
                // Easy
                sq.add(new Question("Java Developer", "Easy", "Basics", "Java Basics", 1, "What is Java?"));
                sq.add(new Question("Java Developer", "Easy", "Basics", "JVM", 1, "What is JVM?"));
                sq.add(new Question("Java Developer", "Easy", "Basics", "Java Basics", 1, "Difference between JDK, JRE, JVM?"));
                sq.add(new Question("Java Developer", "Easy", "OOP", "OOP Concepts", 1, "What is OOP?"));
                sq.add(new Question("Java Developer", "Easy", "OOP", "OOP Concepts", 1, "What is inheritance?"));
                // Intermediate
                sq.add(new Question("Java Developer", "Intermediate", "Collections", "Data Structures", 2, "Difference between HashMap and HashTable"));
                sq.add(new Question("Java Developer", "Intermediate", "Concurrency", "Multithreading", 2, "What is multithreading?"));
                sq.add(new Question("Java Developer", "Intermediate", "Core Java", "Exception Handling", 2, "Explain exception handling in Java"));
                sq.add(new Question("Java Developer", "Intermediate", "Frameworks", "Spring Boot", 2, "What is Spring Boot?"));
                sq.add(new Question("Java Developer", "Intermediate", "Memory", "Garbage Collection", 2, "What is garbage collection?"));
                // Hard
                sq.add(new Question("Java Developer", "Hard", "Memory", "JVM Internals", 3, "Explain JVM memory structure"));
                sq.add(new Question("Java Developer", "Hard", "Core Java", "Class Loading", 3, "What is class loading mechanism?"));
                sq.add(new Question("Java Developer", "Hard", "Concurrency", "Multithreading", 3, "Difference between synchronized and Lock"));
                sq.add(new Question("Java Developer", "Hard", "Memory", "Memory Management", 3, "What are Java memory leaks?"));
                sq.add(new Question("Java Developer", "Hard", "Concurrency", "Multithreading", 3, "Explain thread lifecycle in detail"));

                // 2. FRONTEND DEVELOPER
                // Easy
                sq.add(new Question("Frontend Developer", "Easy", "HTML", "HTML basics", 1, "What is HTML?"));
                sq.add(new Question("Frontend Developer", "Easy", "CSS", "CSS basics", 1, "What is CSS?"));
                sq.add(new Question("Frontend Developer", "Easy", "JavaScript", "JS basics", 1, "What is JavaScript?"));
                sq.add(new Question("Frontend Developer", "Easy", "DOM", "DOM Manipulation", 1, "What is DOM?"));
                sq.add(new Question("Frontend Developer", "Easy", "CSS", "Responsive Design", 1, "What is responsive design?"));
                // Intermediate
                sq.add(new Question("Frontend Developer", "Intermediate", "JavaScript", "Events", 2, "What is event bubbling?"));
                sq.add(new Question("Frontend Developer", "Intermediate", "JavaScript", "ES6", 2, "Difference between var, let, const"));
                sq.add(new Question("Frontend Developer", "Intermediate", "JavaScript", "Async JS", 2, "What are promises?"));
                sq.add(new Question("Frontend Developer", "Intermediate", "CSS", "Layouts", 2, "What is Flexbox?"));
                sq.add(new Question("Frontend Developer", "Intermediate", "Integration", "APIs", 2, "What is API integration?"));
                // Hard
                sq.add(new Question("Frontend Developer", "Hard", "React", "Virtual DOM", 3, "Explain Virtual DOM"));
                sq.add(new Question("Frontend Developer", "Hard", "React", "Reconciliation", 3, "What is React reconciliation?"));
                sq.add(new Question("Frontend Developer", "Hard", "Architecture", "Rendering", 3, "Difference between CSR and SSR"));
                sq.add(new Question("Frontend Developer", "Hard", "Optimization", "Performance", 3, "Performance optimization techniques"));
                sq.add(new Question("Frontend Developer", "Hard", "Architecture", "Browser Internals", 3, "How does browser rendering work?"));

                // 3. PYTHON DEVELOPER
                // Easy
                sq.add(new Question("Python Developer", "Easy", "Basics", "Python Basics", 1, "What is Python?"));
                sq.add(new Question("Python Developer", "Easy", "Data Structures", "Lists", 1, "What is a list?"));
                sq.add(new Question("Python Developer", "Easy", "Data Structures", "Tuples", 1, "What is tuple?"));
                sq.add(new Question("Python Developer", "Easy", "Data Structures", "Dictionaries", 1, "What is dictionary?"));
                sq.add(new Question("Python Developer", "Easy", "Syntax", "Formatting", 1, "What is indentation?"));
                // Intermediate
                sq.add(new Question("Python Developer", "Intermediate", "Advanced", "Decorators", 2, "What are decorators?"));
                sq.add(new Question("Python Developer", "Intermediate", "Advanced", "Generators", 2, "What are generators?"));
                sq.add(new Question("Python Developer", "Intermediate", "OOP", "OOP Concepts", 2, "What is OOP in Python?"));
                sq.add(new Question("Python Developer", "Intermediate", "Data Structures", "Sets", 2, "Difference between list and set"));
                sq.add(new Question("Python Developer", "Intermediate", "Core Python", "Exception Handling", 2, "What is exception handling?"));
                // Hard
                sq.add(new Question("Python Developer", "Hard", "Concurrency", "GIL", 3, "Explain GIL in Python"));
                sq.add(new Question("Python Developer", "Hard", "Memory", "Memory Management", 3, "What is memory management in Python?"));
                sq.add(new Question("Python Developer", "Hard", "Concurrency", "Async", 3, "What is async programming?"));
                sq.add(new Question("Python Developer", "Hard", "Concurrency", "Multiprocessing", 3, "Difference between multiprocessing and multithreading"));
                sq.add(new Question("Python Developer", "Hard", "Advanced", "Metaclasses", 3, "Explain metaclasses"));

                // 4. DEVOPS ENGINEER
                // Easy
                sq.add(new Question("DevOps Engineer", "Easy", "Basics", "DevOps Concepts", 1, "What is DevOps?"));
                sq.add(new Question("DevOps Engineer", "Easy", "CI/CD", "Pipelines", 1, "What is CI/CD?"));
                sq.add(new Question("DevOps Engineer", "Easy", "VCS", "Git", 1, "What is Git?"));
                sq.add(new Question("DevOps Engineer", "Easy", "Containers", "Docker", 1, "What is Docker?"));
                sq.add(new Question("DevOps Engineer", "Easy", "Cloud", "Cloud Computing", 1, "What is cloud computing?"));
                // Intermediate
                sq.add(new Question("DevOps Engineer", "Intermediate", "CI/CD", "Jenkins", 2, "What is Jenkins pipeline?"));
                sq.add(new Question("DevOps Engineer", "Intermediate", "Containers", "Virtualization", 2, "Difference between Docker and VM"));
                sq.add(new Question("DevOps Engineer", "Intermediate", "Orchestration", "Kubernetes", 2, "What is Kubernetes?"));
                sq.add(new Question("DevOps Engineer", "Intermediate", "Automation", "Deployment", 2, "What is deployment automation?"));
                sq.add(new Question("DevOps Engineer", "Intermediate", "Operations", "Monitoring", 2, "What is monitoring?"));
                // Hard
                sq.add(new Question("DevOps Engineer", "Hard", "Orchestration", "Kubernetes Internals", 3, "Explain Kubernetes architecture"));
                sq.add(new Question("DevOps Engineer", "Hard", "Deployment", "Strategies", 3, "What is blue-green deployment?"));
                sq.add(new Question("DevOps Engineer", "Hard", "Automation", "IaC", 3, "What is infrastructure as code?"));
                sq.add(new Question("DevOps Engineer", "Hard", "Cloud", "Scaling", 3, "Explain scaling strategies in cloud"));
                sq.add(new Question("DevOps Engineer", "Hard", "Architecture", "Service Mesh", 3, "What is service mesh?"));

                // 5. DSA (Data Structures & Algorithms)
                // Easy
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Easy", "Arrays", "Data Structures", 1, "What is array?"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Easy", "Linked Lists", "Data Structures", 1, "What is linked list?"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Easy", "Stacks", "Data Structures", 1, "What is stack?"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Easy", "Queues", "Data Structures", 1, "What is queue?"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Easy", "Complexity", "Algorithms", 1, "What is time complexity?"));
                // Intermediate
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Intermediate", "Searching", "Algorithms", 2, "Binary search explanation"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Intermediate", "Linked Lists", "Operations", 2, "Linked list operations"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Intermediate", "Data Structures", "Comparison", 2, "Stack vs Queue difference"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Intermediate", "Trees", "Traversal", 2, "Tree traversal basics"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Intermediate", "Hashing", "Data Structures", 2, "Hashing concept"));
                // Hard
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Hard", "Graphs", "Algorithms", 3, "Dijkstra algorithm"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Hard", "Dynamic Programming", "Algorithms", 3, "Dynamic programming basics"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Hard", "Graphs", "Traversal", 3, "Graph traversal (BFS/DFS)"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Hard", "Complexity", "Optimization", 3, "Time complexity optimization"));
                sq.add(new Question("Data Structures & Algorithms (DSA)", "Hard", "Algorithms", "Recursion", 3, "Recursion vs iteration deep understanding"));

                // 6. BACKEND DEVELOPER
                // Easy
                sq.add(new Question("Backend Developer", "Easy", "APIs", "REST", 1, "What is a REST API?"));
                sq.add(new Question("Backend Developer", "Easy", "Databases", "SQL basics", 1, "Difference between SQL and NoSQL?"));
                sq.add(new Question("Backend Developer", "Easy", "Security", "Authentication", 1, "What is JWT?"));
                sq.add(new Question("Backend Developer", "Easy", "Architecture", "Microservices", 1, "What are microservices?"));
                sq.add(new Question("Backend Developer", "Easy", "Network", "HTTP", 1, "What are HTTP methods?"));
                // Intermediate
                sq.add(new Question("Backend Developer", "Intermediate", "Databases", "ACID", 2, "Explain ACID properties"));
                sq.add(new Question("Backend Developer", "Intermediate", "Security", "OAuth", 2, "How does OAuth2 work?"));
                sq.add(new Question("Backend Developer", "Intermediate", "Optimization", "Caching", 2, "What is caching and how is Redis used?"));
                sq.add(new Question("Backend Developer", "Intermediate", "Architecture", "Message Queues", 2, "Explain RabbitMQ or Kafka basics"));
                sq.add(new Question("Backend Developer", "Intermediate", "Databases", "ORM", 2, "What is Object-Relational Mapping (ORM)?"));
                // Hard
                sq.add(new Question("Backend Developer", "Hard", "System Design", "Scalability", 3, "How to design a rate limiter?"));
                sq.add(new Question("Backend Developer", "Hard", "Databases", "Transactions", 3, "Explain database isolation levels"));
                sq.add(new Question("Backend Developer", "Hard", "Architecture", "Event Driven", 3, "What is event-driven architecture?"));
                sq.add(new Question("Backend Developer", "Hard", "System Design", "Load Balancing", 3, "How does consistent hashing work?"));
                sq.add(new Question("Backend Developer", "Hard", "Optimization", "Database Tuning", 3, "How would you optimize a slow SQL query?"));

                // 7. FULL STACK DEVELOPER
                // Easy
                sq.add(new Question("Full Stack Developer", "Easy", "Network", "HTTP", 1, "What happens when you type a URL into a browser?"));
                sq.add(new Question("Full Stack Developer", "Easy", "Version Control", "Git", 1, "How do you resolve a Git merge conflict?"));
                sq.add(new Question("Full Stack Developer", "Easy", "Architecture", "MVC", 1, "What is the MVC design pattern?"));
                sq.add(new Question("Full Stack Developer", "Easy", "Frontend", "State", 1, "What is state management in the frontend?"));
                sq.add(new Question("Full Stack Developer", "Easy", "Backend", "APIs", 1, "What is JSON?"));
                // Intermediate
                sq.add(new Question("Full Stack Developer", "Intermediate", "Security", "Web Security", 2, "Explain CORS and how to configure it"));
                sq.add(new Question("Full Stack Developer", "Intermediate", "Security", "Vulnerabilities", 2, "How do you prevent XSS and CSRF?"));
                sq.add(new Question("Full Stack Developer", "Intermediate", "Databases", "Optimization", 2, "What is the N+1 query problem?"));
                sq.add(new Question("Full Stack Developer", "Intermediate", "Architecture", "WebSockets", 2, "What are WebSockets used for?"));
                sq.add(new Question("Full Stack Developer", "Intermediate", "Testing", "QA", 2, "What is the difference between unit and integration testing?"));
                // Hard
                sq.add(new Question("Full Stack Developer", "Hard", "Architecture", "Micro-frontends", 3, "Describe how you would implement a micro-frontend architecture."));
                sq.add(new Question("Full Stack Developer", "Hard", "System Design", "Real-time", 3, "How to build a real-time collaborative text editor?"));
                sq.add(new Question("Full Stack Developer", "Hard", "Optimization", "Performance", 3, "How do you measure and improve Web Vitals?"));
                sq.add(new Question("Full Stack Developer", "Hard", "DevOps", "Deployment", 3, "Explain a zero-downtime deployment strategy"));
                sq.add(new Question("Full Stack Developer", "Hard", "Architecture", "Authentication", 3, "Design a secure SSO architecture"));

                // 8. DATABASE ENGINEER (SQL Specialist)
                // Easy
                sq.add(new Question("Database Engineer (SQL Specialist)", "Easy", "SQL", "Joins", 1, "Difference between INNER JOIN and LEFT JOIN?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Easy", "SQL", "Clauses", 1, "Difference between WHERE and HAVING?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Easy", "Concepts", "Keys", 1, "What is a Primary Key and Foreign Key?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Easy", "Concepts", "Normalization", 1, "What is database normalization?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Easy", "SQL", "Functions", 1, "What are aggregate functions?"));
                // Intermediate
                sq.add(new Question("Database Engineer (SQL Specialist)", "Intermediate", "Optimization", "Indexes", 2, "Explain how indexing works and what a B-Tree is."));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Intermediate", "SQL", "Subqueries", 2, "What is a correlated subquery?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Intermediate", "Concepts", "Transactions", 2, "What are ACID properties?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Intermediate", "Optimization", "Views", 2, "What is a materialized view?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Intermediate", "NoSQL", "Comparison", 2, "When would you choose NoSQL over SQL?"));
                // Hard
                sq.add(new Question("Database Engineer (SQL Specialist)", "Hard", "Concepts", "Isolation", 3, "What are database isolation levels and how do they relate to phantom reads?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Hard", "Optimization", "Execution Plans", 3, "How do you read and optimize a query execution plan?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Hard", "Architecture", "Scaling", 3, "Explain database sharding vs partitioning"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Hard", "Concepts", "Concurrency", 3, "What is MVCC (Multi-Version Concurrency Control)?"));
                sq.add(new Question("Database Engineer (SQL Specialist)", "Hard", "Optimization", "Deadlocks", 3, "How do you detect and prevent database deadlocks?"));

                // 9. CLOUD ENGINEER (AWS/Azure/GCP)
                // Easy
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Easy", "Concepts", "Cloud Models", 1, "Difference between IaaS, PaaS, and SaaS?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Easy", "AWS", "Compute", 1, "What is EC2?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Easy", "AWS", "Storage", 1, "What is S3?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Easy", "Security", "IAM", 1, "What is IAM?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Easy", "Concepts", "Serverless", 1, "What does serverless mean?"));
                // Intermediate
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Intermediate", "Networking", "VPC", 2, "Explain what a VPC, Subnet, and Internet Gateway are."));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Intermediate", "Storage", "Databases", 2, "Difference between RDS and DynamoDB?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Intermediate", "Architecture", "Load Balancing", 2, "How does an Application Load Balancer work?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Intermediate", "Operations", "Monitoring", 2, "How do you monitor cloud resources?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Intermediate", "Automation", "IaC", 2, "What is Terraform or CloudFormation?"));
                // Hard
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Hard", "Serverless", "Optimization", 3, "What are the cold start issues in AWS Lambda, and how can you mitigate them?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Hard", "Networking", "Architecture", 3, "Design a highly available multi-region architecture."));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Hard", "Security", "Compliance", 3, "How do you secure data at rest and in transit in the cloud?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Hard", "Architecture", "Cost Optimization", 3, "Strategies for cloud cost optimization at scale?"));
                sq.add(new Question("Cloud Engineer (AWS/Azure/GCP)", "Hard", "Operations", "Disaster Recovery", 3, "Explain RTO and RPO in disaster recovery"));

                // 10. QA / TEST AUTOMATION ENGINEER
                // Easy
                sq.add(new Question("QA / Test Automation Engineer", "Easy", "Concepts", "Testing Types", 1, "Difference between Black Box and White Box testing?"));
                sq.add(new Question("QA / Test Automation Engineer", "Easy", "Concepts", "Testing Levels", 1, "What is Unit testing vs Integration testing?"));
                sq.add(new Question("QA / Test Automation Engineer", "Easy", "Automation", "Tools", 1, "What is Selenium?"));
                sq.add(new Question("QA / Test Automation Engineer", "Easy", "Concepts", "Bugs", 1, "What is the software testing life cycle (STLC)?"));
                sq.add(new Question("QA / Test Automation Engineer", "Easy", "Concepts", "Agile", 1, "What is the role of QA in Agile?"));
                // Intermediate
                sq.add(new Question("QA / Test Automation Engineer", "Intermediate", "Automation", "Frameworks", 2, "How would you structure a Selenium or Cypress test framework from scratch?"));
                sq.add(new Question("QA / Test Automation Engineer", "Intermediate", "Automation", "Locators", 2, "What are XPath and CSS selectors?"));
                sq.add(new Question("QA / Test Automation Engineer", "Intermediate", "API", "Testing", 2, "How do you perform API testing?"));
                sq.add(new Question("QA / Test Automation Engineer", "Intermediate", "Concepts", "BDD", 2, "What is Behavior-Driven Development (BDD)?"));
                sq.add(new Question("QA / Test Automation Engineer", "Intermediate", "CI/CD", "Integration", 2, "How do you integrate automated tests into a CI/CD pipeline?"));
                // Hard
                sq.add(new Question("QA / Test Automation Engineer", "Hard", "Strategy", "Performance", 3, "How do you test a highly concurrent trading application?"));
                sq.add(new Question("QA / Test Automation Engineer", "Hard", "Automation", "Flakiness", 3, "How do you handle flaky tests in an automation suite?"));
                sq.add(new Question("QA / Test Automation Engineer", "Hard", "Strategy", "Test Data", 3, "Strategies for managing test data in automated environments?"));
                sq.add(new Question("QA / Test Automation Engineer", "Hard", "Automation", "Mobile", 3, "Explain the architecture of Appium for mobile testing."));
                sq.add(new Question("QA / Test Automation Engineer", "Hard", "Strategy", "Security", 3, "How do you incorporate basic security testing into your QA process?"));

                // 11. CYBERSECURITY ANALYST
                // Easy
                sq.add(new Question("Cybersecurity Analyst", "Easy", "Concepts", "Principles", 1, "What is the principle of least privilege?"));
                sq.add(new Question("Cybersecurity Analyst", "Easy", "Concepts", "CIA Triad", 1, "What is the CIA triad?"));
                sq.add(new Question("Cybersecurity Analyst", "Easy", "Threats", "Malware", 1, "Difference between a virus and a worm?"));
                sq.add(new Question("Cybersecurity Analyst", "Easy", "Network", "Firewalls", 1, "What does a firewall do?"));
                sq.add(new Question("Cybersecurity Analyst", "Easy", "Threats", "Phishing", 1, "What is phishing?"));
                // Intermediate
                sq.add(new Question("Cybersecurity Analyst", "Intermediate", "Threats", "Web Vulnerabilities", 2, "Explain how a SQL Injection attack works and how to prevent it."));
                sq.add(new Question("Cybersecurity Analyst", "Intermediate", "Threats", "Web Vulnerabilities", 2, "What is Cross-Site Scripting (XSS)?"));
                sq.add(new Question("Cybersecurity Analyst", "Intermediate", "Network", "Protocols", 2, "Difference between symmetric and asymmetric encryption?"));
                sq.add(new Question("Cybersecurity Analyst", "Intermediate", "Operations", "Incident Response", 2, "What are the steps of Incident Response?"));
                sq.add(new Question("Cybersecurity Analyst", "Intermediate", "Network", "VPN", 2, "How does a VPN work?"));
                // Hard
                sq.add(new Question("Cybersecurity Analyst", "Hard", "Cryptography", "TLS", 3, "Describe how TLS/SSL handshake works."));
                sq.add(new Question("Cybersecurity Analyst", "Hard", "Threats", "Advanced", 3, "What is a buffer overflow and how can it be mitigated?"));
                sq.add(new Question("Cybersecurity Analyst", "Hard", "Operations", "SOC", 3, "Explain the role of SIEM in a SOC."));
                sq.add(new Question("Cybersecurity Analyst", "Hard", "Architecture", "Zero Trust", 3, "What is Zero Trust Architecture?"));
                sq.add(new Question("Cybersecurity Analyst", "Hard", "Threats", "Network", 3, "How would you detect and mitigate a DDoS attack?"));

                // 12. AI/ML ENGINEER
                // Easy
                sq.add(new Question("AI/ML Engineer", "Easy", "Concepts", "Learning Types", 1, "What is the difference between supervised and unsupervised learning?"));
                sq.add(new Question("AI/ML Engineer", "Easy", "Concepts", "Overfitting", 1, "What is overfitting in machine learning?"));
                sq.add(new Question("AI/ML Engineer", "Easy", "Algorithms", "Regression", 1, "What is linear regression?"));
                sq.add(new Question("AI/ML Engineer", "Easy", "Metrics", "Evaluation", 1, "What is a confusion matrix?"));
                sq.add(new Question("AI/ML Engineer", "Easy", "Data", "Preprocessing", 1, "Why do we need data normalization?"));
                // Intermediate
                sq.add(new Question("AI/ML Engineer", "Intermediate", "Algorithms", "Optimization", 2, "Explain how Gradient Descent works in optimizing a neural network."));
                sq.add(new Question("AI/ML Engineer", "Intermediate", "Algorithms", "Trees", 2, "What is a Random Forest?"));
                sq.add(new Question("AI/ML Engineer", "Intermediate", "Neural Networks", "Activation", 2, "What are activation functions and why are they used?"));
                sq.add(new Question("AI/ML Engineer", "Intermediate", "Deep Learning", "CNNs", 2, "How does a Convolutional Neural Network (CNN) work?"));
                sq.add(new Question("AI/ML Engineer", "Intermediate", "NLP", "Text Processing", 2, "What is TF-IDF?"));
                // Hard
                sq.add(new Question("AI/ML Engineer", "Hard", "Deep Learning", "Transformers", 3, "Describe the Attention mechanism in Transformer models."));
                sq.add(new Question("AI/ML Engineer", "Hard", "Algorithms", "Optimization", 3, "Explain the vanishing gradient problem and how to solve it."));
                sq.add(new Question("AI/ML Engineer", "Hard", "Architecture", "Generative Models", 3, "How do Generative Adversarial Networks (GANs) work?"));
                sq.add(new Question("AI/ML Engineer", "Hard", "Ops", "MLOps", 3, "How do you deploy and monitor a machine learning model in production?"));
                sq.add(new Question("AI/ML Engineer", "Hard", "Deep Learning", "RNNs", 3, "Difference between LSTM and GRU?"));

                // ==========================================
                // NON-TECH ROLES
                // ==========================================

                // 13. HR INTERVIEW
                // Easy
                sq.add(new Question("HR Interview", "Easy", "Background", "Introduction", 1, "Tell me about yourself"));
                sq.add(new Question("HR Interview", "Easy", "Motivation", "Career Goals", 1, "Why do you want this job?"));
                sq.add(new Question("HR Interview", "Easy", "Self-Awareness", "Strengths", 1, "What are your strengths?"));
                sq.add(new Question("HR Interview", "Easy", "Self-Awareness", "Weaknesses", 1, "What are your weaknesses?"));
                sq.add(new Question("HR Interview", "Easy", "Career", "Future", 1, "Where do you see yourself?"));
                // Intermediate
                sq.add(new Question("HR Interview", "Intermediate", "Behavioral", "Challenges", 2, "Describe a challenging situation"));
                sq.add(new Question("HR Interview", "Intermediate", "Behavioral", "Stress", 2, "How do you handle pressure?"));
                sq.add(new Question("HR Interview", "Intermediate", "Behavioral", "Conflict", 2, "Team conflict resolution"));
                sq.add(new Question("HR Interview", "Intermediate", "Experience", "Leadership", 2, "Leadership experience"));
                sq.add(new Question("HR Interview", "Intermediate", "Motivation", "Value Add", 2, "Why should we hire you?"));
                // Hard
                sq.add(new Question("HR Interview", "Hard", "Behavioral", "Failure", 3, "Describe a failure and what you learned"));
                sq.add(new Question("HR Interview", "Hard", "Behavioral", "Conflict", 3, "How do you handle toxic team members?"));
                sq.add(new Question("HR Interview", "Hard", "Behavioral", "Stress", 3, "How do you prioritize work under pressure?"));
                sq.add(new Question("HR Interview", "Hard", "Behavioral", "Leadership", 3, "Explain a leadership decision you made"));
                sq.add(new Question("HR Interview", "Hard", "Career", "Transitions", 3, "Why do you want to switch careers?"));

                // 14. COMMUNICATION SKILLS ROUND
                // Easy
                sq.add(new Question("Communication Skills Round", "Easy", "Clarity", "Explanation", 1, "Explain a complex hobby of yours to a 5-year-old."));
                sq.add(new Question("Communication Skills Round", "Easy", "Expression", "Interests", 1, "What is your favorite book/movie and why?"));
                sq.add(new Question("Communication Skills Round", "Easy", "Clarity", "Instructions", 1, "Give me directions from your house to the nearest grocery store."));
                sq.add(new Question("Communication Skills Round", "Easy", "Expression", "Values", 1, "What does success mean to you?"));
                sq.add(new Question("Communication Skills Round", "Easy", "Clarity", "Summary", 1, "Summarize the plot of the last TV show you watched."));
                // Intermediate
                sq.add(new Question("Communication Skills Round", "Intermediate", "Persuasion", "Pitch", 2, "Pitch a new product idea to a hesitant stakeholder."));
                sq.add(new Question("Communication Skills Round", "Intermediate", "Empathy", "Feedback", 2, "How would you give constructive feedback to a peer?"));
                sq.add(new Question("Communication Skills Round", "Intermediate", "Clarity", "Technical", 2, "Explain the Internet to someone from the 1800s."));
                sq.add(new Question("Communication Skills Round", "Intermediate", "Conflict", "Resolution", 2, "Describe a time you had a miscommunication and how you fixed it."));
                sq.add(new Question("Communication Skills Round", "Intermediate", "Expression", "Values", 2, "How do you adapt your communication style for different audiences?"));
                // Hard
                sq.add(new Question("Communication Skills Round", "Hard", "Crisis", "Management", 3, "How would you deliver bad news to a client about a critical project delay?"));
                sq.add(new Question("Communication Skills Round", "Hard", "Persuasion", "Negotiation", 3, "Convince me to adopt a technology I strongly dislike."));
                sq.add(new Question("Communication Skills Round", "Hard", "Conflict", "Mediation", 3, "How would you mediate a dispute between two senior executives?"));
                sq.add(new Question("Communication Skills Round", "Hard", "Clarity", "Public Speaking", 3, "Give a 2-minute impromptu speech on the importance of adaptability."));
                sq.add(new Question("Communication Skills Round", "Hard", "Empathy", "Crisis", 3, "How do you handle a customer who is irrationally angry and abusive?"));

                // 15. MANAGERIAL / LEADERSHIP ROUND
                // Easy
                sq.add(new Question("Managerial / Leadership Round", "Easy", "Leadership", "Style", 1, "What is your leadership style?"));
                sq.add(new Question("Managerial / Leadership Round", "Easy", "Management", "Motivation", 1, "How do you motivate your team?"));
                sq.add(new Question("Managerial / Leadership Round", "Easy", "Management", "Goals", 1, "How do you set goals for your direct reports?"));
                sq.add(new Question("Managerial / Leadership Round", "Easy", "Leadership", "Values", 1, "What makes a good manager?"));
                sq.add(new Question("Managerial / Leadership Round", "Easy", "Management", "Onboarding", 1, "How do you onboard a new team member?"));
                // Intermediate
                sq.add(new Question("Managerial / Leadership Round", "Intermediate", "Management", "Delegation", 2, "How do you prioritize and delegate tasks to your team?"));
                sq.add(new Question("Managerial / Leadership Round", "Intermediate", "Performance", "Feedback", 2, "How do you handle an underperforming team member?"));
                sq.add(new Question("Managerial / Leadership Round", "Intermediate", "Leadership", "Change", 2, "How do you manage a team through a period of significant change?"));
                sq.add(new Question("Managerial / Leadership Round", "Intermediate", "Management", "Hiring", 2, "What do you look for when hiring for your team?"));
                sq.add(new Question("Managerial / Leadership Round", "Intermediate", "Conflict", "Resolution", 2, "How do you handle disagreements between your team members?"));
                // Hard
                sq.add(new Question("Managerial / Leadership Round", "Hard", "Strategy", "Alignment", 3, "How would you align your engineering team's goals with the company's Q3 revenue targets?"));
                sq.add(new Question("Managerial / Leadership Round", "Hard", "Leadership", "Crisis", 3, "Describe a time you had to make an unpopular decision that affected your team."));
                sq.add(new Question("Managerial / Leadership Round", "Hard", "Strategy", "Scaling", 3, "How do you scale a team from 5 to 50 engineers while maintaining culture?"));
                sq.add(new Question("Managerial / Leadership Round", "Hard", "Performance", "Termination", 3, "Walk me through your process for terminating an employee."));
                sq.add(new Question("Managerial / Leadership Round", "Hard", "Strategy", "Budgeting", 3, "How do you balance technical debt with delivering new features under a tight budget?"));


                repository.saveAll(sq);
                System.out.println("Seeded database with V4 massively expanded questions (225 total).");
            }
        };
    }
}
