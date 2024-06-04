package tech.vickram.chat

import io.ktor.websocket.*
import tech.vickram.repo.MessageRepository

class ChatRoom(messageRepository: MessageRepository) {

    fun joinChat(
        username: String,
        socket: DefaultWebSocketSession
    ) {

    }

    fun leaveChat(
        username: String
    ) {

    }

    fun sendMessage(
        username: String,
        message: String
    ) {

    }
}