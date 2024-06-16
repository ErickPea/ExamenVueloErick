package com.examen.vuelos.IRepository;
import com.examen.vuelos.Entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UsersIRepository extends IBaseRepository<Users, Long>{
	/*
	@Query(value = "SELECT \r\n"
	    		+ "    u.id, \r\n"
	    		+ "    u.FirstName ,"
	    		+ "    u.LastName,"
	    		+ "    u.Email,"
	    		+ "    u.Password,"
	    		+ "    u.Birthdate,"
	    		+ "    r.role,"
	    		+ "    O.Office,"
	    		+ "FROM"
	    		+ " user u"
	    		+ "INNER JOIN "
	    		+ "    role r ON u.Role_id = r.id"
	          
	    	, nativeQuery = true)
	List<> getList();*/
}
