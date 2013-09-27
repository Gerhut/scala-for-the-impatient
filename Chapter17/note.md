- `T <: P` means `T extends P` exists.
- `T >: R` means `R extends T` exists.
- `T <% P` means:
  - `T extend P` exists, or
  - `implicit (T) => S` and `S extend P` exists.
- `T : M` means `M[T]` needed.
- `T : Manifest` means `Array[T]` needed.


- `(implicit ev: T =:= U)` means `T` is `U`.
- `(implicit ev: T <:< U)` means `T extends U` exists.
- `(implicit ev: T <%< U)` means
  - `T extends U` exists, or
  - `implicit (T) => S` and `S extends U` exists.

- `C[+T]` means `R extends T` => `C[R] extends C[T]`
- `C[-T]` means `R extends T` => `C[T] extends C[R]`
