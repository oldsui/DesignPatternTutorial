# DesignPatternTutorial


## 1. Iterator

    concrete iterator -- implements --> iterator <-- has -- aggregate <-- implements -- concrete aggregate

    concrete iterator -- has --> concrete aggregate


## 2. Adapter

    Adaptee <-- extends -- Adapter -- implements --> Target(interface),  used by client 

                               
## 3. Template

    Abstract SuperClass: abstract method1, abstract method2, do() {method1(), method2()}
    
    ChildClass: method1, method2

    SuperClass child = new ChildClass(...)  // Liskov Substitution Principle: LSP

## 4. Factory


