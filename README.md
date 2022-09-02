# Terminal

Para compilar
> 1. javac Person.java
> 2. javac Operaciones.java
> 3. javac Operaciones

para usarlo escribir (El primer punto es la pocision en el arreglo y el segundo punto es el arreglo)
> - 2
> - 1 2 5


## Diagrama de Flujo

```mermaid
flowchart TD
    A([Inicio]) --> B[Operaciones en Ventanilla]
    B --> C{Hay mas personas}
    C -- Si ----> D[Formarse en la Fila]
    D --> C
    C -- No ----> E[Realizar operacion]
    E --> F{Realizar otra operacion}
    F -- Si ----> C
    F --No ----> G[Operaciones completas]
    G --> H((FIN))
    
```

## Diagrama de flujo del algoritmo
![Basic Flowchart](https://user-images.githubusercontent.com/23283111/188243201-5720a0ac-1403-468f-a741-54005cf11fd6.png)


## Programa en CMD
![Screenshot_20220902_160825](https://user-images.githubusercontent.com/23283111/188236629-b10115a0-490a-4607-8f87-ba708f396c20.png)

## Notacion Big O
O(2n): exponencial

## ¿Por qué el color de BBVA es AZUL?
> Porque asi lo ha sido desde 1969.

