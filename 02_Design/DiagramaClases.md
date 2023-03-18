# Diagramas de Clase

```mermaid
classDiagram

    Publicacion *-- Autor
    Publicacion <|-- PublicacionDigital
    Publicacion <|-- PublicacionFisica

    class Autor
    Autor : -String nombre
    Autor : -int edad
    Autor : -String nacionalidad
    Autor : -List~Publicacion~ publicaciones

    Autor : +getNombre() String
    Autor : +setNombre() void
    Autor : +getEdad() int
    Autor : +setEdad() void
    Autor : +getNacionalidad() String
    Autor : +setNacionalidad() void
    Autor : +getPublicaciones() List~Publicacion~

    Autor : +agregarPublicaciones() void


    class Publicacion
    Publicacion : -String titulo
    Publicacion : -Integer costoProd
    Publicacion : -Integer costoVenta
    Publicacion : -Autor autor

    Publicacion : +getTitulo() string
    Publicacion : +setTitulo() void
    Publicacion : +getCostoProd() Integer
    Publicacion : +setCostoProd() void
    Publicacion : +getCostoVenta() Integer
    Publicacion : +setCostoVenta() void
    Publicacion : +getAutor() Autor
    Publicacion : +setAutor() void

    Publicacion : -calcularCostoProd() void
    Publicacion : -calcularCostoVenta() void

    class PublicacionFisica
    PublicacionFisica : -int paginaInicial

    PublicacionFisica : -getPaginaInicial() int
    PublicacionFisica : -setPaginaInicial() void
    PublicacionFisica : -calcularCostoVenta() void

    class PublicacionDigital
    PublicacionDigital : -boolean isDensa
    PublicacionDigital : -Integer tamanhoMegas
    
    PublicacionDigital : -getIsDensa() boolean
    PublicacionDigital : -setIsDensa() void
    PublicacionDigital : -calcularCostoVenta() void


    class Cotizacion
    Cotizacion : +calcularCostoVenta() Integer
```

