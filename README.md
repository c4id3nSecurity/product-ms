# Product-ms

## Endpoints
- BaseURL: /products
- POST: create()
- GET: getAll()
- GET: /{id}: getById()
- PUT: /{id}: update()
- DELETE: /{id}: inactive()

## Model
```json
{
  "id": 1,
  "name": "Iphone 13 Pro Max",
  "description": "Celular de última geração e tals",
  "price": 6999.90,
  "isAvailable": true
}
```

## Business Rules
- Só é possivel a criação de produtos com preço positivo;
- Não é possivel pesquisar produtos que não estão disponiveis;
- Não é possivel inserir descrições com menos de 50 caracteres;