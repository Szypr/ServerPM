package szypr.com.github.task;

/**
 * Interface for communication with database
 * 
 * @author Mateusz Szyprowski
 *
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import szypr.com.github.task.Task;

@Repository
public interface TaskRepo extends CrudRepository<Task, Long>{

}
