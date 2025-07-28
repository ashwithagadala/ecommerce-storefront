# Full Stack eCommerce StoreFront

## Technologies
- Frontend: React (Vite, Bootstrap, Fetch API)
- Backend: Spring Boot, Spring Data JPA, Hibernate
- Database: MySQL

## Features
- Product listing with categories
- Category-wise filtering
- REST API integration

## API Endpoints
- `GET /api/categories` → Retrieve all categories
- `GET /api/products` → Fetch all products
- `GET /api/products/category/{categoryId}` → Fetch products by category

## Run Instructions
### Backend
1. Navigate to `backend/`
2. Configure MySQL in `application.properties`
3. Run using IntelliJ or:  
   ```bash
   mvn spring-boot:run
