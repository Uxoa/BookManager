# Tech Books Manager App

## Objetivos de aprendizaje

- Introducirnos a Java y a la OOP
- Desarrollar un proyecto incremental
- Empezar a aplicar técnicas de refactorización
- Acercarnos poco a poco a la arquitectura y a patrones de diseño usados en Spring
- Incluir algunos tests unitarios

## **Descripción General**

El proyecto consiste en crear una aplicación de consola en Java que permita a los usuarios gestionar una colección de libros técnicos de programación.

La aplicación debe ofrecer una interfaz interactiva en la consola que permita realizar las siguientes operaciones:

1. **Ver todos los libros**
2. **Añadir un nuevo libro**
3. **Eliminar un libro**
4. **Salir de la aplicación**

---

# User Stories

### **Historia de Usuario 1: Ver el Menú Principal**

**Como** usuario, **quiero** ver un menú en la consola con opciones para añadir, ver y eliminar libros, **para** poder gestionar mi colección de libros técnicos de programación.

**Criterios de Aceptación:**

- **Escenario 1:** Al iniciar la aplicación, se muestra un menú con las siguientes opciones:

    ```markdown
    Gestor de Libros Técnicos de Programación
    1. Añadir libro
    2. Ver todos los libros
    3. Eliminar libro
    4. Cambiar repositorio
    5. Salir
    Seleccione una opción:
    ```

- **Escenario 2:** Si el usuario ingresa un número válido se debe mostrar la opción requerida y volver a mostrar el menú principal

    ```bash
    Opción 1: Ver todos los libros:
    ---
    Gestor de Libros Técnicos de Programación
    1. Añadir libro
    2. Ver todos los libros
    3. Eliminar libro
    4. Cambiar repositorio
    5. Salir
    Seleccione una opción:
    ```

- **Escenario 3:** Si el usuario ingresa una opción inválida (por ejemplo, un número fuera del rango o un carácter no numérico), el sistema mostrará el mensaje:

    ```bash
    Opción inválida. Por favor, seleccione una opción del 1 al 5.
    ---
    Gestor de Libros Técnicos de Programación
    1. Añadir libro
    2. Ver todos los libros
    3. Eliminar libro
    4. Cambiar repositorio
    5. Salir
    Seleccione una opción:
    ```

  Luego, el menú se mostrará nuevamente.