class Foo(val p1: String, val p2: Any?)

var a : Foo = <caret>

// EXIST: { lookupString:"Foo", itemText:"Foo(p1: String, p2: Any?)" }
