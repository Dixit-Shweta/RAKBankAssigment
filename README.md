# RAKBankAssigment
Resolved the problem statement for Skiply

Postman Url:

Post : localhost:9091/student   [Add Student]
Get : localhost:9092/receipt/1   [view receipt]
Post: localhost:9092/receipt     [Collect Fees]

Data reference for postman:
Add Student API:
{
        "name": "Shweta",
        "studentID": 145,
        "schoolName": "IRA",
        "grade": "A",
        "mobNumber": 997788999
    }
    
Collect fees API:
{
       "refID": "1",
       "cardNumber": 675487652345 ,
        "cardType": "Visa" ,
        "amount": 600,
        "StudentId":1
    }

Services running at following port:
Student service: 9091
FeeCollection service: 9092
H2 database : 9090

Swagger url:
StudentManagemnet service:   http://localhost:9091/swagger-ui.html
FeeCollection Service:  http://localhost:9092/swagger-ui.html

