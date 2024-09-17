
---

# Java 8 Date-Time API: `LocalDate`, `LocalTime`, and `LocalDateTime`

## Overview
Java 8 introduced a new Date-Time API in the `java.time` package, which is thread-safe, immutable, and more comprehensive than the old `java.util.Date` and `java.util.Calendar`. The new API is divided into several classes for handling dates, times, and timestamps. Some of the most commonly used classes are:

- `LocalDate`: Represents a date (year, month, day) without a time zone.
- `LocalTime`: Represents a time (hours, minutes, seconds, nanoseconds) without a date or time zone.
- `LocalDateTime`: Combines date and time without a time zone.

---

## Key Classes

### 1. **`LocalDate`**
   - Represents only a date (e.g., `2024-09-16`).
   - Used to store dates like birthdays, event dates, etc.
   - Methods:
     - `now()`: Gets the current date.
     - `of(int year, int month, int day)`: Creates a specific date.
     - `plusDays(), minusWeeks(), plusMonths()`: Manipulates dates.
     - `isLeapYear()`: Checks if the current year is a leap year.

### 2. **`LocalTime`**
   - Represents only a time (e.g., `12:30:15`).
   - Used for working with times like clock settings, schedules, etc.
   - Methods:
     - `now()`: Gets the current time.
     - `of(int hour, int minute, int second)`: Creates a specific time.
     - `plusHours(), minusMinutes()`: Manipulates time.
     - `isBefore(), isAfter()`: Compares times.

### 3. **`LocalDateTime`**
   - Combines `LocalDate` and `LocalTime` to represent both date and time (e.g., `2024-09-16T12:30:15`).
   - Methods:
     - `now()`: Gets the current date and time.
     - `of(LocalDate, LocalTime)`: Combines date and time.
     - `toLocalDate()`, `toLocalTime()`: Extracts date and time from `LocalDateTime`.
     - `format(DateTimeFormatter)`: Formats the date and time into a string.

---

## Formatting and Parsing Dates

### **`DateTimeFormatter`**
To convert dates and times into a specific string format and vice versa, Java 8 introduced `DateTimeFormatter`. You can define patterns to format and parse date-time objects.

Example:
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
LocalDateTime dateTime = LocalDateTime.now();
String formattedDate = dateTime.format(formatter); // Formats date-time
LocalDateTime parsedDateTime = LocalDateTime.parse("16-09-2024 12:30:00", formatter); // Parses date-time
```

---

## Comparing Dates and Times

You can compare dates and times using methods like `isBefore()`, `isAfter()`, and `isEqual()`:

```java
LocalDate date1 = LocalDate.of(2024, 9, 16);
LocalDate date2 = LocalDate.of(2024, 10, 1);

boolean isBefore = date1.isBefore(date2);  // true
```

---

## Period and Duration

### **`Period`**
- Used to represent a difference in terms of years, months, and days between two dates.

### **`Duration`**
- Used to represent a difference between two times (in hours, minutes, seconds).

Example:
```java
LocalDate startDate = LocalDate.of(2023, 1, 1);
LocalDate endDate = LocalDate.now();
Period period = Period.between(startDate, endDate);
```

---

## Time Zones with `ZonedDateTime`

Java 8 also introduces `ZonedDateTime` for working with time zones. You can convert a `LocalDateTime` to a specific time zone using `ZoneId`.

Example:
```java
LocalDateTime localDateTime = LocalDateTime.now();
ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Kolkata"));
```

---

## Conclusion
The Java 8 Date-Time API provides a much cleaner and more intuitive way of handling dates, times, and time zones compared to the older `java.util.Date`. It is designed to be immutable, thread-safe, and easy to use with its fluent API and well-defined methods.

---

## References
- [Oracle Java Documentation](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html)
- [Baeldung - Java 8 Date-Time API](https://www.baeldung.com/java-8-date-time-intro)

---
