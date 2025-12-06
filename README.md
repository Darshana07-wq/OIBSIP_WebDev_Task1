# Online Reservation System – Java Project

This project is created as part of AICTE OASIS Internship Task-1.  
It implements an **Online Reservation System** using both:

- Console-based Java application  
- GUI version using Java Swing  

The system includes:
- Login Form  
- Reservation Form  
- Auto Train Name Selection  
- Cancellation Form with PNR  
- Centralized in-memory “Database”  
- View All Reservations  

---

## 📌 Features

### ✔ **Login System**
Users must enter a valid Login ID and Password to access the system.

### ✔ **Reservation System**
Users can reserve tickets by entering:
- Passenger Name  
- Train Number (Train name auto-fills)  
- Journey details  
- Class type  
A unique PNR number is generated automatically.

### ✔ **Cancellation System**
User enters PNR → System fetches reservation → User confirms → Ticket is cancelled.

### ✔ **Centralized Database**
A simple in-memory Java `HashMap` acts as a database storing:
- Train details  
- All reservations  

### ✔ **GUI Version (Java Swing)**
A complete graphical interface containing:
- Login Window  
- Reservation Window  
- Cancellation Window  
- Display Reservations Window  

