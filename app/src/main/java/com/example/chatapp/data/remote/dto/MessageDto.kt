package com.example.chatapp.data.remote.dto

import com.example.chatapp.domain.model.Message
import kotlinx.serialization.Serializable
import java.sql.Date
import java.text.DateFormat

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String
) {
    fun toMessages(): Message {
        val date = Date(timestamp)
        val formatedDate = DateFormat.getDateInstance(DateFormat.DEFAULT).format(date)
        return Message(
            text = text,
            formattedTime = formatedDate,
            username = username
        )
    }
}