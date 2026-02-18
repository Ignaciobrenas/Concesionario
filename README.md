# 🚗 Gestión de un Concesionario de Coches

Proyecto Java para la **Prueba Evaluativa RA7** del módulo de Programación Orientada a Objetos.
Simula la gestión de empleados de un concesionario de coches mediante herencia, clases abstractas e interfaces.

---

## 📁 Estructura del proyecto

```
ConcesionarioCoches/
├── Controller/
│   └── Main.java
└── Model/
    ├── Trabajo.java       (interfaz)
    ├── Empleado.java      (clase abstracta)
    ├── Vendedor.java
    ├── Mecanico.java
    ├── Gerente.java
    └── Concesionario.java
```

---

## 🧱 Diagrama de clases (simplificado)

```
<<interface>>
   Trabajo
  +trabajar()
  +calcularSueldo()
       ▲
       |
  Empleado (abstract)
  - nombre
  - sueldoBase: 1200€
  - horasTrabajo: 8
       ▲
  _____|______
 |     |      |
Vendedor  Mecanico  Gerente
```

---

## 👥 Tipos de empleados

### 🚗 Vendedor
- Sueldo base: **1200 €**
- Atributos extra: `comisionPorVenta` (50 €) y `ventasRealizadas`
- Cálculo de sueldo: `sueldoBase + (ventasRealizadas * comisionPorVenta)`

### 🔧 Mecánico
- Sueldo base: **1200 €**
- Atributos extra: `horasExtra` y `pagoHoraExtra` (15 €/hora)
- Cálculo de sueldo: `sueldoBase + (horasExtra * pagoHoraExtra)`

### 👔 Gerente
- Sueldo base: **2000 €**
- Atributos extra: `bonus` (500 €)
- Cálculo de sueldo: `sueldoBase + bonus`

---

## ▶️ Ejecución

Al arrancar el programa se pedirá por consola:

1. El **nombre del concesionario**
2. Crear empleados indicando **tipo** (1. Vendedor, 2. Mecánico, 3. Gerente) y **nombre**
3. Se puede añadir tantos empleados como se quiera
4. Al terminar, se muestran todos trabajando y el resumen de sueldos

### Ejemplo de salida

```
Introduce el nombre del concesionario: Concesionario AutoPlus

Creación de empleados...
Empleado 1: Tipo (1. Vendedor, 2. Mecánico, 3. Gerente)
Nombre: Juan Pérez
Vendedor creado correctamente.

¡A trabajar!
🚗 Vendedor Juan Pérez → El vendedor está atendiendo a clientes y mostrando los coches.
🔧 Mecánico 1 → El mecánico está revisando y reparando los coches.
👔 Gerente 1 → El gerente está supervisando el concesionario y coordinando al equipo.

💰 Resumen de sueldos:
Vendedores: XXXX €
Mecánicos: YYYY €
Gerentes: ZZZZ €
Total de sueldos: XXXXX €
```

---

## 🛠️ Tecnologías

- **Java** (JDK 17+)
- **NetBeans IDE**
- POO: herencia, abstracción, interfaces, polimorfismo

---

## 👤 Autor

**ignac** — Prueba Evaluativa RA7 · Departamento de Informática
