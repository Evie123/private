package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.mapper.RoomMapper;
import com.hotel.pojo.Room;
import com.hotel.service.RoomService;

public class RoomServiceImpl implements RoomService {
	@Autowired
	RoomMapper roomMapper;
//	查询所有客房信息
	@Override
	public List<Room> queryRoom() {
		// TODO Auto-generated method stub
		return roomMapper.queryRoom();
	}

//	添加客房
	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub

	}

//	修改客房
	@Override
	public void updadeRoomById(Room room) {
		// TODO Auto-generated method stub

	}

//	删除客房
	@Override
	public void deleteRoomById(Room room) {
		// TODO Auto-generated method stub

	}

//	按房间号查询
	@Override
	public List<Room> queryRoomByNum(Room room) {
		// TODO Auto-generated method stub
		return roomMapper.queryRoomByNum(room);
	}

}
