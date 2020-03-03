package szypr.com.github.manager;

/**
 * Database communication class
 * @author Mateusz Szyprowski
 *
 */

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import szypr.com.github.task.Category;
import szypr.com.github.task.Priority;
import szypr.com.github.task.Task;
import szypr.com.github.task.TaskRepo;
//import szypr.com.github.task.User;

@Service
public class TaskManager {

	private TaskRepo taskRepo;

	@Autowired
	public TaskManager(TaskRepo taskRepo) {
		this.taskRepo = taskRepo;
	}

	public Optional<Task> findById(Long id) {
		return taskRepo.findById(id);
	}

	public Iterable<Task> findAll() {
		return taskRepo.findAll();
	}
	
	public Task save(Task task) {
		return taskRepo.save(task);
	}

	public void deleteById(Long id) {
		taskRepo.deleteById(id);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void fillDB() {

		save(new Task(1L, "Szyprowski", "Java", "Zadanie testowe", "jeśli wydzisz ten tekst to program dziala", Category.PRACA,
				LocalDate.now(), LocalDate.now().plusDays(2), Priority.WYSOKI, false));

		save(new Task(2L, "Szyprowski", "Java", "Zadanie testowe2", "jeśli wydzisz ten tekst to program dziala bardzo dobrze",
				Category.DOM, LocalDate.now().minusDays(1), LocalDate.now().plusDays(2), Priority.SREDNI, true));

	}
}
