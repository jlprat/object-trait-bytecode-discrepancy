package example

object ObjectClassPair {
  val Constant: String = "Some Text"
}

// In Scala 2.13 and Scala 3.0 this class bytecode will carry over
// any val and def defined in the object with the same name
class ObjectClassPair(notRelevant: String) {
  val method: String = "bye"
}
