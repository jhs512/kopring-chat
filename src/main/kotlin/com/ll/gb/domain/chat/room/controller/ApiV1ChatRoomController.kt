package com.ll.gb.domain.chat.room.controller

import com.ll.gb.domain.chat.room.dto.ChatRoomDto
import com.ll.gb.domain.chat.room.service.ChatRoomService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/chat/rooms")
class ApiV1ChatRoomController(
    private val chatRoomService: ChatRoomService
) {
    @GetMapping
    fun getItems(): List<ChatRoomDto> {
        return chatRoomService
            .findAll()
            .map { ChatRoomDto(it) }
    }
}