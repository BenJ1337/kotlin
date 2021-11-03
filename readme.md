# Kotlin

## Download

https://github.com/JetBrains/kotlin/releases/tag/v1.5.31

## Configuration

### Set PATH in cmd to Kotlin compiler bin directory
```
SET PATH=%PATH%;%userprofile%\Downloads\kotlin-compiler-1.5.31\kotlinc\bin
```

## Simple Application wihtout Dependencies
### Code
/src/StandAloneApp.kt
```java
fun main(args: Array<String>) {
    print("I'm here")
}
```
### Compile it as Executable Jar file
```
kotlinc .\src\StandAloneApp.kt -include-runtime -d StandAloneApp.jar
```
### Run it
```
java -jar StandAloneApp.jar
```
### Compile and rund with one line
```
kotlinc .\src\StandAloneApp.kt -include-runtime -d StandAloneApp.jar && java -jar StandAloneApp.jar
```


## Application with Dependencies
### Code
#### Entry point to run the application
/src/Entry.kt
```
import lib.talk.service.TalkService
import lib.talk.domain.Person

class Entry{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val otto = Person("Otto")
            TalkService.goodbye(otto)
        }
    }
}
```
### Compile 
#### create the java library jar
```
kotlinc .\lib\bye\ByeService.kt -d MyLib.jar
```
#### create the executable file
```
kotlinc src/Entry.kt src/Entry.kt -cp MyLib.jar -include-runtime -d Entry.jar
```
### Run it
```
java -cp Entry.jar;MyLib.jar Entry
```
### Compile and run with one line
```
kotlinc .\lib -d MyLib.jar && kotlinc .\src\Entry.kt .\src\HelloService.kt -cp MyLib.jar -include-runtime -d Entry.jar && java -cp Entry.jar;MyLib.jar Entry
```


