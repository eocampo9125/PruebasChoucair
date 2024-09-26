Feature: Ejemplo Login Automatizado
  Yo como aprendiz de automatización
  Necesito realizar un login
  Para tener un ejemplo de una automatización web

  Scenario: Iniciar Sesión
    Given "Juan" desea ir a la página inicial
    When inicia sesión con los datos "Admin" y "admin123"
    Then El usuario da clic en el boton adicionar

