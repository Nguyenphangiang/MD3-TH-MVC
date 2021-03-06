package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImpl implements CustomerService{
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Giang","a@gmail.com","Ha Noi"));
        customers.put(2,new Customer(2,"Phan","b@gmail.com","Ha Noi"));
        customers.put(3,new Customer(3,"Ky","c@gmail.com","Ha Noi"));
        customers.put(4,new Customer(4,"Martin","d@gmail.com","UK"));
        customers.put(5,new Customer(5,"Mike","e@gmail.com","US"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
