package se.lexicon.todo_api.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.todo_api.entity.Attachment;

public interface AttachmentRepository extends CrudRepository<Attachment, Long> {

    // Custom query methods can be added here if needed
}
