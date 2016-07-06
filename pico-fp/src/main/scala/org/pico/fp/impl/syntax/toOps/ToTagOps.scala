package org.pico.fp.impl.syntax.toOps

import org.pico.fp._
import org.pico.fp.impl.syntax.ops.{TaggedOps_8cgpMK8, TaggedOps_w8BiA3Y, UntaggedOps_6HPvv4s, UntaggedOps_proPqRs}

import scala.language.{higherKinds, implicitConversions}

trait ToTagOps {
  @inline
  implicit final def taggedOps_8cgpMK8[V, T, F[_]](self: F[V @@ T]): TaggedOps_8cgpMK8[V, T, F] = {
    new TaggedOps_8cgpMK8[V, T, F](self)
  }

  @inline
  implicit final def taggedOps_w8BiA3Y[V, T, F[_, _], A](self: F[A, V @@ T]): TaggedOps_w8BiA3Y[V, T, F, A] = {
    new TaggedOps_w8BiA3Y[V, T, F, A](self)
  }

  @inline
  implicit final def untaggedOps_6HPvv4s[V, F[_]](self: F[V]): UntaggedOps_6HPvv4s[V, F] = {
    new UntaggedOps_6HPvv4s[V, F](self)
  }

  @inline
  implicit final def untaggedOps_proPqRs[V, F[_, _], A](self: F[A, V]): UntaggedOps_proPqRs[V, F, A] = {
    new UntaggedOps_proPqRs[V, F, A](self)
  }
}
