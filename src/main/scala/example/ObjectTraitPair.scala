package example

object ObjectTraitPair {
  val Constant: String = "Some Text"
}

// In Scala 2.13 this class bytecode will carry over
// any val and def defined in the object with the same name
// but not in Scala 3.0
trait ObjectTraitPair {
  val method: String = "bye"
}
