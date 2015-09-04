// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 51:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;

public final class E extends Message<E> {
  private static final long serialVersionUID = 0L;

  public static final G DEFAULT_G = G.FOO;

  @ProtoField(
      tag = 1
  )
  public final F f;

  @ProtoField(
      tag = 2,
      type = Message.Datatype.ENUM
  )
  public final G g;

  public E(F f, G g) {
    this.f = f;
    this.g = g;
  }

  private E(Builder builder) {
    this(builder.f, builder.g);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof E)) return false;
    E o = (E) other;
    return equals(f, o.f)
        && equals(g, o.g);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = f != null ? f.hashCode() : 0;
      result = result * 37 + (g != null ? g.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<E, Builder> {
    public F f;

    public G g;

    public Builder() {
    }

    public Builder(E message) {
      super(message);
      if (message == null) return;
      this.f = message.f;
      this.g = message.g;
    }

    public Builder f(F f) {
      this.f = f;
      return this;
    }

    public Builder g(G g) {
      this.g = g;
      return this;
    }

    @Override
    public E build() {
      return new E(this);
    }
  }

  public static final class F extends Message<F> {
    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_I = 0;

    @ProtoField(
        tag = 1,
        type = Message.Datatype.INT32
    )
    public final Integer i;

    public F(Integer i) {
      this.i = i;
    }

    private F(Builder builder) {
      this(builder.i);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof F)) return false;
      return equals(i, ((F) other).i);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = i != null ? i.hashCode() : 0);
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<F, Builder> {
      public Integer i;

      public Builder() {
      }

      public Builder(F message) {
        super(message);
        if (message == null) return;
        this.i = message.i;
      }

      public Builder i(Integer i) {
        this.i = i;
        return this;
      }

      @Override
      public F build() {
        return new F(this);
      }
    }
  }
}
