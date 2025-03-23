# Learning Java

Follow Mosh's Java Ultimate Course 

## Part 1 : Basics

### Primitive and Reference Data Type

- What is the output of below code? and Why?
```java
import java.awt.*;

public class Main{
    public static void main(String[] args){
        Point point1 = new Point(2, 3);
        Point point2 = point1;
        point1.x = 1;
        System.out.println(point2);
    }
}
```

- Is `String` a primitive or a reference data type in Java?

### Constant in Java

```java
final float PI = 3.14f; 
```

### Format Numbers in Java

```java

import java.text.NumberFormat;

public class Main{
    public static void main(String[] args){
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result); // % 10
    }
}
```

### Input / Output

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextLine();
        System.out.println("You are " + age);
    }
}
```

### Mortgage Project 

```java
import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final int MONTH_IN_YEAR = 12;
        Scanner in = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = in.nextDouble();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = in.nextFloat() / 100;
        System.out.print("Period (Years): ");
        byte years = in.nextByte();
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR;
        int months = years * 12;
        double mortgage = principle *
                monthlyInterestRate  * Math.pow((1 + monthlyInterestRate), months) /
                ( Math.pow((1 + monthlyInterestRate), months) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
```


