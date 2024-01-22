package Dao;

import java.util.ArrayList;

import MODEL.ADMIN;
import VIEW.ADMINVIEW1;

public class adminDAO implements daointerface<ADMIN> {
	
	public static adminDAO getInstace() {
		return new adminDAO();
	}

	public int them(ADMIN t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capnhap(ADMIN t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int xoa(ADMIN t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ADMIN selectById(ADMIN t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ADMIN> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ADMIN> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

} 


