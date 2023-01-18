package com.gunsoo.gunscafe.dto;

import com.gunsoo.gunscafe.model.Items;

public class ItemsDto {

    private Long id;

    private String name;

    private int price;

    private String category;

    private int stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ItemsDto(Long id, String name, int price, String category, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    //model → Dto로 전환
    public static ItemsDto from(Items items){
        return new ItemsDto(items.getId(), items.getName(), items.getPrice(), items.getCategory(), items.getStock());
    }

    //Dto → model로 전환
    public static Items toEntity(ItemsDto itemsDto){
        return Items.builder()
                .id(itemsDto.getId())
                .name(itemsDto.getName())
                .price(itemsDto.getPrice())
                .category(itemsDto.getCategory())
                .stock(itemsDto.getStock())
                .build();
    }

}
