package mx.infotec.dads.essence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.infotec.dads.essence.model.foundation.extention.SEAreaOfConcern;

/**
 * SEAreaOfConcernRepository
 * 
 * @author wisog
 *
 */
public interface SEAreaOfConcernRepository extends MongoRepository<SEAreaOfConcern, String> {

}
