# Docker + Maven + Jenkins CI Pipeline

- Built a Java application using Maven with standard project structure and unit tests (JUnit)
- Implemented Continuous Integration using Jenkins Pipeline (Jenkinsfile)
- Automated build process using `mvn clean install` (compile + test)
- Containerized the application using Docker for consistent runtime environment
- Docker image builds include project compilation and test execution
- Integrated GitHub with Jenkins using webhooks for automatic pipeline triggering on push
- Pipeline stages include: Build → Test → Docker Build → Run Container
- Configured email notifications using Jenkins for build failures
- Demonstrates end-to-end CI workflow with code, build, containerization, and automation..
