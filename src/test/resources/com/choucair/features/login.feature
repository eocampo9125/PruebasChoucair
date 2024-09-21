Feature: Ejemplo Login Automatizado
  Yo como aprendiz de automatización
  Necesito realizar un login
  Para tener un ejemplo de una automatización web

  Scenario: Iniciar Sesión
    Given "Juan" desea ir a la página inicial
    When inicia sesión con los datos "Admin" y "admin123"
    Then valida que el mensaje inicial sea "Time at Work"


  Scenario: Crear un nuevo empleado
    Given El usuario está en la opción de creación de empleados
    When El usuario ingresa el nombre "Camilo"
    And El usuario ingresa el apellido "Ocampo"
    And El usuario selecciona la vacante
    And El usuario ingresa el correo "ocampo912@hotmail.com"
    And El usuario ingresa el numero de contacto "3213260498"
    And El usuario hace clic en el botón "Add"
    Then El sistema debe almacenar la información del empleado

