package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ResultSetBean {

	private List<String> songNameList;
	private List<String> linkList;
	
	private ResultSet privateResultSet;
	
	
	public void addToSongNameList(String songName){
		
		songNameList.add(songName);
		
	}
	
	public void addToLinkList(String linkName){
		
		linkList.add(linkName);
		
	}
	
	public void createSongNameList(List<String> songNameList){
		this.songNameList = songNameList;

	}
	
	public void createLinkList(List<String> linkList){
		this.linkList = linkList;
	}
	
	public String getString(String column){
		
		try {
			return privateResultSet.getString(column);
		} catch (SQLException e) {
			e.printStackTrace();
			return "SQL Error";//Come back here
		}
		
	}

	public void compileData(ResultSet rs){

		try {
			while(rs.next()){
				addToSongNameList(rs.getString("song_name"));
				addToLinkList(rs.getString("link"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
}