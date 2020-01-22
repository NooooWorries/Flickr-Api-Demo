## Flickr Image API Demo

### Introduction
This app consist of one activity - show the list of photos returned by Flickr Search Api. 

### Code
This application is written in kotlin. The archiecture of this app is Model - ViewModel - View (MVVM). 
In addition, this app uses dagger 2 for dependency injection, RxJava + Retrofit for internet communication and Room for data persistence.

### Further improvement
This app use RxJava to call API. However, for more complicated cases (such as chain, or switch between threads), coroutines could be a better choice.

### Contact
For more information, please contact czxbnb@gmail.com