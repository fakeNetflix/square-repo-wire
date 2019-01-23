// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: same_name_enum.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireEnum
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

data class OtherMessageWithStatus(val unknownFields: ByteString = ByteString.EMPTY) :
        Message<OtherMessageWithStatus, OtherMessageWithStatus.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
            message = "Shouldn't be used in Kotlin",
            level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(private val message: OtherMessageWithStatus) :
            Message.Builder<OtherMessageWithStatus, Builder>() {
        override fun build(): OtherMessageWithStatus = message
    }

    companion object {
        @JvmField
        val ADAPTER: ProtoAdapter<OtherMessageWithStatus> = object :
                ProtoAdapter<OtherMessageWithStatus>(
            FieldEncoding.LENGTH_DELIMITED, 
            OtherMessageWithStatus::class.java
        ) {
            override fun encodedSize(value: OtherMessageWithStatus): Int = 
                value.unknownFields.size

            override fun encode(writer: ProtoWriter, value: OtherMessageWithStatus) {
                writer.writeBytes(value.unknownFields)
            }

            override fun decode(reader: ProtoReader): OtherMessageWithStatus {
                val unknownFields = reader.forEachTag { tag ->
                    when (tag) {
                        else -> TagHandler.UNKNOWN_TAG
                    }
                }
                return OtherMessageWithStatus(
                    unknownFields = unknownFields
                )
            }
        }
    }

    enum class Status(private val value: Int) : WireEnum {
        A(1);

        override fun getValue(): Int = value

        companion object {
            @JvmField
            val ADAPTER: ProtoAdapter<Status> = object : EnumAdapter<Status>(
                Status::class.java
            ) {
                override fun fromValue(value: Int): Status = Status.fromValue(value)
            }

            @JvmStatic
            fun fromValue(value: Int): Status = when (value) {
                1 -> A
                else -> throw IllegalArgumentException("""Unexpected value: $value""")
            }
        }
    }
}