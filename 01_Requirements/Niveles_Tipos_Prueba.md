
# Niveles y tipos de prueba

## Componentes

- Unitarias
    - Se necesitarían probar los componentes encargados de:
        - Agregar publicación 
            - Física
            - Digital
        - Consultar publicación
            - Física
            - Digital
        - Actualizar publicación
            - Física
            - Digital
        - Eliminar publicación
            - Física
            - Digital
        - Agregar autor 
        - Consultar autor
        - Actualizar autor
        - Eliminar autor
        - Cotizar publicacion
        - Calcular precio produccion
        - Calcular precio venta
        - Crear usuario
        - Validar credenciales

Para los componentes relacionados con calcular precios se estaría aplicando pruebas de caja blanca y flujo de control.

### Estructurales

## Integracion
-Una vez que se hayan realizado las pruebas de componentes, se sugiere realizar pruebas de integración, para la estrategia de integración, se podría optar por una estrategia incremental donde se vayan integrando los componentes por etapas.

## Sistema
-Para el nivel de prueba del sistema, se necesitará realizar pruebas integrando ya la base de datos, se sugiere aplicar pruebas de rendimiento y estrés para asegurar que el sistema pueda manejar una carga de usuarios.

## Aceptacion
-Para el nivel de prueba de aceptación, se podría realizar una revisión de requisitos y una prueba beta donde se invite a un grupo de usuarios a probar el sistema y proporcionar comentarios.

## Tecnincas 
-Pruebas de caja negra: Para asegurar que el sistema cumpla con los requisitos funcionales especificados.
-Pruebas de caja blanca: Para asegurar que el sistema cumpla con los requisitos no funcionales y la calidad del código.
-Pruebas de flujo de control: Para asegurar que todas las posibles rutas de código hayan sido cubiertas.
-Pruebas de regresión: Para asegurar que los cambios realizados no hayan afectado la funcionalidad existente.
-Pruebas de rendimiento y estrés: Para asegurar que el sistema pueda manejar una carga de usuarios.
-Pruebas de seguridad: Para asegurar que el sistema sea seguro y no existan vulnerabilidades de seguridad.
