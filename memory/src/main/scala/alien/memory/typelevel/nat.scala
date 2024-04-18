package alien.memory.typelevel

object nat {

  sealed trait Nat {
    self =>
    def value: Long

    final def unary_+ : ++[self.type] = ++(self)
  }

  case object Zero extends Nat {
    override val value = 0L
  }

  case class ++[D <: Nat](d: D) extends Nat {

    override lazy val value: Long = 1L + d.value

    final def unary_- : D = d
  }

  trait NatConstants {
    val `0`: `0` = Zero
    type `0`  = Zero.type
    type `1`  = ++[`0`]
    type `2`  = ++[`1`]
    type `3`  = ++[`2`]
    type `4`  = ++[`3`]
    type `5`  = ++[`4`]
    type `6`  = ++[`5`]
    type `7`  = ++[`6`]
    type `8`  = ++[`7`]
    type `9`  = ++[`8`]
    type `10` = ++[`9`]
    type `11` = ++[`10`]
    type `12` = ++[`11`]
    type `13` = ++[`12`]
    type `14` = ++[`13`]
    type `15` = ++[`14`]
    type `16` = ++[`15`]
    type `17` = ++[`16`]
    type `18` = ++[`17`]
    type `19` = ++[`18`]
    type `20` = ++[`19`]
    type `21` = ++[`20`]
    type `22` = ++[`21`]
    type `23` = ++[`22`]
    type `24` = ++[`23`]
    type `25` = ++[`24`]
    type `26` = ++[`25`]
    type `27` = ++[`26`]
    type `28` = ++[`27`]
    type `29` = ++[`28`]
    type `30` = ++[`29`]
    type `31` = ++[`30`]
    type `32` = ++[`31`]
    type `33` = ++[`32`]
    type `34` = ++[`33`]
    type `35` = ++[`34`]
    type `36` = ++[`35`]
    type `37` = ++[`36`]
    type `38` = ++[`37`]
    type `39` = ++[`38`]
    type `40` = ++[`39`]
    type `41` = ++[`40`]
    type `42` = ++[`41`]
    type `43` = ++[`42`]
    type `44` = ++[`43`]
    type `45` = ++[`44`]
    type `46` = ++[`45`]
    type `47` = ++[`46`]
    type `48` = ++[`47`]
    type `49` = ++[`48`]
    type `50` = ++[`49`]
  }

}
