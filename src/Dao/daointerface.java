package Dao;

import java.util.ArrayList;

public interface daointerface<T> {
	
		public int them(T t);
		
		public int capnhap(T t);
		
		public int xoa(T t);
		
		public ArrayList<T> selectAll();
		
		public T selectById(T t);
		
		public ArrayList<T> selectByCondition(String condition);

	}

