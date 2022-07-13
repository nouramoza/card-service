This is The Implementation of CardService

for starting project please follow the steps:

http://localhost:8081/swagger-ui.html

API: card-controller : Card Controller // addCard ==>
 
addCard:
{
    "nationalCode":"9802736251",
    "accountNumber":"4938372617",
    "issuerCode":"716671",
    "issuerName":"Hamedan",
    "cardType":"CASH"
}


addDuplicateCard:
{
    "nationalCode":"2064865391",
    "accountNumber":"3620198454",
    "issuerCode":"121111",
    "issuerName":"Markazi",
    "cardType":"CREDIT"
}

API: card-controller : Card Controller // getCard ==>

searchCardNotFound:
{
    "nationalCode":"2064865391",
    "cardNumber":"6280231451904303",
    "cardType":"CASH",
    "issuerCode":"121111"
}


searchCardNotActive:
{
    "nationalCode":"2064865391",
    "cardNumber":"6280231451904123",
    "cardType":"CASH",
    "issuerCode":"121111"
}


searchCardExpired:
{
    "nationalCode":"2064865391",
    "cardNumber":"6280231487654567",
    "cardType":"CASH",
    "issuerCode":"121111"
}
