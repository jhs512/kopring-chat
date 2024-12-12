package com.ll.gb.domain.chat.room.dto

import com.ll.gb.domain.chat.room.entity.ChatRoom
import java.time.LocalDateTime

data class ChatRoomDto(
    val id: Long,
    val createdAt: LocalDateTime,
    val modifiedAt: LocalDateTime,
    val title: String
) {
    constructor(chatRoom: ChatRoom) : this(
        id = chatRoom.id,
        createdAt = chatRoom.createdAt,
        modifiedAt = chatRoom.modifiedAt,
        title = chatRoom.title
    )
}
