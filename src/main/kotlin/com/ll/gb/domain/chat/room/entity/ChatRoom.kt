package com.ll.gb.domain.chat.room.entity

import com.ll.gb.global.jpa.entity.BaseTime
import jakarta.persistence.Entity

@Entity
class ChatRoom(
    var title: String = ""
) : BaseTime()