# Kotlin

## Download

https://github.com/JetBrains/kotlin/releases/tag/v1.5.31

## Configuration

### Set PATH in cmd to Kotlin compiler bin directory
```
SET PATH=%PATH%;C:\Users\user123\Desktop\kotlin\kotlin-compiler-1.1.2-2\kotlinc\bin
```

## Compiling Codes as Executable Jar file
```
kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar
```
### Run a kotlin application
```
java -jar HelloWorld.jar
```
```
kotlin -classpath HelloWorld.jar HelloWorldKt
```

## Compiling Codes as a library
```
kotlinc HelloWorld.kt -d HelloWorld.jar
```
    
## Compile Code of a folder an excecute it 
```
kotlinc play/ -include-runtime -d play.jar && java -jar play.jar
```

