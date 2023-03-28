# Diagrama de Clase: org.itson.utils

```mermaid
classDiagram

class Cotizador{
    +calcularCostoVenta(Publicacion publicacion) int
    +calcularCostoProduccion(int numPaginas) int
    -calcularCostoVentaPorPublicacion(float costoProd, Publicacion publicacion) int
    -calcularCostoVentaFisica(int costoProd, PublicacionFisica pubFisica) int
    -calcularCostoVentaDigital(int costoProd, PublicacionDigital pubDigital) int
}

class Encriptador{
    +encriptarPassword(String password) String
    +validarPassword(String passwordCandidato, String passwordHashed) boolean
    +verificarPasswordConHash(String password, String hashedPassword) boolean
}

class Dialogs{
    +mostrarMensajeError(Component componente, String msg) void
    +mostrarMensajeExito(Component componente, String msg) void
    +mostrarMensajeYesNoOption(Component componente, String msg, String titulo)
}
class Validaciones{
    +isPositivo(Double valor) boolean
    +isNull(T elemento) boolean
    +isDouble(String valor) boolean
    +isInteger(String valog) boolean
}

class ValidacionesForm {
    +isValidText(String texto) boolean
}
```