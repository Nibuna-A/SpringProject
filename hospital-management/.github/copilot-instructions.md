# AI Coding Assistant Instructions

## Project Overview
This is a Hospital Management System with a Spring Boot backend (`hospital-management/`) and React frontend (`hospital-frontend/`).

### Architecture
- **Frontend**: React-based SPA bootstrapped with Create React App
- **Backend**: Spring Boot 3.5.7 with MongoDB
- **Key Technologies**:
  - Java 17
  - Spring Boot Web (REST APIs)
  - Spring Data MongoDB
  - React (frontend)
  - Maven (backend build)
  - npm (frontend build)

## Development Workflow

### Backend (hospital-management/)
```bash
# Build and run backend
./mvnw spring-boot:run

# Run tests
./mvnw test
```

### Frontend (hospital-frontend/)
```bash
# Install dependencies
npm install

# Development server
npm start  # Runs on http://localhost:3000

# Run tests
npm test

# Production build
npm run build
```

## Project Conventions

### Backend
- Uses Spring Boot's standard project structure
- MongoDB for persistence (check application.properties for connection settings)
- Lombok used for reducing boilerplate code
- Spring Validation for input validation

### Frontend
- Standard Create React App structure
- Components in `src/` directory
- Testing with React Testing Library

## Common Tasks
1. **Adding New API Endpoints**:
   - Create controller classes in `hospital-management/src/main/java/com/hms/hospital_management/controllers`
   - Use proper HTTP methods and REST conventions
   - Include validation annotations for request bodies

2. **Frontend Features**:
   - Add components in `hospital-frontend/src/components`
   - Update routing in `App.js`
   - Include tests in `*.test.js` files

3. **Database Operations**:
   - Use Spring Data MongoDB repositories
   - Define entity classes with proper annotations
   - Configure MongoDB connection in `application.properties`

## Need-to-Know Files
- `pom.xml`: Backend dependencies and build configuration
- `application.properties`: Spring Boot configuration
- `package.json`: Frontend dependencies and scripts
- `App.js`: Main React component and routing