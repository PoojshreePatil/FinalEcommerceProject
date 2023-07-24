package FinalProject.Ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FinalProject.Ecommerce.Model.Demo;
import FinalProject.Ecommerce.Repository.DemoRepository;

@Service
public class Demoservice {
    @Autowired
    DemoRepository repo;
    public Object add;

    public void add(Demo d) {
        // repo.save(d);
        repo.save(d);
    }

    public List<Demo> show() {
        return repo.findAll();
    }
}