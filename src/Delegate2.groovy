def me = "layer 1"


c = {
    println "\nclosure:  $me\nthis:     ${this.getClass()}\nowner:    ${owner.getClass()}\ndelegate: ${delegate.getClass()}"
}



c()


class c1 {
    def me = "layer 2"
    public cl = {
        println "\nclosure:  $me\nthis:     ${this.getClass()}\nowner:    ${owner.getClass()}\ndelegate: ${delegate.getClass()}"
    }

    public Closure en = {
        { me ->
            println "\nclosure:  $me\nthis:     ${this.getClass()}\nowner:    ${owner.getClass()}\ndelegate: ${delegate.getClass()}"
        }
    }


}

new c1().cl "boo"
c3 = new c1().en()
c3("hoo")
