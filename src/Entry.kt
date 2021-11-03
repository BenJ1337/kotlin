import lib.talk.service.TalkService
import lib.talk.domain.Person
import lib.service.HelloService

class Entry{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val otto = Person("Otto")
            TalkService.goodbye(otto)
            val peter = Person("Peter")
            HelloService.hello(peter)
        }
    }
}