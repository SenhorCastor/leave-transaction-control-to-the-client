# leave-transaction-control-to-the-client
Minimal project where I tackle the challenge of maintaining invariants on two entities of a model

For a description of the project, go to [Let transaction control to the client](https://medium.com/@fernandoamartin) Medium Story.

## Main classes

[App](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/app/src/main/kotlin/App.kt), where dependencies are injected and flow is triggered.  

[Repos](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/tree/main/repos/src/main/kotlin/io/repos), Mongo implementation of the repos.  

[Transaction](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/tree/main/transaction/src/main/kotlin/io/transaction/mongo), Mongo implementation of transaction.  

[Use Cases](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/tree/main/usecases/src/main/kotlin/io/usecases), where the domain logic resides.   
[Entities](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/tree/main/entities/src/main/kotlin/io/entities). 

## Layer Dependency

[App])(https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/app/build.gradle.kts). 

[Repos](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/app/build.gradle.kts). 

[Transaction](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/transaction/build.gradle.kts). 

[Use Cases](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/usecases/build.gradle.kts). 

[Entities](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/entities/build.gradle.kts). 


In hindsight, Transaction and Repos should be in the same module

## Diagrams

![Layererd Architecture](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/readme/LayeredArchitectureLet.jpg)

![UML Diagram](https://github.com/SenhorCastor/leave-transaction-control-to-the-client/blob/main/readme/UMLLeave.jpg)

