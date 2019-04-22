enablePlugins(ScalaJSPlugin)
enablePlugins(WorkbenchPlugin)
name := "ScalaJsWithVueJs"

version := "1.0"

scalaVersion := "2.12.2"

scalaJSUseMainModuleInitializer := true
workbenchDefaultRootObject := Some(("src/main/Web/index.html", "Web/"))
workbenchStartMode := WorkbenchStartModes.OnCompile
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"