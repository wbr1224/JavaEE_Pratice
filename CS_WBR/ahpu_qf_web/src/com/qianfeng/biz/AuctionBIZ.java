package com.qianfeng.biz;

import com.qianfeng.dao.AuctionDAO;
import com.qianfeng.entity.Auction;

public class AuctionBIZ {
	AuctionDAO auctionDAO = new AuctionDAO();
	
	public java.util.List<Auction> getAll(){
		return auctionDAO.getAll();
	}
	
}
