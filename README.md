# E-commerce Website

A modern full-stack e-commerce platform built with Spring Boot and React, providing a seamless online shopping experience with product management, shopping cart, and order processing capabilities.

## 📋 Overview

This e-commerce application offers a complete online shopping solution with features for browsing products, managing a shopping cart, processing orders, and handling user authentication. It's designed to be scalable, secure, and user-friendly.

## ✨ Features

### Customer Features
- User registration and authentication
- Browse products by categories
- Advanced product search and filtering
- Product detail views with images
- Shopping cart management
- Secure checkout process
- Order history and tracking
- User profile management
- Wishlist functionality

### Admin Features
- Product management (CRUD operations)
- Category management
- Order management and tracking
- User management
- Inventory tracking
- Sales analytics and reports

## 🛠️ Tech Stack

### Backend (SpringEcom)
- **Framework**: Spring Boot
- **Language**: Java
- **Database**: (MySQL/PostgreSQL/H2)
- **Security**: Spring Security
- **API**: RESTful APIs
- **Build Tool**: Maven/Gradle

### Frontend (EcommerceWebsiteFrontend)
- **Framework**: React.js
- **Language**: JavaScript
- **Styling**: CSS/HTML
- **State Management**: (Redux/Context API)
- **HTTP Client**: Axios/Fetch API
- **Routing**: React Router

## 📁 Project Structure

```
Ecommerce-Website/
├── SpringEcom/                    # Spring Boot backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/ecommerce/
│   │   │   │       ├── controller/   # REST controllers
│   │   │   │       ├── model/        # Entity models
│   │   │   │       ├── repository/   # Data repositories
│   │   │   │       ├── service/      # Business logic
│   │   │   │       └── config/       # Configuration
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/                  # Unit tests
│   └── pom.xml                    # Maven dependencies
│
└── EcommerceWebsiteFrontend/      # React frontend
    ├── public/
    ├── src/
    │   ├── components/            # Reusable components
    │   ├── pages/                 # Page components
    │   ├── services/              # API services
    │   ├── utils/                 # Utility functions
    │   ├── context/               # Context providers
    │   └── App.js                 # Main app component
    └── package.json               # NPM dependencies
```

## 🔧 Installation & Setup

### Prerequisites
- Java JDK 11 or higher
- Node.js 14+ and npm/yarn
- Maven 3.6+
- MySQL/PostgreSQL database
- Git

### Backend Setup

1. Clone the repository:
```bash
git clone https://github.com/T92-max/Ecommerce-Website.git
cd Ecommerce-Website/SpringEcom
```

2. Configure database in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. Install dependencies and build:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

Backend server runs on `http://localhost:8080`

### Frontend Setup

1. Navigate to frontend directory:
```bash
cd ../EcommerceWebsiteFrontend
```

2. Install dependencies:
```bash
npm install
# or
yarn install
```

3. Configure API endpoint (create `.env` file):
```env
REACT_APP_API_URL=http://localhost:8080/api
```

4. Start the development server:
```bash
npm start
# or
yarn start
```

Frontend application opens at `http://localhost:3000`

## 🔌 API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout
- `GET /api/auth/profile` - Get user profile

### Products
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `GET /api/products/category/{category}` - Get products by category
- `POST /api/products` - Create product (Admin)
- `PUT /api/products/{id}` - Update product (Admin)
- `DELETE /api/products/{id}` - Delete product (Admin)
- `GET /api/products/search?keyword={keyword}` - Search products

### Categories
- `GET /api/categories` - Get all categories
- `POST /api/categories` - Create category (Admin)
- `PUT /api/categories/{id}` - Update category (Admin)
- `DELETE /api/categories/{id}` - Delete category (Admin)

### Cart
- `GET /api/cart` - Get user's cart
- `POST /api/cart/add` - Add item to cart
- `PUT /api/cart/update/{itemId}` - Update cart item quantity
- `DELETE /api/cart/remove/{itemId}` - Remove item from cart
- `DELETE /api/cart/clear` - Clear cart

### Orders
- `POST /api/orders` - Create new order
- `GET /api/orders` - Get user's orders
- `GET /api/orders/{id}` - Get order details
- `PUT /api/orders/{id}/status` - Update order status (Admin)

### Wishlist
- `GET /api/wishlist` - Get user's wishlist
- `POST /api/wishlist/add/{productId}` - Add to wishlist
- `DELETE /api/wishlist/remove/{productId}` - Remove from wishlist

## 💾 Database Schema

### Core Entities
- **User**: Customer and admin accounts
- **Product**: Product information and pricing
- **Category**: Product categories
- **Cart**: Shopping cart items
- **Order**: Order details and status
- **OrderItem**: Individual items in orders
- **Address**: Shipping addresses
- **Payment**: Payment information

## 🎨 Frontend Pages

- **Home**: Landing page with featured products
- **Products**: Product listing with filters
- **Product Details**: Individual product view
- **Cart**: Shopping cart management
- **Checkout**: Order placement and payment
- **Login/Register**: Authentication pages
- **Profile**: User account management
- **Orders**: Order history
- **Admin Dashboard**: Admin control panel

## 🔐 Security Features

- JWT-based authentication
- Password encryption with BCrypt
- Role-based access control (User/Admin)
- CORS configuration
- Input validation and sanitization
- SQL injection prevention
- XSS protection

## 🧪 Testing

### Backend Tests
```bash
cd SpringEcom
mvn test
```

### Frontend Tests
```bash
cd EcommerceWebsiteFrontend
npm test
```

## 📦 Production Deployment

### Backend Deployment

1. Build JAR file:
```bash
mvn clean package -DskipTests
```

2. Run in production:
```bash
java -jar target/ecommerce-backend.jar --spring.profiles.active=prod
```

### Frontend Deployment

1. Create optimized build:
```bash
npm run build
```

2. Deploy to hosting service:
- Netlify
- Vercel
- AWS S3 + CloudFront
- Heroku

## 🔧 Environment Variables

### Backend (.env or application.properties)
```properties
DATABASE_URL=your_database_url
JWT_SECRET=your_jwt_secret_key
STRIPE_API_KEY=your_stripe_key
EMAIL_USERNAME=your_email
EMAIL_PASSWORD=your_password
```

### Frontend (.env)
```env
REACT_APP_API_URL=your_backend_url
REACT_APP_STRIPE_KEY=your_stripe_public_key
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/NewFeature`)
3. Commit your changes (`git commit -m 'Add NewFeature'`)
4. Push to the branch (`git push origin feature/NewFeature`)
5. Open a Pull Request

## 📝 Development Guidelines

- Follow Java coding conventions for backend
- Use ESLint and Prettier for frontend code
- Write unit tests for new features
- Update documentation for API changes
- Use meaningful commit messages

## 🐛 Troubleshooting

### Common Issues

**Backend won't start**
- Check database connection settings
- Ensure database is running
- Verify Java version compatibility

**Frontend can't connect to backend**
- Check CORS configuration
- Verify API_URL in frontend .env
- Ensure backend is running

**Build fails**
- Clear Maven/npm cache
- Delete node_modules and reinstall
- Check for dependency conflicts

## 🔮 Future Enhancements

- [ ] Payment gateway integration (Stripe/PayPal)
- [ ] Product reviews and ratings
- [ ] Email notifications
- [ ] Coupon and discount system
- [ ] Multi-language support
- [ ] Mobile app (React Native)
- [ ] Advanced analytics dashboard
- [ ] Product recommendations
- [ ] Social media integration
- [ ] Live chat support

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**T92-max**
- GitHub: [@T92-max](https://github.com/T92-max)

## 🙏 Acknowledgments

- Spring Boot documentation
- React documentation
- All contributors and testers


---

**Happy Shopping! 🛒**
