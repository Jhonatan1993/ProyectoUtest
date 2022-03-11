#language:es
#Autor: Jhonatan Paternina Rojas

@HU
Característica: Pagina web Utest
  Como usuario, quiero acceder a la web Utest
  para realizar el registro en la pagina
  y verificar que se carga en pantalla el texto Welcome to the world's largest community of freelance software testers!

  @Escenario
  Esquema del escenario: Escenario: Escenario: Realizar el Registro en la web utest

    Dado que Jhonatan quiere registrarse en la pagina utest

    Cuando el realiza el registro del mismo en la pagina web utest
      | nombre   | apellido   | correo   | idioma   | ciudad   | codigo_postal   | pais   | computador   | version   | idioma2   | dispositivo_mobil   | modelo   | sistema_operativo   | password   | confirm_password   |
      | <nombre> | <apellido> | <correo> | <idioma> | <ciudad> | <codigo_postal> | <pais> | <computador> | <version> | <idioma2> | <dispositivo_mobil> | <modelo> | <sistema_operativo> | <password> | <confirm_password> |


    Entonces verifica que se presente en pantalla el mensaje
      | texto   |
      | <texto> |

    Ejemplos:
      | nombre   | apellido  | correo                  | idioma  | ciudad   | codigo_postal | pais     | computador | version | idioma2 | dispositivo_mobil | modelo        | sistema_operativo | password    | confirm_password | texto                                                                   |
      | Jhonatan | Paternina | jhonatanpater122@gmail.com | Spanish | Montería | 230003        | Colombia | Linux      | Fedora  | Spanish | Motorola          | Moto G8 Power | Android 11        | 123654987Jp | 123654987Jp      | Welcome to the world's largest community of freelance software testers! |

