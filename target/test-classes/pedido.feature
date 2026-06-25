Feature: Realizar pedido en supermercado

Scenario: Pedido exitoso

  Given un carrito con productos por un total de 100 Bs
  When el cliente confirma el pedido
  Then el pedido es aprobado
  And el total registrado es 100 Bs

Scenario: Pedido con carrito vacío

  Given un carrito vacío
  When el cliente confirma el pedido
  Then el pedido es rechazado