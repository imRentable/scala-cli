package scala.cli

import scala.cli.commands._

object ScalaCliCore extends ScalaCliBase {
  def actualDefaultCommand = DefaultCore
  val commands = Seq(
    About,
    Bsp,
    Clean,
    Compile,
    InstallCompletions,
    Repl,
    Package,
    Run,
    Test
  )
}