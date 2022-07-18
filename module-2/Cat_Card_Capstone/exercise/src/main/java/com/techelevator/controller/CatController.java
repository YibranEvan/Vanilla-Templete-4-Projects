package com.techelevator.controller;
import java.util.List;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatPic;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.model.CatFact;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.techelevator.dao.CatCardDao;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping ("/cards")
public class CatController {

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }
    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<CatCard> list() {
        return catCardDao.list();
    }
    @RequestMapping (path = "/{id}", method = RequestMethod.GET)
    public CatCard get(@PathVariable int id) throws CatCardNotFoundException {
        return catCardDao.get(id);
    }
    @RequestMapping (path = "/random", method = RequestMethod.GET)
    public CatCard makeNewCard() {
        CatFact a = catFactService.getFact();
        CatPic b = catPicService.getPic();
        CatCard c = new CatCard();
        c.setCatFact(a.getText());
        c.setImgUrl(b.getFile());
        return c;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping (method = RequestMethod.POST)
    public void save(@RequestBody CatCard catCard) {
        catCardDao.save(catCard);
    }
    @RequestMapping (path = "{/id}", method = RequestMethod.PUT)
    public void update(@Valid @RequestBody CatCard card, @PathVariable long id) throws CatCardNotFoundException {
        catCardDao.update(id, card);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping (method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) throws CatCardNotFoundException {
        catCardDao.delete(id);
    }

}
