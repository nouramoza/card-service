This is The Implementation of CardService

for starting project please follow the steps:

http://localhost:8081/swagger-ui.html

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


searchCardNotFound:
{
    "nationalCode":"2064865391",
    "accountNumber":"3620198454",
    "issuerCode":"121111",
    "issuerName":"Markazi",
    "cardType":"CREDIT"
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