package szypr.com.github.api;

/**
 * Main REST class
 * @author Mateusz Szyprowski
 *
 */

import java.util.Optional;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import szypr.com.github.manager.TaskManager;
import szypr.com.github.task.Task;


@RestController
@RequestMapping("/api/tasks")
public class TaskApi {

	private TaskManager tasks;
	private LocalDateTime current = LocalDateTime.now();
	
	@Autowired
	public TaskApi(TaskManager tasks) {
		this.tasks = tasks;
	}

	@GetMapping("/all")
	public Iterable<Task> getAll() {
		return tasks.findAll();
	}

	@GetMapping
	public Optional<Task> getById(@RequestParam Long index) {
		return tasks.findById(index);
	}
	
	@GetMapping("/current")
	public LocalDateTime isCurrent() {
		return current;
	}
	
	@PostMapping
	public Task addTask(@RequestBody Task task) {
		current = LocalDateTime.now();
		return tasks.save(task);
	}
	
	@PutMapping
	public Task updateTask(@RequestBody Task task) {
		current = LocalDateTime.now();
		return tasks.save(task);
	}
	
	@DeleteMapping
	public void deleteTask(@RequestParam Long index) {
		current = LocalDateTime.now();
		tasks.deleteById(index);
	}
}
