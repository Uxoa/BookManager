# 📚 📚 📚 BookManager JAVA 📚 📚 📚 

Aplicación de consola para gestionar una colección de libros. Permite añadir, listar y eliminar libros a través de un menú interactivo.

## Estructura del Proyecto

- `Main.java`: Punto de entrada del programa.
- `Application.java`: Controla el flujo del programa y el menú principal.
- `BookManager.java`: Maneja la lógica de negocio para gestionar libros (añadir, eliminar).
- `BookConsoleView.java`: Interfaz de usuario para la consola.
- `Book.java`: Representa un libro con `isbn`, `title` y `author`.

## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/tuusuario/proyecto-gestion-libros.git
    cd proyecto-gestion-libros
    ```
2. Abre el proyecto en tu IDE y ejecuta `Main.java`.

## Uso

1. Ejecuta `Main.java` y sigue el menú:
   - **1. Añadir libro**: Requiere un ISBN (formato: una letra mayúscula y tres números, ej. `A123`), título y autor.
   - **2. Ver todos los libros**: Lista los libros en la colección.
   - **3. Borrar libro**: Elimina un libro por ISBN.
   - **4. Salir**: Cierra el programa.

## Escalabilidad y Refactorización

El proyecto está diseñado de forma modular:
- **Separación de Responsabilidades**: `BookManager` (lógica de negocio) y `BookConsoleView` (interfaz de usuario).
- **Validación de ISBN**: Verifica el formato `A123` y muestra un error si no es válido.
- **Control de Excepciones**: Gestión de errores para mejorar la experiencia del usuario.

## Futuras Mejoras

- Búsqueda y edición de libros.
- Persistencia de datos en archivo o base de datos.
- Interfaz gráfica (JavaFX o Swing).
- Pruebas unitarias para asegurar la calidad del código.
