# ServletFormValidationProject
# Servlet Form Validation Project

### 📋 Project Description
A Java Servlet and JSP-based web application that validates user details like **name**, **age**, **gender**, and **Aadhaar number**.  
After validation, it checks if the user is **eligible for marriage** based on their age and gender.

---

### 🛠️ Technologies Used
- Java Servlet
- JSP (Java Server Pages)
- HTML & CSS
- Eclipse IDE
- Apache Tomcat Server
- JDBC (optional, if used later)

---

### ⚙️ How It Works
1. The user fills in the form with:
   - Name  
   - Age  
   - Gender  
   - Aadhaar Number  
   - Country  

2. The `ValidateServlet` checks:
   - Name should not be empty  
   - Aadhaar number must be 12 digits  

3. If valid, request is forwarded to `EligibilityServlet`, which:
   - Checks the **age and gender**
   - Displays eligibility result on `data.jsp` page  

4. If invalid, the same form (`index.html`) is reloaded with error messages.

---

### 📁 Folder Structure

