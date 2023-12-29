package org.example.SpringDataBase.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;
import org.example.SpringDataBase.models.*;

@Repository
public interface AccountRepository extends JpaRepositoryExtension<Account,Long> {

 
}
