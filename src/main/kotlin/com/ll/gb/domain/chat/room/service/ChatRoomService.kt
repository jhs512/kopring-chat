package com.ll.gb.domain.chat.room.service

import com.ll.gb.domain.chat.room.entity.ChatRoom
import com.ll.gb.domain.chat.room.repository.ChatRoomRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ChatRoomService(
    private val chatRoomRepository: ChatRoomRepository
) {
    @Transactional
    fun make(title: String): ChatRoom {
        val chatRoom = ChatRoom(title = title)

        return chatRoomRepository.save(chatRoom)
    }

    fun count(): Long {
        return chatRoomRepository.count()
    }

    fun findAll(): List<ChatRoom> {
        return chatRoomRepository.findAll()
    }
}