package com.example.examtest.service;

import com.example.examtest.model.Room;
import com.example.examtest.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepo roomRepo;

    @Autowired
    public RoomService(RoomRepo roomRepo) {
        this.roomRepo = roomRepo;
    }

    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepo.findById(id).orElse(null);
    }

    public Room createRoom(Room room) {
        return roomRepo.save(room);
    }
}
