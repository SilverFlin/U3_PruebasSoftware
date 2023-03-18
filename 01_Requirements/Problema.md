# Editando mundos 
Editando mundos es una editorial nacional que se dedica a editar publicaciones para revistas y libros.


La editorial desea la construcción de un aplicativo que le permita gestionar las publicaciones que comercializa, las cuales pueden ser <span style = "color:red;">fisicas (impresas) o digitales (e pub).</span>


A cada publicación (ej.Listas y más listas), se le asigna un <span style = "color:red;">único autor (un autor si puede tener muchas publicaciones)</span>, para el cual se registra: su <span style = "color:red;">nombre, edad, nacionalidad.</span>


Para ellas, su <span style = "color:red;">costo de producción es una cantidad entera</span>, que se obtiene aplicando el valor de \$300/pagina, pero este valor disminuye a \$200/pagina, si la publicación tiene más de 300 páginas; y su valor de venta inicial, se obtiene aplicando un incremento del 15% o 25% sobre el costo de producción, dependiente respectivamente, si la nacionalidad del autor es "mexicano" o diferente.

De las publicaciones fisicas, es necesario almacenar el <span style = "color:red;">nombre del libro y la pagina inicial desde la cual aparecerá</span> (ej. La publicación Lista y más listas aparece en el libro hablando de programación, a partir de la página 240); su <span style = "color:red;">costo de producción y su costo de venta.</span>

De las publicaciones digitales, es necesito almacenar su<span style = "color:red;"> tamaño en megas </span>(ej. 1.2).de ellas, se puede determinar <span style = "color:red;">su densidad </span>(DENSA o NO DENSA), que se cumple cuando el tamaño es superior a 5.5 megas y tiene más de 10 páginas; su costo de producción y su valor de venta, el cual se obtiene aplicando un incremento del 10% o 15% sobre el costo de producción, dependiendo respectivamente, de que se cumpla o no, que su tamaño sea inferior o igual a 2.5 megas.


Es necesario que <span style = "color:red;">los autores solo se puedan registrar una sola vez.</span>Pero siempre se deben de poder registrar nuevas publicaciones y asociarlas a un autor.

El aplicativo también debe tener un apartado para <span style = "color:red;">cotizaciones</span>, el cual su única función es calcular el costo de venta para cierta publicación y mostrarla en pantalla.
Esto con la finalidad de mostrar al cliente cual sería el costo de la publicación antes de iniciar la producción.
Si el cliente acepta el costo se procedería a guardar la información en el sistema, en caso contrario no debería almacenar nada.