def name = "Script"

def getMe() {getClass().getName()}


class Person {
    String name = "person"

    def getMe() {getClass()}
}
class Thing {
    String name = "thing"

    def getMe() {getClass()}
}


cl = {println "name=$name,   class=${getMe()}"}


cl()
cl.delegate = new Person()
cl()
cl.resolveStrategy = Closure.DELEGATE_FIRST
cl()
cl.delegate = new Thing()
cl()
