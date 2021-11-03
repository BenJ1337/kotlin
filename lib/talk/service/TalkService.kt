package lib.talk.service

import lib.talk.domain.Person

class TalkService {
    companion object {
        fun goodbye(person: Person) {
            println("${person.name} say's goodbye")
        }
    }
}