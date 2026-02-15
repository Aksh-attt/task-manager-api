package com.akshat.taskmanager.service;

import com.akshat.taskmanager.entity.Task;
import com.akshat.taskmanager.exception.ResourceNotFoundException;
import com.akshat.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + id));
    }

    public Task createTask(Task task) {
        return repository.save(task);
    }

    public Task updateTask(Long id, Task updated) {
        Task existing = getTaskById(id);
        existing.setTitle(updated.getTitle());
        existing.setDescription(updated.getDescription());
        return repository.save(existing);
    }

    public void deleteTask(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Task not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
