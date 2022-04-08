package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.ui.Model;

import java.util.List;

public interface UserService {
    void add(User user);

    void add(User user, Car car);

    List<User> getUserByCar(String model, int series);

    List<User> listUsers();
}
