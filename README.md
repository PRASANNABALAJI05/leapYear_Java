---

## 🗓️ Leap Year Checker

This is a simple Java program that checks whether a given year is a **leap year** or not. It also allows the user to run the check multiple times based on input.

---

### 📁 File Name

`leapYear.java`

---

### 🧠 Logic Used

A year is a **leap year** if:

* It is divisible by **400**
  **OR**
* It is divisible by **4** but **not divisible by 100**

> However, your current logic checks:

```java
if (year % 4 == 0)
    // Leap year
else if (year % 400 == 0)
    // Leap year
```

This may incorrectly mark some years like 1900 as leap years (even though they are not). For full correctness, use:

```java
if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
```

---

### 🖥️ How to Run

1. **Open CMD/Terminal**
2. Navigate to the folder where your `leapYear.java` file is saved:

   ```bash
   cd path\to\file
   ```
3. **Compile the file:**

   ```bash
   javac leapYear.java
   ```
4. **Run the program:**

   ```bash
   java leapYear
   ```

---

### 📌 Sample Output

```
Enter the Year: 2024
It is an Leap Year
-----------------------------------
Do you want to Run again?
(YES=1/NO=0)
1
Enter the Year: 2023
It is not an Leap Year
```

---

### ✅ Features

* Accepts user input from the console.
* Allows the user to run the program multiple times.
* Gives appropriate leap year feedback.

---
