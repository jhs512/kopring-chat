package com.ll.gb.domain.chat.room.controller

import com.ll.gb.domain.chat.room.dto.ChatRoomDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/chat/rooms")
class ApiV1ChatRoomController {
    @GetMapping
    fun getItems(): List<ChatRoomDto> {
        return listOf(
            ChatRoomDto(1, "room1"),
            ChatRoomDto(2, "room2"),
            ChatRoomDto(3, "room3"),
            ChatRoomDto(4, "room4"),
            ChatRoomDto(5, "room5"),
        )
    }
}