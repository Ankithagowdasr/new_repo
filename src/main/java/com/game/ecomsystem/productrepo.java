package com.game.ecomsystem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface productrepo extends MongoRepository<product, String> {

	

}
