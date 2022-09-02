# Terminal
Prueba

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
