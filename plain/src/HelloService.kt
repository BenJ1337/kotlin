package lib.service

import lib.talk.domain.Person

class HelloService {
    companion object {
        fun hello(person: Person) {
            println("${person.name} says hello")
        }
    }
}