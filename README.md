# Java Functional Programming & Stream API Demo

An automated HR Candidate Screening System engineered to demonstrate modern, declarative data processing architectures in Java. This project showcases the transition from traditional imperative loops to functional, type-safe pipeline architectures.

## 🛠️ Core Concepts Implemented

* **Type-Safe Configurations (`Enums`):** Standardized workflow states using compile-time validated constants to eliminate runtime string typos.
* **Custom Functional Interfaces (`@FunctionalInterface`):** Designed structural blueprint engines implemented seamlessly via lightweight Lambda Expressions (`->`).
* **Built-in Functional Ecosystem:** Utilized core functional descriptors under the hood:
    * `Predicate<T>` for conditional filtering logic.
    * `Function<T, R>` for data mutation and object transformation.
    * `Consumer<T>` for side-effect execution and final outputs.
* **Stream API Pipelines:** Chained declarative intermediate transformations (`.filter()`, `.map()`) followed by terminal operations (`.forEach()`, `.collect()`).
* **Parallel Computing Frameworks:** Deployed `.parallelStream()` to split heavy data volumes across multi-core CPUs via the ForkJoinPool framework.
* **Functional Exception Handling:** Handled the restrictions of checked exceptions inside closed lambdas using robust runtime wrapper methods.

## 📁 Project Structure

* `ApplicationStatus.java` - The configuration enum mapping the applicant lifecycle.
* `Applicant.java` - The data model encapsulation layer.
* `ApplicantFilter.java` - The custom functional contract definition.
* `JobPortal.java` - The operational runner executing sequential and parallel data streaming.

## 🚀 How to Run the Project

1. Clone the repository:
   ```bash
   git clone [https://github.com/chitrika003/java-functional-stream-api-.git](https://github.com/chitrika003/java-functional-stream-api-.git)
