package alien.memory

import alien.memory.layout.{:=, <>:, >>:, Aligned, DynamicHead, DynamicStruct, DynamicUnion, Layout}
import alien.memory.typelevel.pow2.*

trait LowLevelImplicits {

  implicit def alignedUnwrapNamed[L <: Layout, L1 <: Layout, N <: Singleton & String, B <: Pow2](
      implicit
      unwrap0: Unwrap[L, N := L1]): Unwrap[Aligned[L, B], N := L1] = l => unwrap0(l.inner)

  implicit def alignedUnwrapUp[L <: Layout, L1, B <: Pow2](
      implicit
      unwrap0: Unwrap[L, L1]): Unwrap[Aligned[L, B], L1] = l => unwrap0(l.inner)

  implicit def alignedUnwrapDown[L <: L1, L1 <: Layout, B <: Pow2]: Unwrap[Aligned[L, B], L1] = _.inner

  implicit def recurseSUnwrapNamed[L <: DynamicStruct, N <: String & Singleton, L1 <: Layout, Head <: :=[?, ?]](
      implicit
      unwrap: Unwrap[L, N := L1]): Unwrap[>>:[Head, L], N := L1] = s => unwrap(s.tail)

  implicit def recurseSUnwrap[L <: DynamicStruct, L1, Head <: :=[?, ?]](
      implicit
      unwrap: Unwrap[L, L1]): Unwrap[>>:[Head, L], L1] = s => unwrap(s.tail)

  implicit def recurseUUnwrapNamed[L <: DynamicUnion, N <: String & Singleton, L1 <: Layout, Head <: :=[?, ?]](
      implicit
      unwrap: Unwrap[L, N := L1]): Unwrap[<>:[Head, L], N := L1] = s => unwrap(s.tail)

  implicit def recurseUUnwrap[L <: DynamicUnion, L1, Head <: :=[?, ?]](
      implicit
      unwrap: Unwrap[L, L1]): Unwrap[<>:[Head, L], L1] = s => unwrap(s.tail)

  implicit def headUnwrap[L <: Layout, N <: String & Singleton, L1 <: Layout](
      implicit
      ev: L <:< DynamicHead[N := L1]): Unwrap[L, N := L1] = l => ev(l).head

  implicit def namedUnwrap[L <: (N := L1), N <: String & Singleton, L1 <: Layout]: Unwrap[L, L1] = _.nested

  implicit def identityUnwrap[L, L1](
      implicit
      ev: L <:< L1): Unwrap[L, L1] = ev(_)

}
