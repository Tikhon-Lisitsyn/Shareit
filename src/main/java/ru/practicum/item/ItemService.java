package ru.practicum.item;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ItemService {

    Item addNew(Long userId, ItemDto itemDto);
    Item update(Long userId, ItemDto itemDto) throws BadRequestException;
    Optional<Item> getOne(Long itemId) throws BadRequestException;
    List<Item> getAll(Long userId) throws BadRequestException;
    List<Item> search(String text) throws BadRequestException;
}