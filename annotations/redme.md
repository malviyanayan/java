Annotations in Java provide a way to add metadata to the code. This metadata can be used by the compiler, development tools, 
or at runtime to influence the behavior of the program. Annotations do not directly affect program semantics 
but can be used for various purposes such as code analysis, compile-time checking, and runtime processing.


Key Points about Annotations
  Annotation Syntax: Annotations are preceded by the @ symbol.
  Built-in Annotations: Java provides several built-in annotations for various purposes.
  Custom Annotations: Developers can define their own annotations.
  Retention Policies: Annotations can be retained in source code, class files, or at runtime.
  Target: Annotations can be restricted to specific elements such as methods, fields, or types.

  
Built-in Annotations
  Commonly Used Built-in Annotations
    @Override: Indicates that a method is overriding a method in a superclass.
    @Deprecated: Marks a method or class as deprecated, indicating it should no longer be used.
    @SuppressWarnings: Instructs the compiler to suppress specific warnings.
    @SafeVarargs: Suppresses unchecked warnings in a variable arity method or constructor.
    @FunctionalInterface: Indicates that an interface is intended to be a functional interface (having exactly one abstract method).
