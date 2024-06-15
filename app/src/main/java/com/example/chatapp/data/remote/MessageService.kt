package com.example.chatapp.data.remote

import com.example.chatapp.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    companion object {
        const val BASE_URL = "http://192.168.194.37:8080"
    }

    sealed class EndPoint(val url: String) {
        object getAllMessages : EndPoint("$BASE_URL/messages")
    }
}