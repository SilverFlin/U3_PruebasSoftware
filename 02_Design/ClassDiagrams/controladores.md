# Diagrama de Clase: org.itson.controladores

```mermaid
classDiagram
class ControladorAutor{
    +persistirAutor(Autor autorPersistir) Autor
    +consultaPaginado(ConfiguracionPagoado paginado) List~Autor~
    +eliminarAutor(Autor autor) void
    +modificarAutor(Autor autor) Autor
}

class ControladorPagos{
    +consultaPaginado(ConfiguracionPaginado configPaginado, Cliente cliente) List~Pago~
    +pagar(Pago pago) Pago
}

class ControladorPublicacion{
    +guardarPublicacion(Publicacion publicacion, float costoProduccion) Publicacion
    -persistirSegunTipoPublicacion(Publicacion publicacion) Publicacion
    +consultaPaginado(ConfiguracionPaginado configPaginado) List~Publicacion~
    +editarPublicacion(Publicacion publicacion) void
    +eliminarPublicacion(Publicacion publicacion) void
    -isDensa(int numPaginas, float tamaño) boolean
}

class ControladorUsuario{
    +persistirCliente(Cliente cliente) Cliente
    +persistirAdministrador(Administrador administrador) Administrador
    +persistirAutor(Autor autor) Autor
}


```