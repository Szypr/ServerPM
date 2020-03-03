package szypr.com.github.task;

/**
 * Class defines task object's parameters
 * @author Mateusz Szyprowski
 *
 */

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	
//	private User userId;
	private String userId;
	private String groupId;
	private String title;
	private String comment;
	private Category category;
	private LocalDate createDate;
	private LocalDate finishDate;
	private Priority priority;
	private boolean finishStatus;
	
	
	public Task () {
		
	}


	public Task(Long id, String userId, String groupId, String title, String comment, Category category,
			LocalDate createDate, LocalDate finishDate, Priority priority, boolean finishStatus) {
		this.id = id;
		this.userId = userId;
		this.groupId = groupId;
		this.title = title;
		this.comment = comment;
		this.category = category;
		this.createDate = createDate;
		this.finishDate = finishDate;
		this.priority = priority;
		this.finishStatus = finishStatus;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public LocalDate getFinishDate() {
		return finishDate;
	}


	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}


	public Priority getPriority() {
		return priority;
	}


	public void setPriority(Priority priority) {
		this.priority = priority;
	}


	public boolean isFinishStatus() {
		return finishStatus;
	}


	public void setFinishStatus(boolean finishStatus) {
		this.finishStatus = finishStatus;
	}

}
