@Suite

Feature: CP01: Ingreso de propietario

  Background: Ingreso de datos en el formulario

    Given navegacion por el usuario al sitio web

    Scenario: 1 - Ingreso de los campos
      When ingreso de todos los campos
      Then la aplicacion guarda los datos y muestra el nombre de propietario en la lista