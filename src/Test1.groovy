/* Hello World in Groovy */


String s1 = "my string"
def a = ["j", "j"]

cl1 =  { println "Class: ${it.getClass().getName()}, Value:  $it"}


[s1, a].collect cl1
s1  = a

[s1, a].collect cl1

def name = "none"
c = {
    s = "${it} is after $name"
    name = it.toString()
    if (name != "one")  {
        s
    } else {
        "boo"
    }
}


def origList = ["one", "two", "three"]
def newList =  origList.collect(c)


println ""
origList.each {println "$it"}
println ""
origList.eachWithIndex{entry, i ->  println "$i=$entry"}
println ""
println(newList)


println ""
println ([1, 2, 3] + (4 + 5) - 1)