/** The Data Access Object (DAO) pattern is a structural pattern that allows us to
    isolate the application/business layer from the persistence layer (usually a
    relational database but could be any other persistence mechanism) using an
    abstract API.
    The API hides from the application all the complexity of performing CRUD 
    operations in the underlying storage mechanism. This permits both layers to 
    evolve separately without knowing anything about each other.
*/

package com.liveeasyLogistics.load.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liveeasyLogistics.load.entities.Load;

public interface LoadDao extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(UUID shipperId);
}
