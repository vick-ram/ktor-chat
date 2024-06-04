package tech.vickram.models

import kotlinx.serialization.Serializable
import tech.vickram.utils.DateSerializer
import java.time.LocalDateTime

@Serializable
data class ChatModel(
    val chatId: String,
    val userId: String,
    val message: String,
    @Serializable(with = DateSerializer::class)
    val timestamp: LocalDateTime
)
