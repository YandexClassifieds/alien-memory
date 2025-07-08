package alien.memory.typelevel

object pow2 {

  sealed trait Pow2 {
    self =>

    def value: Long

    final def unary_^ : ^^[self.type] = ^^(this)
  }

  implicit case object `^Zero` extends Pow2 {
    override def value: Long = 1
  }

  case class ^^[D <: Pow2](d: D) extends Pow2 {

    type Pred = D

    override lazy val value: Long = d.value * 2
  }

  implicit def succ[B <: Pow2](
      implicit
      b: B): ^^[B] = ^^(b)

  trait Pow2Constants {
    val `2^0`: `2^0` = `^Zero`
    type `2^0` = `^Zero`.type
    type `2^1` = ^^[`2^0`]
    type `2^2` = ^^[`2^1`]
    type `2^3` = ^^[`2^2`]
    type `2^4` = ^^[`2^3`]
    type `2^5` = ^^[`2^4`]
    type `2^6` = ^^[`2^5`]
    type `2^7` = ^^[`2^6`]
    type `2^8` = ^^[`2^7`]
    type `2^9` = ^^[`2^8`]
    type `2^10` = ^^[`2^9`]
    type `2^11` = ^^[`2^10`]
    type `2^12` = ^^[`2^11`]
    type `2^13` = ^^[`2^12`]
    type `2^14` = ^^[`2^13`]
    type `2^15` = ^^[`2^14`]
    type `2^16` = ^^[`2^15`]
    type `2^17` = ^^[`2^16`]
    type `2^18` = ^^[`2^17`]
    type `2^19` = ^^[`2^18`]
    type `2^20` = ^^[`2^19`]
    type `2^21` = ^^[`2^20`]
    type `2^22` = ^^[`2^21`]
    type `2^23` = ^^[`2^22`]
    type `2^24` = ^^[`2^23`]
    type `2^25` = ^^[`2^24`]
    type `2^26` = ^^[`2^25`]
    type `2^27` = ^^[`2^26`]
    type `2^28` = ^^[`2^27`]
    type `2^29` = ^^[`2^28`]
    type `2^30` = ^^[`2^29`]
    type `2^31` = ^^[`2^30`]
    type `2^32` = ^^[`2^31`]
    type `2^33` = ^^[`2^32`]
    type `2^34` = ^^[`2^33`]
    type `2^35` = ^^[`2^34`]
    type `2^36` = ^^[`2^35`]
    type `2^37` = ^^[`2^36`]
    type `2^38` = ^^[`2^37`]
    type `2^39` = ^^[`2^38`]
    type `2^40` = ^^[`2^39`]
    type `2^41` = ^^[`2^40`]
    type `2^42` = ^^[`2^41`]
    type `2^43` = ^^[`2^42`]
    type `2^44` = ^^[`2^43`]
    type `2^45` = ^^[`2^44`]
    type `2^46` = ^^[`2^45`]
    type `2^47` = ^^[`2^46`]
    type `2^48` = ^^[`2^47`]
    type `2^49` = ^^[`2^48`]
    type `2^50` = ^^[`2^49`]
    type `2^51` = ^^[`2^50`]
    type `2^52` = ^^[`2^51`]
    type `2^53` = ^^[`2^52`]
    type `2^54` = ^^[`2^53`]
    type `2^55` = ^^[`2^54`]
    type `2^56` = ^^[`2^55`]
    type `2^57` = ^^[`2^56`]
    type `2^58` = ^^[`2^57`]
    type `2^59` = ^^[`2^58`]
    type `2^60` = ^^[`2^59`]
    type `2^61` = ^^[`2^60`]
    type `2^62` = ^^[`2^61`]
  }

}
