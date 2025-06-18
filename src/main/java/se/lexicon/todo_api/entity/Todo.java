package se.lexicon.todo_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private  Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, length = 500)
    private String description;
    private boolean completed;
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime dueDate;

    @Transient
    // transient annotation is used to indicate that a field should not be persisted in the database.
    private boolean isAssigned;

    @ManyToOne
    @JoinColumn(name = "person_id",   nullable = false, unique = true)
    private Person person; // person_id

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
