package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;



@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;


    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list() {
        return dao.list();
    }

@RequestMapping(path = "/{?}", method = RequestMethod.GET)
public Auction get(int id) {
    if (Auction = id) {
        return dao.get(id);
    }
    return null;
    }
}

