package com.ll.gb.domain.chat.room.repository

import com.ll.gb.domain.chat.room.entity.ChatRoom
import org.springframework.data.jpa.repository.JpaRepository

interface ChatRoomRepository : JpaRepository<ChatRoom, Long> {

}
