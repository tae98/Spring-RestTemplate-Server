package com.sparta.springresttemplateserver.Service;

import com.sparta.springresttemplateserver.Dto.ItemResponseDto;
import com.sparta.springresttemplateserver.Dto.UserRequestDto;
import com.sparta.springresttemplateserver.Entity.Item;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> itemList = Arrays.asList(
            new Item("Mac", 3_888_000),
            new Item("iPad", 1_230_000),
            new Item("iPhone", 1_550_000),
            new Item("Watch", 450_000),
            new Item("AirPods", 350_000)
    );

    public Item getCallObject(String query) {
        return null;
    }

    public ItemResponseDto getCallList() {
        return null;
    }

    public Item postCall(String query, UserRequestDto requestDto) {
        return null;
    }

    public ItemResponseDto exchangeCall(String token, UserRequestDto requestDto) {
        return null;
    }
}