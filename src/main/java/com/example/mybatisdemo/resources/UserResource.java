package com.example.mybatisdemo.resources;
import com.example.mybatisdemo.mappers.UserMapper;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisdemo.models.User;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
    private UserMapper userMapper;

    public UserResource(UserMapper usersMapper) {
        this.userMapper = usersMapper;
    }

    // http://localhost:8080/rest/users
    @GetMapping()
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @PostMapping()
    public List<User> insert(@RequestBody User user) {

        userMapper.insert(user);

        return userMapper.findAll();
    }

    // http://localhost:8080/rest/users/6?name=sam&salary=42
    @PutMapping(path = "{id}")
    private List<User> update(
            @PathVariable("id") Integer id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Long salary) {

        userMapper.update(id, name, salary);
        return userMapper.findAll();

    }

    @DeleteMapping(path = "{id}")
    private List<User> delete(@PathVariable("id") Integer id) {

        userMapper.delete(id);
        return userMapper.findAll();

    }
}
