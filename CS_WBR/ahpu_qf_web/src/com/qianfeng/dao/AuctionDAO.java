package com.qianfeng.dao;

import java.sql.DriverManager;
import java.util.ArrayList;

import com.qianfeng.entity.Auction;

public class AuctionDAO {
	
	public java.util.List<Auction> getAll(){
		java.util.List<Auction> auctions = new ArrayList<Auction>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			java.sql.PreparedStatement preparedStatement = connection
					.prepareStatement("select * from auction");
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Auction auction = new Auction();
				
				auction.setAuctionid(resultSet.getInt("AUCTIONID"));
				auction.setAuctionname(resultSet.getString("AUCTIONNAME"));
				auction.setAuctionstartprice(resultSet.getDouble("AUCTIONSTARTPRICE"));
				auction.setAuctionupset(resultSet.getDouble("AUCTIONUPSET"));
				auction.setAuctionstarttime(resultSet.getTimestamp("AUCTIONSTARTTIME"));
				auction.setAuctionendtime(resultSet.getTimestamp("AUCTIONENDTIME"));
				auction.setAuctiondesc(resultSet.getString("AUCTIONDESC"));
				auctions.add(auction);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return auctions;
		
	}
}
