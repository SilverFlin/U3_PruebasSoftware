# Diagrama de Clase: org.itson.dominio

```mermaid
classDiagram


    %% Relations
    Publicacion *-- Autor
    Publicacion <|-- PublicacionDigital
    Publicacion <|-- PublicacionFisica
    Usuario <|-- Administrador
    Usuario <|-- Cliente
    Cliente <|-- Autor
    Autor *-- Nacionalidad 
     MetodoPago <|-- PagoTarjeta
    MetodoPago <|-- PagoEfectivo
    MetodoPago <|-- PagoDeposito
    Pago *-- MetodoPago
    Pago *-- EstadoPago
    Pago *-- DivisionPago
    Publicacion *-- Pago


    %% Classes
    class Autor{
     -int edad
     -Nacionalidad nacionalidad
     -List~Publicacion~ publicaciones

     +getEdad() int
     +setEdad(int edad) void
     +getNacionalidad() String
     +setNacionalidad(Nacionalidad nacionalidad) void
     +getPublicaciones() List~Publicacion~

     +agregarPublicacion(Publicacion publicacion) void
    }

    class  Publicacion{
        -Long id 
        -String titulo
        -Integer costoProd
        -Integer costoVenta
        -Autor autor
        -Pago pago

        +getId() Long
        +setId(Long id): void
        +getTitulo() string
        +setTitulo(String titulo) void
        +getCostoProd() Integerk
        +setCostoProd(Integer costoVenta) void
        +getCostoVenta() Integer
        +setCostoVenta(Integer costoVenta) void
        +getAutor() Autor
        +setAutor(Autor autor) void
    }



    class Pago{
        -Cliente cliente
        -MetodoPago metodoPago
        -Date fechaPago
        -EstadoPago estado
        -DivisionPago divisionPago
        
    }

    class EstadoPago{
        <<enumeration>>
        PAGADO,
        PENDIENTE
    }

    class DivisionPago{
        <<enumeration>>
        PAGO_UNICO,
        DOS_PAGOS
    }

    

    class MetodoPago{
        -Long id        
        -Double monto
    }

    class PagoTarjeta{

    }
    class PagoEfectivo{

    }
    class PagoDeposito{

    }

   



    class PublicacionFisica{
        -int paginaInicial

        +getPaginaInicial() int
        +setPaginaInicial(int paginaInicial) void
    }

    class PublicacionDigital{
        -boolean isDensa
        -Double sizeMegas
    
        +IsDensa() boolean
        +setDensa() void
        +getSizeMegas() Double
        +setSizeMegas(Double sizeMegas) void
    }

    class Usuario{
        -Long id
        -String username
        -String password

        +getId() Long
        +setId(Long id): void
        +getUsername() String
        +setUsername(String username) void
        +getPassword() String
        +setPassword(String password) void
    }

    class Cliente{
        -String nombre
        -String email
        -String telefono
        -Direccion direccion
        -List~Pago~ pagos

        +getNombre() String
        +setNombre(String nombre) void
        +getEmail() String
        +setEmail(String email) void
        +getTelefono() String
        +setTelefono(String telefono) void
        +getDireccion() Direccion
        +setDireccion(Direccion direccion) void
    }

    class Administrador{
        
    }

    class Nacionalidad{
        <<enumeration>>
        CANADIENSE
        ESTADOUNIDENSE
        MEXICANO
    }
```
---
### Notas
`Nacionalidad` se manejará como un enumerador, ya que es una aplicación pequeña, pero sería mejor usar algún XML/JSON que contenga todas las nacionalidades y solo cargarlas al iniciar la aplicación, generando algún tipo de caché para evitar cargar cada que se abre.
