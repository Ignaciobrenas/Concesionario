# ðŸš— Car Dealership Management Simulation (Java OOP Core)

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/OOP-Inheritance_%26_Abstract_Classes-007396?style=for-the-badge" alt="OOP" />
  <img src="https://img.shields.io/badge/Academic-1Âº_DAW_STUCOM-10B981?style=for-the-badge" alt="STUCOM" />
</p>

> ðŸŽ“ **Academic Project Notice:** Evaluative assignment for the **1st year of Web Application Development (DAW)** at **STUCOM Pelai** (Barcelona) covering Object-Oriented Programming (MP0485 RA7).

---

## ðŸ“Œ Overview / DescripciÃ³n General

### ðŸ‡¬ðŸ‡§ English
An object-oriented simulation of a car dealership's internal operations developed in **Java**. It models employee specialties (Managers, Mechanics, Sales representatives), maintenance job work orders, commissions, and vehicle sales workflows.

### ðŸ‡ªðŸ‡¸ EspaÃ±ol
SimulaciÃ³n orientada a objetos de la operativa de un concesionario de vehÃ­culos desarrollada en **Java**. Modela los diferentes roles de la plantilla (Gerentes, MecÃ¡nicos, Vendedores), la asignaciÃ³n de Ã³rdenes de trabajo (Trabajo), comisiones y flujos de venta de vehÃ­culos.

---

## ðŸ›ï¸ Roles & Architecture

- **Empleado.java (Abstract Class):** Shared employee attributes, base salary calculation, and polymorphic contract methods.
- **Gerente.java:** Management supervision bonus and dealership branch administration.
- **Mecanico.java:** Maintenance hours tracking, specialized repairs, and labor cost computation.
- **Vendedor.java:** Sales incentives, commission on vehicle deals, and customer lead tracking.
- **Trabajo.java:** Encapsulates service repair orders assigned to mechanics.
- **Concesionario.java:** Main business entity coordinating staff, inventory, and monthly payroll summaries.

---

## ðŸš€ How to Run

`ash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.concesionario.Main"
`

---

## ðŸ“„ License

Distributed under the **MIT License**.
