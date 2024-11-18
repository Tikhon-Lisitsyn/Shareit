package ru.practicum.item;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import ru.practicum.item.Item;
import ru.practicum.user.User;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    @JsonBackReference
    private Item item;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    private LocalDateTime created;
}
