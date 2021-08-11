@Purchases
Business Need: purchases anonymous
  As a digital product manager
  I want users to be able to make purchases
  without having to log in

  Background:
    Given Alex is a non-loyal customer and needs to place an order
    And he searches, adds his products and buys now
      | sku           | presentation | quantity |
      | panadol 500mg | Caja         | 2        |
    #  | panadol 500mg    | Unidad       | 3        |
    And he enters his personal data
      | firstName | lastName | motherLastName | typeDocument | numberDocument | cellPhone | email               |
      | Alexander | Garcia   | Palacios       | DNI          | 71333594       | 957281145 | alexcgp94@gmail.com |

  @purchasePaymentPos
  Scenario Outline: purchases payment pos
    And he enters his address "<address>" and type of delivery
    And he chooses a payment method "<paymentMethode>"
    When he finalizes his purchase accepting the terms and conditions
    Then he should see the following message:
      """
      Tu pedido ha sido realizado satisfactoriamente. Te notificaremos cuando esté Programado
      """
    Examples:
      | address                         | paymentMethode |
      | Óvalo de Miraflores 154         | POS            |
      | Av Raul Ferrero 140 Molina, RET | POS            |

  @purchasePaymentCash
  Scenario Outline:  purchases payment cash
    And he enters his address "<address>" and type of delivery
    And he chooses a payment method "<mount>"
    When he finalizes his purchase accepting the terms and conditions
    Then he should see the following message:
        """
        Tu pedido ha sido realizado satisfactoriamente.
       """
    Examples:
      | address                 | mount |
      | Óvalo de Miraflores 154 | 200   |


  @purchasePaymentCard
  Scenario Outline:  purchases payment card
    And he enters his address "<address>" and type of delivery
    And he chooses a payment method "<paymentMethode_Card>"
    And he chooses an online payment card <card_Online>
    When he finalizes his purchase accepting the terms and conditions
    And he records his card details
      | cardNumber | date | CVV | name | lastname | email                        |
      | 3712       | 0322 | 111 | nats | ramos    | lorenaramosramirez@gmail.com |
    Then he should see the following message:
        """
        Tu pedido ha sido realizado satisfactoriamente.
       """
    Examples:
      | address                 | paymentMethode_Card | card_Online |
      | Óvalo de Miraflores 154 | PAYONLINE           | AMEX        |


