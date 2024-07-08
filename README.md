# Non-Linear Data Structures 

## Getting Started

This project is a practical exercise on how to implement basic non-linear data structures in Java. It includes examples of trees and their various forms, demonstrating how to manage different versions using annotated tags in Git.

This repository refers to the second unit of Data Structures, where the first chapter covers non-linear data structures: Trees, Binary Trees, and Graphs.

## Requirements
- Java JDK 11 or higher
- Git 2.20 or higher

# Dictionaries

## Definition
Dictionaries are data structures that store key-value pairs, where each unique key is associated with a value. This structure allows for fast operations for search, insertion, and deletion based on the key.

### Types of Dictionaries
- **HashMap**: Implementation based on a hash table, does not guarantee the order of elements.
- **LinkedHashMap**: Similar to HashMap but maintains the order of insertion.
- **TreeMap**: Implementation based on a red-black tree, keeps elements sorted according to their keys.

## Usage Examples
### HashMap
A `HashMap` stores key-value pairs and does not guarantee any order of the elements. It provides average constant time operations for insertion, deletion, and search, but it is unordered.

```java
import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Pear", 3);

        System.out.println("HashMap: " + map);
        System.out.println("Apple exists: " + map.containsKey("Apple"));
        System.out.println("Value of Banana: " + map.get("Banana"));

        map.remove("Pear");
        System.out.println("HashMap after removing Pear: " + map);
    }
}
```

## Contribute

To contribute to this project, please create a fork and send a pull request, or simply open an issue with your comments and suggestions.

## Authors

- [PABLO TORRES] - Initial development