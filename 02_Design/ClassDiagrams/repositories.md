# Diagrama de Clase: org.itson.repositories

```mermaid
classDiagram

class RepositoryBase ~T~ {
    # EntityManager entityManager
    - Class~T~ type;

    agregar(T entity): T
    actualizar(T entity): T
    eliminar(T entity): void
    obtener(Long id): T

    lista(): List~T~
}

class AdministradoresRepository ~Administrador~ 

class AutoresRepository ~Autor~

class PublicacionesDigitalesRepository ~PublicacionDigital~

class PublicacionesFisicasRepository ~PublicacionFisica~


RepositoryBase  <|-- AdministradoresRepository
RepositoryBase  <|-- AutoresRepository
RepositoryBase  <|-- PublicacionesDigitalesRepository 
RepositoryBase  <|-- PublicacionesFisicasRepository 
```