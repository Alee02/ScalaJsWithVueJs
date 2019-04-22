package hello

import org.scalajs.dom

import scala.scalajs.js.JSApp
import dom.document
import org.scalajs.dom.raw.{Element, Text}

object HelloScalaJs extends JSApp{
  override def main(): Unit = {
    println("Hello Scala.js")
    appendHello(document.body, "Hello Scala.js")
  }

  def appendHello(targetNode: dom.Node, text: String): Unit = {
    val titleNode: Element = document.createElement("h2")
    val textNode: Text = document.createTextNode(text)
    titleNode.appendChild(textNode)
    targetNode.appendChild(titleNode)
  }
}
