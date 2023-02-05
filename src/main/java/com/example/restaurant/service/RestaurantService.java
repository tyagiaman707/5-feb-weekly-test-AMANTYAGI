package com.example.restaurant.service;
import com.example.restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class RestaurantService {
    private static List<Restaurant> restaurants=new ArrayList<>(); // In-memory database
    private static Long restaurantCount = 0L;

    static {
        restaurants.add(new Restaurant(++restaurantCount,"Haldiram", "Modinagar", 9977694321L, "Indian", 20, "10:00 AM", "11:00 PM"));
        restaurants.add(new Restaurant(++restaurantCount,"Mithas", "Muradnagar",6543289210L, "Indian", 30, "09:00 PM", "10:00 PM"));
        restaurants.add(new Restaurant(++restaurantCount,"Vaango", "Muradnagar",9876543214L, "Indian", 25, "12:00 PM", "9:00 PM"));
        restaurants.add(new Restaurant(++restaurantCount,"MithaiWala", "Muradnagar", 8765432988L, "Indian", 35, "2:00 PM", "8:00 PM"));
        restaurants.add(new Restaurant(++restaurantCount,"Bikanerwala", "Muradnagar", 9567544899L, "Indian", 15, "1:00 PM", "7:00 PM"));
    }

    public List<Restaurant> findAll() { // Business Logic
        return restaurants;
    }
    public Restaurant findById(int id){
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getId() == id;
        Restaurant restaurant = restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }
    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
    public void deleteRestaurant(int id){
        Predicate<? super Restaurant> predicate = restaurant-> restaurant.getId()==id;
        restaurants.removeIf(predicate);
    }
    public void updateRestaurant(int id,Restaurant newRestaurant) {
        //step 1: find restaurant to be update
        //Step 2: update restaurant

        Restaurant restaurant=findById(id);// step 1

        restaurant.setId(newRestaurant.getId());
        restaurant.setName(newRestaurant.getName());
    }
}
