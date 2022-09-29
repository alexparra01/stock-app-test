# Stock Test App

##Architecture
The architecture implemented in the project is Clean Architecture which is divided in three layouts:
    - Data
    - Domain
    - Presentation

- On the data layout is where the external dependencies are located like remote data source which is in charge of calling external
  endpoints
- Domain layout holds models, repository contract and use cases(interactors) when they manipulate business logic
- Presentation layout shows 

## Trade Offs

- I didn't have any particular trade off

## Run Project

The project runs by using Android Studio 

## Libraries

- Retrofit: This library is mostly to make http calls
- Moshi: Json parser
- Dagger Hilt: Dependency injection
- Navigation
- Androidx life cycle libraries for coroutines

## Additional Information