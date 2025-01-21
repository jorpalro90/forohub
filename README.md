# Forohub

Forohub es una API REST desarrollada en Java utilizando Spring Boot. Esta aplicación permite gestionar tópicos mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar), con funcionalidades de autenticación y autorización mediante JWT.

## Características

- CRUD para gestión de tópicos.
- Autenticación y autorización mediante JWT.
- Integración con una base de datos MySQL.
- Validaciones de datos para garantizar la integridad.
- Formato de datos en JSON para peticiones y respuestas.

---

## Requisitos previos

1. **Java 11 o superior**: Asegúrate de tener instalado Java en tu sistema.
2. **Maven**: Administrador de dependencias para el proyecto.
3. **MySQL**: Base de datos para almacenar los tópicos.
4. **Insomnia o Postman**: Cliente HTTP para probar la API.

---

## Endpoints de la API

### **1. Crear un nuevo tópico**
- **Método HTTP:** `POST`
- **URL:** `/api/topicos`

**Request JSON:**
```json
{
  "titulo": "Introducción a Spring Boot",
  "descripcion": "Este tópico explica cómo iniciar con Spring Boot",
  "autor": "Jorge Palacio"
}
```

**Response JSON (Ejemplo):**
```json
{
  "id": 1,
  "titulo": "Introducción a Spring Boot",
  "descripcion": "Este tópico explica cómo iniciar con Spring Boot",
  "autor": "Jorge Palacio"
}
```

---

### **2. Mostrar todos los tópicos creados**
- **Método HTTP:** `GET`
- **URL:** `/api/topicos`

**Response JSON (Ejemplo):**
```json
[
  {
    "id": 1,
    "titulo": "Introducción a Spring Boot",
    "descripcion": "Este tópico explica cómo iniciar con Spring Boot",
    "autor": "Jorge Palacio"
  },
  {
    "id": 2,
    "titulo": "Conceptos básicos de JWT",
    "descripcion": "Entender cómo funcionan los tokens JWT en autenticación",
    "autor": "Ana Pérez"
  }
]
```

---

### **3. Mostrar un tópico específico**
- **Método HTTP:** `GET`
- **URL:** `/api/topicos/{id}`

**Response JSON:**
```json
{
  "id": 1,
  "titulo": "Introducción a Spring Boot",
  "descripcion": "Este tópico explica cómo iniciar con Spring Boot",
  "autor": "Jorge Palacio"
}
```

---

### **4. Actualizar un tópico**
- **Método HTTP:** `PUT`
- **URL:** `/api/topicos/{id}`

**Request JSON:**
```json
{
  "titulo": "Introducción avanzada a Spring Boot",
  "descripcion": "Este tópico profundiza en Spring Boot para usuarios avanzados",
  "autor": "Jorge Palacio"
}
```

**Response JSON:**
```json
{
  "id": 1,
  "titulo": "Introducción avanzada a Spring Boot",
  "descripcion": "Este tópico profundiza en Spring Boot para usuarios avanzados",
  "autor": "Jorge Palacio"
}
```

---

### **5. Eliminar un tópico**
- **Método HTTP:** `DELETE`
- **URL:** `/api/topicos/{id}`

**Response JSON:**
```json
{
  "mensaje": "Tópico con id 1 eliminado exitosamente"
}
```

---

## Tecnologías utilizadas

- **Lenguaje:** Java
- **Framework:** Spring Boot
- **Base de datos:** MySQL
- **Autenticación:** JWT
- **Cliente de prueba:** Insomnia/Postman

---

## Ejecución del proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu_usuario/forohub.git
   ```

2. Accede al directorio del proyecto:
   ```bash
   cd forohub
   ```

3. Construye y ejecuta el proyecto con Maven:
   ```bash
   mvn spring-boot:run
   ```

4. Accede a los endpoints utilizando Insomnia, Postman o tu cliente HTTP preferido.

---

## Contribución
Si deseas contribuir a este proyecto, por favor realiza un fork, crea una nueva rama para tus cambios y envía un pull request.

---

## Autor

Desarrollado por **Jorge Palacio** como parte del proyecto "Forohub".

