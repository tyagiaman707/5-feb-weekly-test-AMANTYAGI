package com.example.restaurant.controller;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant-app")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/find-restaurant/id/{id}")
    public Restaurant findRestaurantById(@PathVariable int id) {
        return restaurantService.findById(id);
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurants() {
        return restaurantService.findAll();
    }

    @PutMapping("/update-restaurant/id/{id}")
    public void updateRestaurant(@PathVariable int id, @RequestBody Restaurant restaurant) {
        restaurantService.updateRestaurant(id, restaurant);
    }

    @DeleteMapping("/delete-restaurant/id/{id}")
    public void deleteRestaurant(@PathVariable int id) {
        restaurantService.deleteRestaurant(id);
    }
}
