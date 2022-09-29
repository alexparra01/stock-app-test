# Stock Test App

## Architecture
The architecture implemented in the project is [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html "Clean Architecture") which is divided in three layouts:

- Data layout -> This layout is where the external dependencies are located like remote data source which is in charge of calling external
  endpoints
- Domain layout -> It holds models, repository contract and use cases(interactors) only when they manipulate business logic (In this project I did not user any use case)
- Presentation layout -> this layout contains activities, fragments, adapters and view models.

#### More references
- [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html "Clean Architecture")
- [Clean Architecture In Android](https://medium.com/android-dev-hacks/detailed-guide-on-android-clean-architecture-9eab262a9011 "Clean Architecture In Android")

## Trade Offs

- The app does not have any particular trade offs 

## Run Project

The project runs by using Android Studio Chipmunk| 2021.2.1 Patch 1
Build #AI-212.5712.43.2112.8609683, built on May 19, 2022

## Libraries

- Retrofit: This library is mostly to make http calls
- Moshi: Json parser
- Dagger Hilt: Dependency injection
- Navigation
- Androidx life cycle libraries for coroutines

For unit testing:
- Mockito

## Additional Information

The app does not have any kind of listener or touch part. It is showing the portfolio by using recyclerview and on the item level the app uses
card view in order to have better visualization of the list.
