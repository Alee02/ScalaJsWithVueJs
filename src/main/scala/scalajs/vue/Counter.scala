package scalajs.vue

import org.scalajs.dom
import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.Any._
import scala.scalajs.js.Dynamic.{literal, global => g}
import scala.scalajs.js.{Dynamic, JSApp}
import scala.scalajs.js.annotation.JSExport
import scalajs.vuejs.Vue
import scalajs.vuejs.Vue

object Counter extends JSApp {

  type VueMethod=js.ThisFunction0[Data,Unit]

  override def main(): Unit = {

    val app = new Vue(
      literal(
        el = "#main",
        data = literal(
          count = 0
        ),
        methods = literal(
          increment = ((data: Data) =>
            data.count += 1 //++ won't work
            ):VueMethod
        )
      )
    )

  }
}

trait Data extends Vue {
  var count: Int = js.native
}
